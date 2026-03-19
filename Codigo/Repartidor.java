public class Repartidor {
    private String nombre;
    private int id;

public Repartidor(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
}

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

   public String toString() { return "Repartidor{id =" + id + ", nombre ='" + nombre + "'}";
}

}
