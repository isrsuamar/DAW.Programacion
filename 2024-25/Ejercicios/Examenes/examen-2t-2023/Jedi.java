import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Jedi extends SerVivo implements ILuchador
{
    private int nivelFuerza;
    private Map<String, Integer> habilidadesEspeciales;
    private List<ITransporte> naves;
    private Droide droide;
    private Planeta planetaOrigen;

    public Jedi(String nombre, int defensa, int nivelFuerza, List<ITransporte> naves, 
        Droide droide, Planeta planetaOrigen) 
    {
        super(nombre, defensa);

        this.nivelFuerza = nivelFuerza;
        this.naves = naves;
        this.droide = droide;
        this.planetaOrigen = planetaOrigen;

        this.habilidadesEspeciales = new HashMap<>();


        this.habilidadesEspeciales.put("ForceHeal", 1);
        this.habilidadesEspeciales.put("JediMindTrick", 2);
        this.habilidadesEspeciales.put("ForceReflex", 3);
        this.habilidadesEspeciales.put("Superataque", 4);
    }


    public int getNivelFuerza() {
        return nivelFuerza;
    }



    public void setNivelFuerza(int nivelFuerza) {
        this.nivelFuerza = nivelFuerza;
    }



    public Map<String, Integer> getHabilidadesEspeciales() {
        return habilidadesEspeciales;
    }



    public void setHabilidadesEspeciales(Map<String, Integer> habilidadesEspeciales) {
        this.habilidadesEspeciales = habilidadesEspeciales;
    }



    public List<ITransporte> getNaves() {
        return naves;
    }



    public void setNaves(List<ITransporte> naves) {
        this.naves = naves;
    }



    public Droide getDroide() {
        return droide;
    }



    public void setDroide(Droide droide) {
        this.droide = droide;
    }



    public Planeta getPlanetaOrigen() {
        return planetaOrigen;
    }



    public void setPlanetaOrigen(Planeta planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }



    public int calcularDanioDefensivo()
    {
        return getNivelFuerza() + calcularHabilidadEspecial("Superataque");
    }

    private int calcularHabilidadEspecial(String nombreHabilidad)
    {
        Random random = new Random();

        int numAleatorio = random.nextInt(4) + 1;
        int valorHabilidad = getHabilidadesEspeciales().get(nombreHabilidad);

        if(numAleatorio != valorHabilidad)
        {
            return 0;
        }

        return valorHabilidad;
    }

    @Override
    public void recibirDanio(int danio) 
    {
        Random random = new Random();
       
        int porcentaje = random.nextInt(100) + 1;

        String forceReflex = "ForceReflex";
        int valorForceFlex = getHabilidadesEspeciales().get(forceReflex);
        
        if(!(porcentaje < 20 && calcularHabilidadEspecial(forceReflex) == valorForceFlex))
        {
            setSalud(getSalud() - danio);
        }

        System.out.println("Salud jedi " + getNombre() + ": " + this.getSalud());
    }

    // Jedi
    @Override
    public void luchar(SerVivo oponente)
    {
        // Los Jedi utilizan su defensa y habilidades especiales para luchar
        int danio = calcularDanioDefensivo();
        
        // Aplica el daño al oponente
        oponente.recibirDanio(danio);
    }
}