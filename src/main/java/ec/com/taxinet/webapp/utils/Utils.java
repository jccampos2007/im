/**
 * 
 */
package ec.com.taxinet.webapp.utils;

/**
 * @author Juan Campos
 *
 */
public class Utils {
	
	public static final Integer ACTION_CREATE = 1;
	public static final Integer ACTION_EDIT = 2;
	public static final Integer ACTION_DELETE = 3;
	
	//ESTATUS SERVICIOS
	public static String[] STATUS_SERVICES ={
		"",
		"Solicitud de Carrera Enviada",			//1
		"Lo sentimos, todas nuestras unidades están ocupadas.",						//2
		"Solicitud Aceptada",					//3
		"Solicitud Cancelada Por el Pasajero",	//4
		"Solicitud Cancelada Por el Conductor",	//5
		"Reasignando Solictud",					//6
		"Conductor en Camino",					//7
		"Conductor en Posición",				//8
		"Pasajero Recogido",					//9
		"Taximetro inicio",						//10
		"Taximetro Finalizó",					//11
		"Fin del Servicio"						//12
	};
	
	public static String getString(int index){
	    return STATUS_SERVICES[index];
	}

	/**
	 * 
	 */
	public Utils() {
		// TODO Auto-generated constructor stub
	}
	
	

}
