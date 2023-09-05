public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(
                "Juan",
                17,
                "juan@gmail.com",
                "antiguo",
                3,
                3,
                3.5,
                4.5
        );
        Estudiante estudiante2 = new Estudiante(
                "Maria",
                15,
                "pepita@gmail.com",
                "nuevo",
                4,
                2,
                2.5,
                4.5
        );
        Estudiante estudiante3 = new Estudiante(
                "pepe",
                20,
                "pepe@gmail.com",
                "antiguo",
                4,
                4,
                2.5,
                4.5
        );
        Estudiante estudiante = new Estudiante();

        Docente docente = new Docente(
                "carlos",
                25,
                "Carlos@gmail.com"

        );
        Curso curso = new Curso(
                "",
                2,
                3,
                4,
                "diurna"
        );

        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        curso.setDocente(docente);



        double promedioEstudiante1 = estudiante.calcularDefinitiva(estudiante2.getNota1(),
                estudiante1.getNota2(), estudiante1.getNota3());


        double promedioEstudiante2 = estudiante.calcularDefinitiva(estudiante2.getNota1(),
                estudiante2.getNota2(), estudiante2.getNota3());


        double promedioEstudiante3 = estudiante.calcularDefinitiva(estudiante3.getNota1(),
                estudiante3.getNota2(), estudiante3.getNota3());

        double promedioGrupo = docente.calcularDefinitivaGrupo(promedioEstudiante1,
                promedioEstudiante2, promedioEstudiante3);

        int promedioEdades = docente.calcularEdadPromedio(estudiante1.getEdad(),
                estudiante2.getEdad(), estudiante3.getEdad());

        double promedioNota1Estudiantes = docente.calcularDefinitivaNota1(estudiante1.getNota1(),
                estudiante2.getNota2(), estudiante3.getNota1());

        double[] notas = {estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3(), estudiante2.getNota1(), estudiante2.getNota2(),
                estudiante2.getNota3(), estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3()};

        double notaMayor = docente.calculaNotaMAyor(notas);

        double notaMenor = docente.calcularNotaMenor(notas);

        boolean cursoEstudiante1 = docente.calcularAproboCurso(promedioEstudiante1);
        System.out.println("El estudiante aprobo: " + estudiante1);

        boolean cursoEstudiante2 = docente.calcularAproboCurso(promedioEstudiante2);

        boolean cursoEstudiante3 = docente.calcularAproboCurso(promedioEstudiante3);

        boolean[] aprobacionesCurso = {cursoEstudiante1, cursoEstudiante2, cursoEstudiante3};

        double porcentaje = docente.calcularPorcentajeAprobados(aprobacionesCurso);
        System.out.println("el porcentaje de personas que aprobaron el curso son:" + porcentaje);

        double porcentajeNo = docente.calcularPorcentajeNoAprobados(aprobacionesCurso);
        System.out.println("el porcentaje de personas que no aprobaron el curso son:" + porcentajeNo);

        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3};

        String[] estudiantes4 = new String[3];

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes4[i] = docente.calcularEstudianteMayor4(estudiantes[i]);
            System.out.println(estudiantes4[i]);


        }
        String[] notasMayorEstudiantes = new String[3];
        for (int i = 0; i < estudiantes.length; i++) {
            notasMayorEstudiantes[i] = docente.calcularNotaMayorEstudiante(estudiantes[i]);
            System.out.println(notasMayorEstudiantes[i]);


        }

    }
}






















