public class Docente {
    private String nombre;
    private int edad;
    private String correo;

    public Docente(){

    }

    public Docente(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public double calcularDefinitivaGrupo(double promedioestudiante1, double promedioestudiante2, double promedioestudiante3) {
        double promedioGrupo = 0;
        promedioGrupo = (promedioestudiante1 + promedioestudiante2 + promedioestudiante3) / 3;
        return promedioGrupo;

    }
    public int calcularEdadPromedio(int edad1, int edad2, int edad3) {
        int promedioEdades = 0;
        promedioEdades = (edad1 + edad2 + edad3) / 3;
        return promedioEdades;

    }
    public double calcularDefinitivaNota1(double notaEstudiante11, double notaEstudiante12, double notaEstudiante13) {
        double promedioNota1 = 0;
        promedioNota1 = (notaEstudiante11 + notaEstudiante12 + notaEstudiante13) / 3;
        return promedioNota1;

    }
    public double calculaNotaMAyor(double[] notas) {
        double notaMayor = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
            }
        }
        return notaMayor;
    }
    public double calcularNotaMenor(double[] notas) {
        double notaMenor = 5;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
        }
        return notaMenor;
    }
    public boolean calcularAproboCurso(double promedioEstudiante1) {
        if (promedioEstudiante1 >= 3 && promedioEstudiante1 <= 5) {
            return true;
        } else {
            return false;
        }
    }
    public double calcularPorcentajeAprobados(boolean[] aprobacionesCurso) {
        double subtotal = 0;
        for (int i = 0; i < aprobacionesCurso.length; i++) {

            if (aprobacionesCurso[i]) {
                subtotal++;
            }

        }
        return subtotal / 3.0 * 100;

    }
    public double calcularPorcentajeNoAprobados(boolean[] aprobacionesCurso) {
        double subtotal = 0;
        for (int i = 0; i < aprobacionesCurso.length; i++) {

            if (!aprobacionesCurso[i]) {
                subtotal++;
            }

        }
        return subtotal / 3.0 * 100;


    }
    public String calcularEstudianteMayor4 (Estudiante estudiante) {
        int contador =0;
        if (estudiante.getNota1() >4){
            contador++;

        }
        if (estudiante.getNota2() >4){
            contador++;

        }
        if (estudiante.getNota3() >4){
            contador++;

        }
        if (contador ==3){
            return "El estudiante "+estudiante.getNombre()+" tiene todas sus notas sobre 4";
        }
        else {
            return "El estudiante "+estudiante.getNombre()+" no tiene todas sus notas sobre 4";
        }
    }
    public  String calcularNotaMayorEstudiante (Estudiante estudiante){
        double[] notas={
                estudiante.getNota1(), estudiante.getNota2(), estudiante.getNota3()
        };
        double notaMayor=0;
        notaMayor=calculaNotaMAyor(notas);
        return "el estudiante "+estudiante.getNombre()+" su nota es de: "+notaMayor;
    }
}



