public abstract class SerVivo
{
    private String nombre;
    private int defensa;
    private int salud;

    public SerVivo(String nombre, int defensa)
    {
        this.nombre = nombre;
        this.defensa = defensa;
        this.salud = 10;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "SerVivo [nombre=" + nombre + ", defensa=" + defensa + ", salud=" + salud + "]";
    }

    /*
     * 
     */
    abstract void recibirDanio(int danio);
} 