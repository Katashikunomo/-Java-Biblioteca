public class Main {
    public static void main(String[] args) throws Exception {
       
       
        //Creando Alumnos
        System.out.println("------------------ Creando Alumnos ------------");
        Alumno juan = new Alumno("Juan Gonzalo", "2356485235");
        Alumno jesus = new Alumno("Jesus Reyes", "2203024384");
       
        //Creando libros 
        System.out.println("------------------Creando Libros--------------");
        Libro lib1 = new Libro(131, true, "Las manzanas","Di caprio", "Romance");
        Libro lib2 = new Libro(132, true, "El estruendo romance","Julio tabares", "Romance");
        Libro lib3 = new Libro(133, true, "Las asafatas", "Holito melchor", "Terror");
        Libro lib4 = new Libro(134,true, "Las orquidisas", "Fernando Barreira", "Ficcion");
        Libro lib5 = new Libro(135, true, "El diluvio", "Federico","Ficcion");
        Libro lib6 = new Libro(136, true, "Nemosito", "Disney", "Romance");
        Libro lib7 = new Libro(137,true,"Pedrito","Julio sanches","Ficcion");
        Libro lib8 = new Libro(138,true,"El libro de las aguas","Loser jose","Romance");
        Libro lib9 = new Libro(139, true, "La tormenta fugaz", "SInedro", "Terror");
        Libro lib10 = new Libro(1031, true, "Juanito","Pinocho", "Romance");

        //Creando Revistas
        System.out.println("-----------------Creandoi Revistas -------------");
        Revista rev1 = new Revista(141, true, "La Decendencia", "Nationalgiograpic", 1);
        Revista rev2 = new Revista(142, true,"La contaminacion", "Nationalgiograpic", 2);
        Revista rev3 = new Revista(143, true, "Vida Animal", "Mundo E", 12);


        //Creando Periodiscos
        System.out.println("------------------ Creando Periodiscos --------------");
        Periodico per1 = new Periodico(151, true, "El Universal", "El julio", "Puebla");
        Periodico per2 = new Periodico(152, true,"EL terreno final de las zumba", "El economista","CDMX" );
        Periodico per3 = new Periodico(153, true, "El hombre que penso que podia volar", "El Universal", "CDMX");
        Periodico per4 = new Periodico(154,true, "Lo dejo sin aliento", "EL Universal", "Guerrero");
        Periodico per5 = new Periodico(155,true,"Expropiacion petrolera 2018", "Xataka", "Guadalajara");
        Periodico per6 = new Periodico(156, true, "El perro que salvo la vida de un niño", "Milenio", "CDMX");


        //Creando Biblioteca
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++ Creando Biblioteca ++++++++++++++++++++++++++++++++++");
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("Registrando publicaciones...");
        biblioteca.registrarPublicacion(rev1);
        biblioteca.registrarPublicacion(rev2);
        biblioteca.registrarPublicacion(rev3);
        biblioteca.registrarPublicacion(lib1);
        biblioteca.registrarPublicacion(lib2);
        biblioteca.registrarPublicacion(lib3);
        biblioteca.registrarPublicacion(lib4);
        biblioteca.registrarPublicacion(lib5);
        biblioteca.registrarPublicacion(lib6);
        biblioteca.registrarPublicacion(lib7);
        biblioteca.registrarPublicacion(lib8);
        biblioteca.registrarPublicacion(lib9);
        biblioteca.registrarPublicacion(lib10);
        biblioteca.registrarPublicacion(per1);
        biblioteca.registrarPublicacion(per2);
        biblioteca.registrarPublicacion(per5);
        biblioteca.registrarPublicacion(per6);
        biblioteca.registrarPublicacion(per6);  

        biblioteca.imprimeBiblioteca();

        Alumno hinojos = new Alumno("Andres","2203042156");
        hinojos.solicitarPrestamo(biblioteca, lib1, "10 marzo", "5 enero");

        biblioteca.imprimeBiblioteca();

        hinojos.solicitarPrestamo(biblioteca, lib2, "12 abril", "2 marzo");
        hinojos.solicitarPrestamo(biblioteca, lib3, "12 abril", "2 marzo");

        hinojos.imprimeLibrosPorGenero();

        jesus.solicitarPrestamo(biblioteca, per6, "12 marzo", "5 enero");
        jesus.solicitarPrestamo(biblioteca, per6, "12 ener", "12abr");
        jesus.solicitarPrestamo(biblioteca, lib1, "12ener", "12 abr");
        jesus.solicitarPrestamo(biblioteca, lib2, "12 marzo", "12 abr");
        jesus.imprimeLibrosPorGenero();

        biblioteca.imprimeBiblioteca();

        juan.solicitarPrestamo(biblioteca, per4, "8 enero", "5 mayo");

        hinojos.solicitarPrestamo(biblioteca, rev1,"14 enero","5 abril");
        hinojos.solicitarPrestamo(biblioteca, rev3,"14 enero","5 abril");
        hinojos.imprimeRevistas();
       // hinojos.imprimeLibrosPorGeneroS();
       hinojos.devolverPrestamo(biblioteca, rev3);
       hinojos.devolverPrestamo(biblioteca, rev3);
       
       biblioteca.imprimeBiblioteca();
       
       jesus.imprimeLibrosPorGenero();
       hinojos.imprimeLibrosPorGenero();

       hinojos.solicitarPrestamo(biblioteca, rev2, null, null);
       hinojos.solicitarPrestamo(biblioteca, per5, null, null);
       hinojos.solicitarPrestamo(biblioteca, per5, null, null);
    }
}
