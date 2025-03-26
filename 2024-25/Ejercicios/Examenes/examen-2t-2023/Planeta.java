import java.util.ArrayList;

public class Planeta 
{
    private String nombre;
    private int saltos;
    private ArrayList<SerVivo> habitantes;
    
    public Planeta(String nombre, int saltos, ArrayList<SerVivo> habitantes) {
        this.nombre = nombre;
        this.saltos = saltos;
        this.habitantes = habitantes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSaltos() {
        return saltos;
    }
    public void setSaltos(int saltos) {
        this.saltos = saltos;
    }
    public ArrayList<SerVivo> getHabitantes() {
        return habitantes;
    }
    public void setHabitantes(ArrayList<SerVivo> habitantes) {
        this.habitantes = habitantes;
    }
    @Override
    public String toString() {
        return "Planeta [nombre=" + nombre + ", saltos=" + saltos + ", habitantes=" + habitantes + "]";
    }
    
    
}
