import java.util.ArrayList;

public class Alumno {
    //Atributos

    public String nombre;
    public String matricula;
    ArrayList <Prestamo> prestamos;
    //costructor

    public Alumno (){
        prestamos = new ArrayList<>();
    }

    public Alumno (String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
        prestamos = new ArrayList<>();
    }

    //metodos

    public void solicitarPrestamo(Biblioteca biblio,Publicacion p, String fechaEntrega, String fechaPrestamo) throws Exception{
        //ALumno solicita prestado un libro o revcista se solicita de la biblioteca , o id de la biblioteca parecido a verifica voleto
        try {
            Prestamo solicitud = biblio.solicitarPublicacion(p);
            Prestamo prestamo = new Prestamo(solicitud.p,fechaPrestamo,fechaEntrega);
            prestamos.add(prestamo);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Prestamo No exitoso para PUBLI: " + p);
        }
        System.out.println("Prestamos de Alumno: " + nombre +" con matricula: " + matricula + " prestado = "+prestamos.size() +" \n"+prestamos+"\n");
    }

    public void imprimeLibrosPorGenero(){
        Prestamo[] presta = new Prestamo[15];
        Publicacion[] publi = new Publicacion[15];
        for (int i = 0; i < prestamos.size(); i++){
            presta[i] = prestamos.get(i);
            publi[i] = presta[i].p;
            if( publi[i] instanceof Libro){
                Libro lib = (Libro) publi[i];
                System.out.println("Publicacion de LIBROS -> "+lib);
            }else if (publi[i] instanceof Revista) {
                Revista rev = (Revista) publi[i];
                System.out.println("Publicacion de REVISTAS -> " + rev);
            }else if(publi[i] instanceof Periodico){
                Periodico per = (Periodico) publi[i];
                System.out.println("Publicacion de PERIODICOS -> " + per);    
            }
        }
    }

    public void imprimePrestamos(){
        System.out.println("Prestamos de Alumno: " + nombre +" con matricula: " + matricula + " prestado = "+prestamos.size() +" \n"+prestamos+"\n");
    }

    public void imprimeRevistas(){
        Prestamo[] presta = new Prestamo[15];
        Publicacion[] publi = new Publicacion[15];
        for (int i = 0; i < prestamos.size(); i++){
            presta[i] = prestamos.get(i);
            publi[i] = presta[i].p;
             if (publi[i] instanceof Revista) {
                Revista rev = (Revista) publi[i];
                System.out.println("Publicacion de REVISTAS -> " + rev);
            }
    }
}

    public void imprimePeriodicos(){

        Prestamo[] presta = new Prestamo[15];
        Publicacion[] publi = new Publicacion[15];
        for (int i = 0; i < prestamos.size(); i++){
            presta[i] = prestamos.get(i);
            publi[i] = presta[i].p;
             if (publi[i] instanceof Revista) {
                Periodico per = (Periodico) publi[i];
                System.out.println("Publicacion de PERIODICOS -> " + per);    
            }
    }

    }
}
