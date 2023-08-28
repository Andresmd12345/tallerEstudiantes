public class Estudiante {

    private String Nombre;
    private int Edad;
    private String Correo;
    private String TipoEstudiante;
    private int Semestre;
    private int nota1;
    private double nota2;
    private double nota3;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getTipoEstudiante() {
        return TipoEstudiante;
    }

    public void setTipoEstudiante(String tipoEstudiante) {
        TipoEstudiante = tipoEstudiante;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        Semestre = semestre;
    }
}
