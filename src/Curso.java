public class Curso {
    private String nombre;
    private int semestre;
    private int grupo;
    private int creditos;
    private String jornada;
    private Estudiante estudiante1;
    private Estudiante estudiante2;
    private Estudiante estudiante3;
    private Docente docente;

    public Curso() {

    }

    public Curso(String nombre, int semestre, int grupo, int creditos, String jornada) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.grupo = grupo;
        this.creditos = creditos;
        this.jornada = jornada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Estudiante getEstudiante1() {
        return estudiante1;
    }

    public void setEstudiante1(Estudiante estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public Estudiante getEstudiante2() {
        return estudiante2;
    }

    public void setEstudiante2(Estudiante estudiante2) {
        this.estudiante2 = estudiante2;
    }

    public Estudiante getEstudiante3() {
        return estudiante3;
    }

    public void setEstudiante3(Estudiante estudiante3) {
        this.estudiante3 = estudiante3;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }


    public void mostrarInformacionEstudiantes() {
        String informacionEstudiante1 = getEstudiante1().obtenerInformacion();
        String informacionEstudiante2 = getEstudiante2().obtenerInformacion();
        String informacionEstudiante3 = getEstudiante3().obtenerInformacion();
        System.out.println("Informacion del estudiante 1: " + informacionEstudiante1);
        System.out.println("Informacion del estudiante 2: " + informacionEstudiante2);
        System.out.println("Informacion del estudiante 3: " + informacionEstudiante3);
    }

    public double obtenerPromedioCurso() {
        double promedioCurso = docente.calcularDefinitivaGrupo(getEstudiante1().calcularDefinitiva(getEstudiante1().getNota1(),
                getEstudiante1().getNota2(), getEstudiante1().getNota3()), getEstudiante2().calcularDefinitiva(getEstudiante2().getNota1()
                , getEstudiante2().getNota2(), getEstudiante2().getNota3()), getEstudiante3().calcularDefinitiva(getEstudiante3().getNota1(),
                getEstudiante3().getNota2(),
                getEstudiante3().getNota3()));

        return promedioCurso;
    }

    public void mostrarPromedioCurso(double promedioCurso) {
        System.out.println("El promedio Del curso es: " + promedioCurso);
    }

    public int ObtenerEdadPromedio() {
        int edadPromedio = docente.calcularEdadPromedio(getEstudiante1().getEdad(), getEstudiante2().getEdad()
                , getEstudiante3().getEdad());

        return edadPromedio;
    }
    public void mostrarEdadPromedio(int edadPromedio){
        System.out.println("la edad promedio del curso es: "+edadPromedio);
    }
    public double obtenerNota1Estudiantes(){
        double nota1Promedio = docente.calcularDefinitivaNota1(getEstudiante1().getNota1(),getEstudiante2().getNota1(),
                getEstudiante3().getNota1());

        return nota1Promedio;
    }
    public void mostrarNota1Estudiantes(double nota1Promedio){
        System.out.println("el promedio de la nota1 de los estudiantes es:"+nota1Promedio);

    }
    public double obtenerNotaMayor(double [] notas){
        double notaMayor = docente.calcularNotaMayor(notas);

        return notaMayor;

    }
    public void mostrarNotaMayor(double notaMayor){
        System.out.println("la nota mayor de curso es:"+notaMayor);
    }
    public double obtenerNotaMenor(double [] notas){
        double notaMenor = docente.calcularNotaMenor(notas);

        return notaMenor;
    }
    public void mostrarNotaMenor(double notaMenor){
        System.out.println("la nota menor del curso es:"+notaMenor);
    }
    public double obtenerPorcentajeAprobados(boolean [] aprobacionesCurso){
        double porcentajeAprobados = docente.calcularPorcentajeAprobados(aprobacionesCurso);

        return porcentajeAprobados;
    }
    public void mostrarPorcentajeAprobados(double porcentajeAprobados){
        System.out.println("el procentaje de Estudiantes Aprobados fue de :"+porcentajeAprobados);
    }
    public double obtenerPorcentajeNoAprobados(boolean [] aprobacionesCurso){
        double porcentajeNoAprobados = docente.calcularPorcentajeNoAprobados(aprobacionesCurso);

        return porcentajeNoAprobados;
    }
    public void mostrarPorcentajeNoAprobados(double porcentajeNoAprobados){
        System.out.println("el porcenatje de Estudiantes Que no Aprobaron Fue de: "+porcentajeNoAprobados);
    }
}


