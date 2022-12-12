package util;

/**
 * Metodos de utilidad para simplificar las queries realizadas en las clases 
 * que implementan la logica de negocio:
 * Se implementa como una clase abstracta para que la clase derivada implemente los detalles
 * relativos a la conexion y a la estructura de la base de datos a crear, y a la vez
 * pueda usar los metodos que se definen aqui.
 * 
 * <br>La mayoria de los metodos de utilidad utilizan apache commons-dbutils que gestiona todo el manejo
 * de resultsets, su mapeo a objetos y las excepciones permitiendo un codigo mucho mas limpio 
 * en las clases de la capa de negocio y DAOs.
 */
public abstract class DbUtil {

}
