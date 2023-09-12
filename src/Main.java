public class Main {


    public static void main(String[] args) {
        Curso curso = new Curso();
        curso = inicializaDatosPrueba();


        curso.mostrarInformacionEstudiantes();

        double promedioEstudiante1 = curso.getEstudiante1().calcularDefinitiva(curso.getEstudiante1().getNota1(),
                curso.getEstudiante1().getNota2(), curso.getEstudiante1().getNota3());

        double promedioEstudiante2 = curso.getEstudiante2().calcularDefinitiva(curso.getEstudiante2().getNota1(),
                curso.getEstudiante2().getNota2(), curso.getEstudiante2().getNota3());

        double promedioEstudiante3 = curso.getEstudiante3().calcularDefinitiva(curso.getEstudiante3().getNota1(),
                curso.getEstudiante3().getNota2(), curso.getEstudiante3().getNota3());

        double promedioCurso = curso.obtenerPromedioCurso();
        curso.mostrarPromedioCurso(promedioCurso);

        int promedioEdades = curso.ObtenerEdadPromedio();
        curso.mostrarEdadPromedio(promedioEdades);

        double promedioNota1Estudiantes = curso.obtenerNota1Estudiantes();
        curso.mostrarNota1Estudiantes(promedioNota1Estudiantes);

        double[] notas = {curso.getEstudiante1().getNota1(), curso.getEstudiante1().getNota2(),
                curso.getEstudiante3().getNota3(), curso.getEstudiante2().getNota1(), curso.getEstudiante2().getNota2(),
                curso.getEstudiante2().getNota3(), curso.getEstudiante3().getNota1(), curso.getEstudiante3().getNota2(),
                curso.getEstudiante3().getNota3()
        };
        double notaMayor = curso.obtenerNotaMayor(notas);
        curso.mostrarNotaMayor(notaMayor);

        double notaMenor = curso.obtenerNotaMenor(notas);
        curso.mostrarNotaMenor(notaMenor);

        boolean cursoEstudiante1 = curso.getDocente().calcularAproboCurso(promedioEstudiante1);

        boolean cursoEstudiante2 = curso.getDocente().calcularAproboCurso(promedioEstudiante2);

        boolean cursoEstudiante3 = curso.getDocente().calcularAproboCurso(promedioEstudiante3);

        boolean[] aprobacionesCurso = {cursoEstudiante1, cursoEstudiante2, cursoEstudiante3};

        double porcentajeAprobados = curso.obtenerPorcentajeAprobados(aprobacionesCurso);
        curso.mostrarPorcentajeAprobados(porcentajeAprobados);

        double porcentajeNoAprobados =curso.obtenerPorcentajeNoAprobados(aprobacionesCurso);
        curso.mostrarPorcentajeNoAprobados(porcentajeNoAprobados);


    }



    private static Curso inicializaDatosPrueba(){


        Estudiante estudiante1 = crearEstudiantePorConstructor("Juan",
                17,
                "juan@gmail.com",
                "antiguo",
                3,
                3,
                3.5,
                4.5,
                0)
                ;
        Estudiante estudiante2 = crearEstudiantePorConstructor(
                "Maria",
                15,
                "pepita@gmail.com",
                "nuevo",
                4,
                2,
                2.5,
                4.5,
                0
        );
        Estudiante estudiante3 = crearEstudiantePorConstructor(
                "pepe",
                20,
                "pepe@gmail.com",
                "antiguo",
                4,
                4,
                2.5,
                4.5,
                0
        );


        Docente docente = new Docente(
                "carlos",
                25,
                "Carlos@gmail.com"

        );
        Curso curso = new Curso(
                "Matematicas",
                2,
                4,
                5,
                "nocturna"
        );

        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        curso.setDocente(docente);


        return curso;

    }
    private static Estudiante crearEstudiantePorConstructor(String nombre, int edad, String tipoEstudiante,
                                                            String correo, int semestre,
                                                            double nota1, double nota2, double nota3 ,double promedio){
        Estudiante estudiante = new Estudiante(nombre,edad,correo,tipoEstudiante,semestre,nota1,nota2,nota3,promedio);
        return estudiante;
    }
}































