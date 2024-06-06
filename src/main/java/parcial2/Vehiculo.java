package parcial2;

public class Vehiculo { 
    
    String marca; 
    String modelo; 
    int año; 

    public Vehiculo(String marca, String modelo, int año) { //O(1) Constante.
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public String getMarca() { //O(1) Constante.
        return marca;
    } 
    
    public void setMarca(String marca) { //O(1) Constante.
        this.marca = marca; 
    } 
    
    public String getModelo() { //O(1) Constante.
        return modelo;
    } 
    
    public void setModelo(String modelo) { //O(1) Constante.
        this.modelo = modelo; 
    } 
    
    public int getAño() { //O(1) Constante.
        return año;
    } 
    
    public void setAño(int año) { //O(1) Constante.
        this.año = año; 
    } 
    
    public String imprimirInformacion() { //O(1) Constante.
        return marca + modelo + año;
    } 
}
