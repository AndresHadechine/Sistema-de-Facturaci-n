
package sistemadefacturacion;

public class Electrodomestico {
    
    float precio;
    char consumo;
    boolean procedenciaInternacional; 

    public Electrodomestico(char consumo, boolean procedenciaInternacional) {
        this.consumo = consumo;
        this.procedenciaInternacional = procedenciaInternacional;
    }
    
    public float calcularPrecio(){
       
        
        return precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public boolean isProcedenciaInternacional() {
        return procedenciaInternacional;
    }

    public void setProcedenciaInternacional(boolean procedenciaInternacional) {
        this.procedenciaInternacional = procedenciaInternacional;
    }
    
    
}
