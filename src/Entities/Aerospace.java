package Entities;

public class Aerospace extends VeiculoInteligente {

    private boolean baggage;

    public Aerospace(Double maxFuel, boolean baggage) {
        super(maxFuel);
        this.baggage = baggage;
    }

    public void speedControl(boolean areaUrbana) {
        if (!baggage && speed < 30.0 && areaUrbana) {
            speed += 1.5;
        } else {
            speed *= 0.95;
        }
    }
    @Override
    public void abastecer(double quantidadeLitros) {
        super.abastecer(quantidadeLitros);

        if (fuel < 20) {
            fuel = maxFuel;
            System.out.printf("Tanque de combustivel completo. Novo nivel: %s litros%n", fuel);
        }
    }

    public boolean isBaggage() {
        return baggage;
    }

    public void setBaggage(boolean baggage) {
        this.baggage = baggage;
    }
}
