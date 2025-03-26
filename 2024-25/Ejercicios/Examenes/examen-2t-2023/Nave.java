import java.util.ArrayList;

public class Nave implements ITransporte 
{
    private String modelo;
    private double velocidadMaxima;
    private boolean activa;
    private int numeroSaltos;
    private ArrayList<SerVivo> tripulantes;

    public Nave(String modelo, double velocidadMaxima, boolean activa, int numeroSaltos,
            ArrayList<SerVivo> tripulantes) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.activa = activa;
        this.numeroSaltos = numeroSaltos;
        this.tripulantes = tripulantes;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getNumeroSaltos() {
        return numeroSaltos;
    }

    public void setNumeroSaltos(int numeroSaltos) {
        this.numeroSaltos = numeroSaltos;
    }

    public ArrayList<SerVivo> getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(ArrayList<SerVivo> tripulantes) {
        this.tripulantes = tripulantes;
    }

    @Override
    public String toString() {
        return "Nave [modelo=" + modelo + ", velocidadMaxima=" + velocidadMaxima + ", activa=" + activa
                + ", numeroSaltos=" + numeroSaltos + ", tripulantes=" + tripulantes + "]";
    }

    @Override
    public void despegar() 
    {   
        System.out.println("Despegando...");
    }

    @Override
    public void aterrizar(int numeroSaltos) 
    {
      System.out.println("Aterrizando...");
      this.setNumeroSaltos(getNumeroSaltos() - numeroSaltos);
    }
    
}
