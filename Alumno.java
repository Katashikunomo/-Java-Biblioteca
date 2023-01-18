import java.util.ArrayList;
import java.util.*;
import java.io.*;

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
            if (biblio.publicaciones.contains(p) || prestamos.size() > 5) {
                System.out.println("Prestamo No exitoso para PUBLICACION: " + p+"\n");
                try {
                    System.out.println("No puedes pedir mas de 5 Publicaciones prestadas");
                    prestamos.remove(5);
                    
                } catch (Exception f) {
                    // TODO: handle exception
                }
               
            }else{
                System.out.println("Prestamo No exitoso La PUBLICACION no se encuentra en Biblioteca: " + p+"");
            }
        }
        System.out.println("+++++++++++++++++++++++++ Solicitud de Prestamo +++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Prestamos de Alumno: " + nombre +" con matricula: " + matricula + " prestado = "+prestamos.size() +"");
        for(int i = 0; i<prestamos.size(); i++){
            System.out.println(+i+1+" --> "+prestamos.get(i));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

    public void devolverPrestamo(Biblioteca biblio,Publicacion pre){
        Prestamo publi = new Prestamo(); 
        ArrayList<Publicacion> publicacionesArray = new ArrayList<>();
        Publicacion p2 ;
        if(prestamos.size() > 0){
            for(int i = 0; i<prestamos.size();i++){
                publi = prestamos.get(i);
                p2 = publi.p;
                publicacionesArray.add(p2);
                if (publi.p.estado == true) {
                    prestamos.remove(publi);
                    break;
                }      
            }
            if (publicacionesArray.contains(pre) == (pre.estado== false)) {
                System.out.println("-----Libro prestado para devolver= "+pre);
                biblio.devuelvePublicacion(pre);
                System.out.println("Se ha devuelto correctamente!! " + pre);

            }else{
                System.out.println(">!La publicacion "+pre+" que intenats devolver no la tienes !!");
        }
            } else{
                System.out.println("¡¡No tienes libros para devolver!!");
            }
    }

    public void imprimeLibrosPorGenero(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">> Imprimiendo libros por Genero para alumno " + nombre +" con matricula: " + matricula+" total prestados= " + prestamos.size()+" <<");
        Prestamo[] presta = new Prestamo[prestamos.size()];
        Publicacion[] publi = new Publicacion[prestamos.size()];
        for (int i = 0; i < prestamos.size(); i++){
            presta[i] = prestamos.get(i);
            publi[i] = presta[i].p;
            if( publi[i] instanceof Libro){
                Libro lib = (Libro) publi[i];
                if (lib.genero == "Romance") {
                    System.out.println("ROMANCE --> " +lib);
                }else if (lib.genero == "Terror") {
                    System.out.println("TERROR --> " + lib);
                }else if(lib.genero == "Ficcion"){
                    System.out.println("FICCION --> " + lib);
                }
               //System.out.println("Publicacion de LIBROS -> "+lib);
            //}else if (publi[i] instanceof Revista) {
              //  Revista rev = (Revista) publi[i];
               // System.out.println("Publicacion de REVISTAS -> " + rev);
            //}else if(publi[i] instanceof Periodico){
              //  Periodico per = (Periodico) publi[i];
              //  System.out.println("Publicacion de PERIODICOS -> " + per);    
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("\n");
    }

    public void imprimeLibrosPorGeneroS(){
        Libro compar = new Libro();
        compar.comparaLibro(compar);
        System.out.println(">> Imprimiendo libros por Genero para alumno " + nombre +" con matricula: " + matricula+" <<");
        Prestamo[] presta = new Prestamo[15];
        Publicacion[] publi = new Publicacion[15];
        for (int i = 0; i < prestamos.size(); i++){
            presta[i] = prestamos.get(i);
            publi[i] = presta[i].p;
            if( publi[i] instanceof Libro){
                Libro lib = (Libro) publi[i];
                compar.comparaLibro(lib);
                //System.out.println("Publicacion de LIBROS -> "+ );
        }
    }
        
    }

    public void imprimePrestamos(){
        System.out.println("Prestamos de Alumno: " + nombre +" con matricula: " + matricula + " prestado = "+prestamos.size() +" \n"+prestamos+"\n");
    }

    public void imprimeRevistas(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">> Imprimiendo Revistas para alumno " + nombre +" con matricula: " + matricula+" <<");
        Prestamo[] presta = new Prestamo[prestamos.size()];
        Publicacion[] publi = new Publicacion[15];
        for (int i = 0; i < prestamos.size(); i++){
            presta[i] = prestamos.get(i);
            publi[i] = presta[i].p;
             if (publi[i] instanceof Revista) {
                Revista rev = (Revista) publi[i];
                System.out.println("Publicacion de REVISTAS -> " +i+"-"+ rev);
            }
    }
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
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
