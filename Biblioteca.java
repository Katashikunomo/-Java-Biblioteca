import java.util.ArrayList;

public class Biblioteca extends Exception{
    //Atributs
    ArrayList <Publicacion> publicaciones;

    //Constrvctr
    //public Biblioteca(){
     //   publicaciones = new ArrayList<>();
    //}

    public Biblioteca(){
        publicaciones = new ArrayList<>();
    }

    public void registrarPublicacion(Publicacion publicacion){   
            if (publicaciones.contains(publicacion)) {
                System.out.println("La publicacion ya se encuentra agregada a la biblioteca");   
            }else{
        System.out.println(" La publicacion : " + publicacion);
            publicaciones.add(publicacion);
        System.out.println("Se agrego correctamente a la biblioteca");
            }
        }

    public void imprimeBiblioteca(){
        System.out.println("================= BIBLIOTECA ================");
        for (int i = 0; i < publicaciones.size(); i++){
            System.out.println(i+1 + " - " + publicaciones.get(i));
        }
        System.out.println("================= ========== ================");
    }

    public Prestamo solicitarPublicacion(Publicacion p){
        Prestamo presta;
        //Publicacion p = new Publicacion(id,false);
        if (publicaciones.contains(p)) {
             //p = publicaciones.get();
            if (p.estado == true){
                p.estado = false;
                presta = new Prestamo(p,null,null);
                return presta;
            }else{
                //throw new PrestamoNoexitosoException("Prestamo No exitoso");
                //throw new PrestamoNoexitosoException("Prestamo No exitoso");
                return null;
            }
        }
        //crear objeto prestamo
        return null;
    }


  



    //metods
}
