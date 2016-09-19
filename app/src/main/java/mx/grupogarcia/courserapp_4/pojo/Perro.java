package mx.grupogarcia.courserapp_4.pojo;

/**
 * Created by Luis Garcia  on 17/09/2016.
 */

public class Perro {


    private int id;
    private String nombre;
    private int likes;
    private int foto;

    public Perro(String nombre, int likes, int foto,int id) {
        this.nombre = nombre;
        this.likes = likes;
        this.foto = foto;
        this.id = id;
    }

    public Perro()
    {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getFoto() {
        return foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String likes()
    {
        ;
        return Integer.toString(this.likes);
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
