package Entities;

public class Aerospace extends VeiculoInteligente {

    private boolean bagageiro;

    public Aerospace(Double maxFuel, boolean bagageiro) {
        super(maxFuel);
        this.bagageiro= bagageiro;
    }

    @Override
    public String toString() {
        String bagagem = bagageiro ? "Sim" : "Não";
        return String.format(super.toString() + "\nPossue bagagem: " + bagagem);
    }
    @Override
    public void controlarVelocidade(boolean areaUrbana) {
        if (!bagageiro && velocidade < 30 && areaUrbana) {
            velocidade *= 1.5;
        } else {
            velocidade *= 0.95;
        }
    }

    @Override
    public void abastecer(Double quantidadeLitros) {
        super.abastecer(quantidadeLitros);

        if (gasolina < 20) {
            gasolina = maxGasolina;
            System.out.printf("Tanque de combustivel completo. Novo nivel: %s litros%n", gasolina);
        }
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean baggage) {
        this.bagageiro= baggage;
    }
}
