public class Droide 
{
    private String nombre;

    public Droide(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean viajarAPlaneta(Nave nave, Planeta planeta)
    {
        if(nave.getNumeroSaltos() >= planeta.getSaltos())
        {
            nave.despegar();

            nave.aterrizar(planeta.getSaltos());
        }

        return true;
    }

    public void repararNave(Nave nave)
    {
        nave.setActiva(true);
        nave.setNumeroSaltos(7);
    }

    @Override
    public String toString() {
        return "Droide [nombre=" + nombre + "]";
    }
}
