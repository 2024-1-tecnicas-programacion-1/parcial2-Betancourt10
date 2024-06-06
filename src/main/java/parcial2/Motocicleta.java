package parcial2;

public class Motocicleta extends Vehiculo { 
    
    public Motocicleta(String marca, String modelo, int anio) { //O(1) Constante.
        super(marca, modelo, anio);
    }
    
    private TipoMotocicleta tipoMotocicleta; 
    private TipoCombustible tipoCombustible; 
    
    public Motocicleta(TipoMotocicleta tipoMotocicleta, String marca, String modelo, int año) { //O(1) Constante.
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta; 
        this.tipoCombustible = tipoCombustible; 
    } 

    public TipoMotocicleta getTipoMotocicleta() { //O(1) Constante.
        return tipoMotocicleta;
    }

    public TipoCombustible getTipoCombustible() { //O(1) Constante.
        return tipoCombustible;
    }
 
    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) { //O(1) Constante.
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) { //O(1) Constante.
        this.tipoCombustible = tipoCombustible;
    }
    
    public String imprimirInformacion() { //O(1) Constante.
        return marca + modelo + año + tipoMotocicleta + tipoCombustible;
    }
    
}
