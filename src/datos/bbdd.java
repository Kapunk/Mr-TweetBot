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
 
 /**
  * Se ejecutara solo la primera vez para crear la BBDD y darle la configuracion inicial
  * @throws SQLException
  */
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
 
 public static java.sql.ResultSet consultarBBDD(String consulta) throws SQLException{
	 
	   EmbeddedDataSource embeddedDataSource = new EmbeddedDataSource();
	   embeddedDataSource.setDatabaseName("mrtweetbot");
	   Connection con =embeddedDataSource.getConnection();
	 
	   java.sql.ResultSet rs =  con.createStatement().executeQuery(consulta);
	   ResultSetMetaData metadata = ((java.sql.ResultSet) rs).getMetaData();
	   
	 //Imprimimos la cabecera de la tabla
       int columnas = metadata.getColumnCount();
       for (int i = 1; i <= columnas; i++) {
           System.out.format("%15s", metadata.getColumnName(i) + " || ");
       }

       while (rs.next()) {
           //Imprimimos cada una de las filas de la tabla
           System.out.println("");
           for (int j = 1; j <= columnas; j++) {
                System.out.format("%15s", rs.getString(j) + " || ");
           }
       }


       if (con != null)  con.close();
	
	   return rs;
 }
 
 public static void insertarEnBBDD (String insertar) throws SQLException{
   EmbeddedDataSource embeddedDataSource = new EmbeddedDataSource();
   embeddedDataSource.setDatabaseName("mrtweetbot");
   embeddedDataSource.setCreateDatabase("create"); 

   Connection con = embeddedDataSource.getConnection();
      
   con.createStatement().execute(insertar);
   con.close();
	 
	 
 }
 
 
 
}


