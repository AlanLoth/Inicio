package BD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Usuario {
 
public static boolean agregarUsuario(String nombre,String contra){
    boolean agregado=false;
    try {
    cDatos c = new cDatos();
    c.conectar();
    Connection con = c.getConexion();
    if(con!=null){
        Statement st;
        st = con.createStatement();
        st.executeUpdate("INSERT INTO usuarios(`usuario`,`contraseña`) VALUES ('"+nombre+"','"+contra+"')");
        agregado=true;
        st.close();
    }
   c.cierraConexion();
  } catch (SQLException e) {
   agregado=false;
   e.printStackTrace();
  }
  return agregado;
 }
}