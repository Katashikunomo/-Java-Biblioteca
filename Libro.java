import java.util.*;

public class Libro extends Publicacion implements Comparable<Libro>{
    //Atreibuutos
    public String titulo;
    public String autor;
    public String genero;

    //cosntrctor

    public Libro(){}

    public Libro(int id, boolean estado,String titulo, String autor, String genero){
        super(id, estado);
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    //metods

    public void comparaLibro(Libro lib){
        int comparacion;
        comparacion=compareTo(lib);
        if (comparacion == 1) {
            System.out.println("ROMANCE : " + lib);
        }else if(comparacion == 2){
            System.out.println("TERROR : " + lib);
        }else if (comparacion == 3) {
            System.out.println("FICCION : " + lib);
        }else{
            System.out.println("ERROR SIN COMPARACION");
        }
    }

    public String toString(){
        String papa = super.toString();
        String hijo = papa + ", Titulo: " + titulo + ", Autor: " + autor + ", Genero: " + genero;

        return hijo;
    }

    //@Override
    public int compareTo(Libro o) {
      
        
        if (o.genero.toUpperCase() == "ROMANCE") {
            return 1;
        }else if(o.genero.toUpperCase() == "TERROR"){
            return 2;
        }else if(o.genero.toUpperCase() == "FICCION"){
            return 3;
        }

        return 0;
    }
}
