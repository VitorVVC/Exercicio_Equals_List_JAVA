package Entities;

public abstract class VeiculoInteligente {
    protected Double speed;
    protected Double fuel;
    protected Double maxFuel;

    public VeiculoInteligente(Double maxFuel) {
        this.speed = 0.0;
        this.fuel = maxFuel;
        this.maxFuel = maxFuel;
    }

    public void partida() {
        if (fuel > 0) {
            speed = 10.0;
            System.out.println("O veiculo está a 10km/h");
        } else {
            System.out.println("Veiculo sem combustivel por favor reabasteça");
        }
    }


    public void parar() {
        speed = 0.0;
        System.out.println("O veiculo parou");
    }
    public void abastecer(double quantidadeLitros) {
        if (quantidadeLitros > 0) {
            if (fuel + quantidadeLitros <= maxFuel) {
                fuel += quantidadeLitros;
                System.out.println("Abastecimento concluido. Novo nivel de combustivel: " + fuel + " litros");
            } else {
                System.out.println("O tanque não suporta esta quantidade de combustivel");
            }
        } else {
            System.out.println("A quantidade de combustivel deve ser maior que zero.");
        }
    }
    @Override
    public String toString() {
        return String.format("O veiculo possue: %.2f como velocidade%Combustivel atual: %.2f%nMáximo de combustivel: %.2f%n", speed, fuel, maxFuel);
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public Double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(Double maxFuel) {
        this.maxFuel = maxFuel;
    }
}
