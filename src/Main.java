public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(17);
        estudiante1.setCorreo("juan@gmail.com");
        estudiante1.setTipoEstudiante("antiguo");
        estudiante1.setSemestre(3);
        estudiante1.setNota1(3);
        estudiante1.setNota2(3.5);
        estudiante1.setNota3(4.5);


        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Maria");
        estudiante2.setEdad(15);
        estudiante2.setCorreo("pepita@gmail.com");
        estudiante2.setTipoEstudiante("nuevo");
        estudiante2.setSemestre(0);
        estudiante2.setNota1(2);
        estudiante2.setNota2(2.5);
        estudiante2.setNota3(4.5);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("pepe");
        estudiante3.setEdad(20);
        estudiante3.setCorreo("pepe@gmail.com");
        estudiante3.setTipoEstudiante("antiguo");
        estudiante3.setSemestre(4);
        estudiante3.setNota1(4);
        estudiante3.setNota2(2.5);
        estudiante3.setNota3(4.5);

        double promedioEstudiante1 = calcularDefinitiva(estudiante2.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());


        double promedioEstudiante2 = calcularDefinitiva(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());


        double promedioEstudiante3 = calcularDefinitiva(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());

        double promedioGrupo = calcularDefinitivaGrupo(promedioEstudiante1, promedioEstudiante2, promedioEstudiante3);

        int promedioEdades = calcularEdadPromedio(estudiante1.getEdad(), estudiante2.getEdad(), estudiante3.getEdad());

        double promedioNota1Estudiantes = calcularDefinitivaNota1(estudiante1.getNota1(), estudiante2.getNota2(), estudiante3.getNota1());

        double[] notas = {estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3(), estudiante2.getNota1(), estudiante2.getNota2(),
                estudiante2.getNota3(), estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3()};

        double notaMayor = calculaNotaMAyor(notas);

        double notaMenor = calcularNotaMenor(notas);

        boolean cursoEstudiante1 = calcularAproboCurso(promedioEstudiante1);
        System.out.println("El estudiante aprobo: " + estudiante1);

        boolean cursoEstudiante2 = calcularAproboCurso(promedioEstudiante2);

        boolean cursoEstudiante3 = calcularAproboCurso(promedioEstudiante3);

        boolean[] aprobacionesCurso = {cursoEstudiante1, cursoEstudiante2, cursoEstudiante3};

        double porcentaje = calcularPorcentajeAprobados(aprobacionesCurso);
        System.out.println("el porcentaje de personas que aprobaron el curso son:" + porcentaje);

        double porcentajeNo = calcularPorcentajeNoAprobados(aprobacionesCurso);
        System.out.println("el porcentaje de personas que no aprobaron el curso son:" + porcentajeNo);

        Estudiante [] estudiantes={estudiante1,estudiante2,estudiante3};

        String [] estudiantes4= new String[3];

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes4[i]=calcularEstudianteMayor4(estudiantes[i]);
            System.out.println(estudiantes4[i]);


        }
        String [] notasMayorEstudiantes= new String[3];
        for (int i = 0; i < estudiantes.length; i++) {
            notasMayorEstudiantes[i]=calcularNotaMayorEstudiante(estudiantes[i]);
            System.out.println(notasMayorEstudiantes[i]);


        }

    }


    private static double calcularDefinitiva(double nota1, double nota2, double nota3) {
        double promedio = 0;
        promedio = (nota1 + nota2 + nota3) / 3;
        return promedio;

    }

    private static double calcularDefinitivaGrupo(double promedioestudiante1, double promedioestudiante2, double promedioestudiante3) {
        double promedioGrupo = 0;
        promedioGrupo = (promedioestudiante1 + promedioestudiante2 + promedioestudiante3) / 3;
        return promedioGrupo;

    }

    private static int calcularEdadPromedio(int edad1, int edad2, int edad3) {
        int promedioEdades = 0;
        promedioEdades = (edad1 + edad2 + edad3) / 3;
        return promedioEdades;

    }

    private static double calcularDefinitivaNota1(double notaEstudiante11, double notaEstudiante12, double notaEstudiante13) {
        double promedioNota1 = 0;
        promedioNota1 = (notaEstudiante11 + notaEstudiante12 + notaEstudiante13) / 3;
        return promedioNota1;

    }

    private static double calculaNotaMAyor(double[] notas) {
        double notaMayor = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
            }
        }
        return notaMayor;
    }

    private static double calcularNotaMenor(double[] notas) {
        double notaMenor = 5;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
        }
        return notaMenor;
    }

    private static boolean calcularAproboCurso(double promedioEstudiante1) {
        if (promedioEstudiante1 >= 3 && promedioEstudiante1 <= 5) {
            return true;
        } else {
            return false;
        }
    }

    private static double calcularPorcentajeAprobados(boolean[] aprobacionesCurso) {
        double subtotal = 0;
        for (int i = 0; i < aprobacionesCurso.length; i++) {

            if (aprobacionesCurso[i]) {
                subtotal++;
            }

        }
        return subtotal / 3.0 * 100;

    }

    private static double calcularPorcentajeNoAprobados(boolean[] aprobacionesCurso) {
        double subtotal = 0;
        for (int i = 0; i < aprobacionesCurso.length; i++) {

            if (!aprobacionesCurso[i]) {
                subtotal++;
            }

        }
        return subtotal / 3.0 * 100;


    }
    private static String calcularEstudianteMayor4 (Estudiante estudiante) {
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
    private static String calcularNotaMayorEstudiante (Estudiante estudiante){
        double[] notas={
                estudiante.getNota1(), estudiante.getNota2(), estudiante.getNota3()
        };
        double notaMayor=0;
        notaMayor=calculaNotaMAyor(notas);
        return "el estudiante "+estudiante.getNombre()+" su nota es de: "+notaMayor;
    }
}

