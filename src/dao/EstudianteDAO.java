package dao;

import conexion.ConexionBD;
import modelo.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EstudianteDAO {

    public void registrarEstudiante(Estudiante estudiante) {

        String sql = """
                INSERT INTO estudiantes
                (nombre, correo, telefono, curso, fecha_registro)
                VALUES (?, ?, ?, ?, ?)
                """;

        try {

            Connection conexion = ConexionBD.conectar();

            PreparedStatement sentencia =
                    conexion.prepareStatement(sql);

            sentencia.setString(1, estudiante.getNombre());
            sentencia.setString(2, estudiante.getCorreo());
            sentencia.setString(3, estudiante.getTelefono());
            sentencia.setString(4, estudiante.getCurso());
            sentencia.setString(5, estudiante.getFechaRegistro());

            sentencia.executeUpdate();

            System.out.println(
                    "Estudiante registrado correctamente.");

            conexion.close();

        }

        catch (SQLException e) {

            System.out.println(
                    "Error al registrar estudiante.");

            e.printStackTrace();

        }

    }

}