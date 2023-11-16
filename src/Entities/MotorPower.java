package Entities;

public class MotorPower extends VeiculoInteligente {

    private boolean SUV;

    public MotorPower(Double maxFuel, boolean SUV) {
        super(maxFuel);
        this.SUV = SUV;
    }

    @Override
    public String toString() {
        String SUV = this.SUV ? "Sim" : "Não";
        return String.format(super.toString() + "\nÉ uma SUV? " + SUV);
    }

    @Override
    public void controlarVelocidade(boolean areaUrbana) {
        if (!SUV || velocidade < 25 || !areaUrbana) {
            velocidade *= 2;
        }
    }

    @Override
    public void abastecer(Double quantidadeLitros) {
        super.abastecer(quantidadeLitros);

        if (gasolina < 10) {
            gasolina = maxGasolina;
            System.out.printf("Tanque de combustivel completo. Novo nivel: %s litros%n", gasolina);
        }
    }

    public boolean isSUV() {
        return SUV;
    }

    public void setSUV(boolean SUV) {
        this.SUV = SUV;
    }
}
