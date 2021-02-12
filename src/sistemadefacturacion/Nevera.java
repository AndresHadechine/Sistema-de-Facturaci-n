package sistemadefacturacion;

public class Nevera extends Electrodomestico {

    float capacidadLitros;

    public Nevera(char consumo, boolean procedenciaInternacional, float capacidadListros) {
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

        if (procedenciaInternacional == true) {
            precio = precio + 350000;
        } else {
            precio = precio + 250000;
        }

        if (capacidadLitros > 120) {

            int porcentaje = (int) ((capacidadLitros - 120) / 10);

            precio = precio + (precio * (porcentaje / 100));
        }

        return precio;
    }

    public float getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(float capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
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
