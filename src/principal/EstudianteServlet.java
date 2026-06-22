package servlet;

import java.io.IOException;

import dao.EstudianteDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Estudiante;

@WebServlet("/EstudianteServlet")
public class EstudianteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String curso = request.getParameter("curso");
        String fechaRegistro = request.getParameter("fechaRegistro");

        Estudiante estudiante = new Estudiante();

        estudiante.setNombre(nombre);
        estudiante.setCorreo(correo);
        estudiante.setTelefono(telefono);
        estudiante.setCurso(curso);
        estudiante.setFechaRegistro(fechaRegistro);

        EstudianteDAO dao = new EstudianteDAO();

        dao.insertar(estudiante);

        response.setContentType("text/html");

        response.getWriter().println("<h2>Estudiante registrado correctamente</h2>");
        response.getWriter().println("<p>Nombre: " + nombre + "</p>");
        response.getWriter().println("<p>Correo: " + correo + "</p>");
        response.getWriter().println("<p>Curso: " + curso + "</p>");
    }
}