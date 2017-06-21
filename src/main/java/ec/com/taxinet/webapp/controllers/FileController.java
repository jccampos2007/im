/**
 * 
 */
package ec.com.taxinet.webapp.controllers;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * @author Juan Campos
 *
 */
@Controller
public class FileController {
	
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);
	
	@Value("${webadmin}")
	private String host;
	/*
	@Autowired
	ServletContext servletContext;*/
	/**
	 * 
	 */
	public FileController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/echofile/{id_request}", method = RequestMethod.POST, produces = {"application/json"})
    public @ResponseBody HashMap<String, Object> echoFile(
    		@PathVariable int id_request,
    		MultipartHttpServletRequest request,
            HttpServletResponse response) throws Exception {
		
		
        MultipartFile multipartFile = request.getFile("file");
        Long size = multipartFile.getSize();
        String contentType = multipartFile.getContentType();
        InputStream stream = multipartFile.getInputStream();
        byte[] bytes = IOUtils.toByteArray(stream);
    
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("fileoriginalsize", size);
        map.put("contenttype", contentType);
        map.put("base64", new String(Base64Utils.encode(bytes)));
        
        try {
        	//logger.info(resource.getURL().getPath());
        	String nombreOriginalArchivo = multipartFile.getOriginalFilename(); 
        	
        	File uploads = new File(System.getProperty("jboss.server.data.dir"), "file_request/" + id_request);
            // Create the folder "files" if necessary
            String tomcatFolderPath = System.getProperty("jboss.server.data.dir");
            File filesFolder = new File(tomcatFolderPath + File.separator + "file_request/" + id_request);
            logger.info("\n metodo: echoFile"
				+"\nuploads =" + uploads
				+"\nfilesFolder =" + filesFolder
				+"\nnombreOriginalArchivo =" + nombreOriginalArchivo);
            if ( ! filesFolder.exists()) {
                filesFolder.mkdirs();
            }
            
            multipartFile.transferTo(new File(uploads, multipartFile.getOriginalFilename()));            
            map.put("files", host+File.separator+nombreOriginalArchivo);
        	        	
           
       } catch (Exception e) {
            logger.error("Error al copiar fichero", e);
            throw e;
       }
    
        return map;
    }

}
