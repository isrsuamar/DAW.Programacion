import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Sith extends SerVivo implements ILuchador
{
    private int nivelOscuridad;
    private Map<String, Integer> habilidadesOscuras;

    public Sith(String nombre, int defensa, int nivelOscuridad)
    {
        super(nombre, defensa);

        this.nivelOscuridad = nivelOscuridad;
        
        habilidadesOscuras = new HashMap<>();
        habilidadesOscuras.put("DarkInfluence", 1);
        habilidadesOscuras.put("TorrentOfHatred", 2);
        habilidadesOscuras.put("ForceStrangulation", 3);
    }
 
    public int getNivelOscuridad() {
        return nivelOscuridad;
    }

    public void setNivelOscuridad(int nivelOscuridad) {
        this.nivelOscuridad = nivelOscuridad;
    }

    public Map<String, Integer> getHabilidadesOscuras() {
        return habilidadesOscuras;
    }


    public void setHabilidadesOscuras(Map<String, Integer> habilidadesOscuras) {
        this.habilidadesOscuras = habilidadesOscuras;
    }


    public int calcularDanioAgresivo()
    {
        return getNivelOscuridad() + calcularHabilidadOscura();
    }

    
    private int calcularHabilidadOscura(String nombreHabilidad)
    {
        Random random = new Random();

        int numAleatorio = random.nextInt(3) + 1;
        int valorHabilidad = getHabilidadesOscuras().get(nombreHabilidad);

        if(numAleatorio != valorHabilidad)
        {
            return 0;
        }

        return valorHabilidad;
    }

    private int calcularHabilidadOscura()
    {
        Random random = new Random();
        int numAleatorio = random.nextInt(3) + 1;

        for (Map.Entry<String, Integer> valor : getHabilidadesOscuras().entrySet()) 
        {
            if(valor.getValue() == numAleatorio)
            {
                return valor.getValue();
            }
        }

        return 0;
    }

    @Override
    public void recibirDanio(int danio) 
    {
        Random random = new Random();
       
        int porcentaje = random.nextInt(100) + 1;

        String darkInfluence = "DarkInfluence";
        int valorDarkInfluence = getHabilidadesOscuras().get(darkInfluence);
        
        if(!(porcentaje < 10 && calcularHabilidadOscura(darkInfluence) == valorDarkInfluence))
        {
            setSalud(getSalud() - danio);
        }

        System.out.println("Salud sith: " + getNombre() + ": " + this.getSalud());
    }
     
      // Sith
      public void luchar(SerVivo oponente)
      {
          // Los Sith utilizan agresivamente su poder para atacar
          int danio = calcularDanioAgresivo();

          // Aplica el daño al oponente
          oponente.recibirDanio(danio);
      }
}
