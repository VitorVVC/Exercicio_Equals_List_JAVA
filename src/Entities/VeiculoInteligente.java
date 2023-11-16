package Entities;

public abstract class VeiculoInteligente {
    protected Double velocidade;
    protected Double gasolina;
    protected Double maxGasolina;

    public VeiculoInteligente(Double maxGasolina) {
        this.velocidade = 0.0;
        this.gasolina = maxGasolina;
        this.maxGasolina = maxGasolina;
    }

    public void partida() {
        if (gasolina > 0) {
            velocidade = 10.0;
            System.out.println("O veiculo está a 10km/h");
        } else {
            System.out.println("Veiculo sem combustivel por favor reabasteça");
        }
    }
    public abstract void controlarVelocidade(boolean areaUrbana);

    public void parar() {
        velocidade = 0.0;
        System.out.println("O veiculo parou");
    }
    public void abastecer(Double quantidadeLitros) {
        if (quantidadeLitros > 0) {
            if (gasolina + quantidadeLitros <= maxGasolina) {
                gasolina += quantidadeLitros;
                System.out.println("Abastecimento concluido. Novo nivel de combustivel: " + gasolina + " litros");
            } else {
                System.out.println("O tanque não suporta esta quantidade de combustivel");
            }
        } else {
            System.out.println("A quantidade de combustivel deve ser maior que zero.");
        }
    }
    @Override
    public String toString() {
        System.out.println("===========================");
        return String.format("\nO veiculo está a: %.2fkm/h%nCombustivel atual: %.2f%nMáximo de combustivel: %.2f", velocidade, gasolina, maxGasolina);
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getgasolina() {
        return gasolina;
    }

    public void setgasolina(Double gasolina) {
        this.gasolina = gasolina;
    }

    public Double getmaxGasolina() {
        return maxGasolina;
    }

    public void setmaxGasolina(Double maxGasolina) {
        this.maxGasolina = maxGasolina;
    }
}
