/**
 * Publicacion
 */
public class Publicacion {
    //Atributs
    public int id;
    public boolean estado;


    //constrctr
    public Publicacion(){}

    public Publicacion(int id, boolean estado){
        this.id = id;
        this.estado = estado;
    }

    //metodos;

    public String toString(){
        String esatdoDisposicion;
        if (estado) {
            esatdoDisposicion = "Disponible";
        }else{
            esatdoDisposicion = "Prestado";
        }

        String est= "ID: " + id + "," +
                    "Estado: " + esatdoDisposicion;
        return est;
    }
}