package datos;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.apache.derby.iapi.sql.ResultSet;
import org.apache.derby.jdbc.EmbeddedDataSource;
 
public class bbdd {
 
 /**
  * @param args
  * @throws ClassNotFoundException
  * @throws SQLException
  */
 public static void main(String[] args){
 
  	
 }
 
 public static void crearBBDD() throws SQLException{
	 
	EmbeddedDataSource embeddedDataSource = new EmbeddedDataSource();
    embeddedDataSource.setDatabaseName("mrtweetbot");
    embeddedDataSource.setCreateDatabase("create"); 
 
    Connection con = embeddedDataSource.getConnection();
    con.createStatement().execute("create table usuario( id_usuario INT PRIMARY KEY, " +
                                            "nombre varchar(20), " + 
                                            "apellidos varchar(20), " + 
                                            "password varchar(20) )");
    
    con.createStatement().execute("insert into usuario values " + 
                                            "(5, 'Carlos', 'Garcia', 'notodocodigo') ," +
                                            "(6, 'Pepe', 'Gómez', 'contraseña')");
    con.close();
    System.out.println("Se ha creado la tabla correctamente");
	 
 }
 
 public static ResultSetMetaData consultarBBDD(String consulta) throws SQLException{
	 
	   EmbeddedDataSource embeddedDataSource = new EmbeddedDataSource();
	   embeddedDataSource.setDatabaseName("bbddnotodocodigo");
	   Connection con =embeddedDataSource.getConnection();
	 
	   ResultSet rs = (ResultSet) con.createStatement().executeQuery(consulta);
	   ResultSetMetaData metadata = ((java.sql.ResultSet) rs).getMetaData();
	
	   return metadata;
 }
 
 
 
}


