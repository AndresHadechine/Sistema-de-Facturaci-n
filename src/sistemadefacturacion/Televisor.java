package sistemadefacturacion;

public class Televisor extends Electrodomestico {

    float pulgadas;
    boolean sincronizador;

    public Televisor(char consumo, boolean procedenciaInternacional, float pulgadas, boolean sincornizador) {
        super(consumo, procedenciaInternacional);
    }

    @Override
    public float calcularPrecio() {

        switch (consumo) {
            case 'A':
                precio = 450000;
                break;
            case 'B':
                precio = 350000;
                break;
            case 'C':
                precio = 250000;
                break;
            default:
                System.out.println("Consumo no valido");
                break;
        }
        
        if(procedenciaInternacional == true){
            precio = precio + 350000;
        }else{
            precio = precio + 250000;
        }

        if (pulgadas > 40) {
            precio = (float) (precio + (precio * 0.30));
        }

        if (sincronizador = true) {
            precio = precio + 250000;
        }
        return precio;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public char getConsumo() {
        return consumo;
    }

    @Override
    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    @Override
    public boolean isProcedenciaInternacional() {
        return procedenciaInternacional;
    }

    @Override
    public void setProcedenciaInternacional(boolean procedenciaInternacional) {
        this.procedenciaInternacional = procedenciaInternacional;
    }

}
