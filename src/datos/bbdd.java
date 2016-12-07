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
 public static void main(String[] args) throws SQLException{
	 
	 crearBBDD();
	 consultarBBDD("select * from usuario");
 
  	
 }
 
 public static void crearBBDD() throws SQLException{
	 
//	EmbeddedDataSource embeddedDataSource = new EmbeddedDataSource();
//    embeddedDataSource.setDatabaseName("mrtweetbot");
//    embeddedDataSource.setCreateDatabase("create"); 
// 
//    Connection con = embeddedDataSource.getConnection();
//    con.createStatement().execute("create table usuario( id_usuario INT PRIMARY KEY, " +
//                                            "usuario varchar(20), " + 
//                                            "password varchar(20) )");
//    
//    con.createStatement().execute("insert into usuario values " + 
//                                            "(1, 'kepa', 'kepa')");
//    con.close();
//    System.out.println("Se ha creado la tabla correctamente");
	 
 }
 
 public static ResultSetMetaData consultarBBDD(String consulta) throws SQLException{
	 
	   EmbeddedDataSource embeddedDataSource = new EmbeddedDataSource();
	   embeddedDataSource.setDatabaseName("mrtweetbot");
	   Connection con =embeddedDataSource.getConnection();
	 
	   java.sql.ResultSet rs =  con.createStatement().executeQuery(consulta);
	   ResultSetMetaData metadata = ((java.sql.ResultSet) rs).getMetaData();
	
	   return metadata;
 }
 
 public static void insertarEnBBDD (String insertar) throws SQLException{
   EmbeddedDataSource embeddedDataSource = new EmbeddedDataSource();
   embeddedDataSource.setDatabaseName("mrtweetbot");
   embeddedDataSource.setCreateDatabase("create"); 

   Connection con = embeddedDataSource.getConnection();
      
   con.createStatement().execute(insertar);
   con.close();
   System.out.println("Se ha creado la tabla correctamente");
	 
	 
 }
 
 
 
}


