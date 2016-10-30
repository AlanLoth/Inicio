package Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BD.Usuario;
import BD.setsgets;
public class Registro extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String nombre=request.getParameter("nombre");
  String contra=request.getParameter("contra");
  if(!nombre.equalsIgnoreCase("") && !contra.equalsIgnoreCase("")){
   setsgets busuario = new setsgets(nombre, contra);
   boolean sw = Usuario.agregarUsuario(nombre, contra);
   if(sw){
    request.getRequestDispatcher("msg.jsp").forward(request, response);
   }else{
    PrintWriter out=response.getWriter();
    out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
   }
  }
 }
}