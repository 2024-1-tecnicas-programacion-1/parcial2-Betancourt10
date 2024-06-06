package parcial2;

public class Automovil extends Vehiculo { 
    
    public Automovil(String marca, String modelo, int anio) { //O(1) Constante.
        super(marca, modelo, anio);
    }
    
    private int numeroPuertas; 
    private TipoCombustible tipoCombustible; 

    public Automovil(int numeroPuertas, TipoCombustible tipoCombustible, String marca, String modelo, int año) { //O(1) Constante.
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    } 

    public int getNumeroPuertas() { //O(1) Constante.
        return numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() { //O(1) Constante.
        return tipoCombustible;
    }

    public void setNumeroPuertas(int numeroPuertas) { //O(1) Constante.
        this.numeroPuertas = numeroPuertas;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) { //O(1) Constante.
        this.tipoCombustible = tipoCombustible;
    }
    
    
    @Override
    public String imprimirInformacion() { //O(1) Constante.
        return marca + modelo + año + numeroPuertas + tipoCombustible;
    } 
    
}
