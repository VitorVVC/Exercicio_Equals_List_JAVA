package Entities;

public class MotorPower extends VeiculoInteligente {

    private boolean SUV;

    public MotorPower(Double maxFuel, boolean SUV) {
        super(maxFuel);
        this.SUV = SUV;
    }

    public void controlarVelocidade(boolean areaUrbana) {
        if (!SUV || speed < 25.0 || !areaUrbana) {
            speed *= 2;
        }
    }

    @Override
    public void abastecer(double quantidadeLitros) {
        super.abastecer(quantidadeLitros);

        if (fuel < 10) {
            fuel = maxFuel;
            System.out.printf("Tanque de combustivel completo. Novo nivel: %s litros%n", fuel);
        }
    }

    public boolean isSUV() {
        return SUV;
    }

    public void setSUV(boolean SUV) {
        this.SUV = SUV;
    }
}
