package modelo;

public class Estudiante {

    private int idEstudiante;
    private String nombre;
    private String correo;
    private String telefono;
    private String curso;
    private String fechaRegistro;

    public Estudiante() {

    }

    public Estudiante(String nombre, String correo, String telefono,
                       String curso, String fechaRegistro) {

        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.curso = curso;
        this.fechaRegistro = fechaRegistro;

    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}