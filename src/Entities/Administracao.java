package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Administracao {

    private List<VeiculoInteligente> listaVeiculos;

    public Administracao() {
        this.listaVeiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(VeiculoInteligente veiculo) {
        listaVeiculos.add(veiculo);
    }

    public void removerVeiculos(VeiculoInteligente veiculo) {
        listaVeiculos.remove(veiculo.equals(listaVeiculos));
    }

    public List<VeiculoInteligente> veiculosMaior30(double valor) {
        List<VeiculoInteligente> veiculosAcima30 = new ArrayList<>();

        for (int i = 0; i < listaVeiculos.size(); i++) {
            VeiculoInteligente teste = listaVeiculos.get(i);
            if (teste.getVelocidade() > 30) {
                veiculosAcima30.add(teste);
            }
        }
        if (veiculosAcima30.isEmpty()) {
            System.out.println("Nenhum veiculo acima de 30km/h");
        }
        return veiculosAcima30;
    }

    public void removerParado() {
        for (int i = 0; i < listaVeiculos.size(); i++) {
            VeiculoInteligente teste = listaVeiculos.get(i);
            if (teste.getVelocidade() == 0.0) {
                listaVeiculos.remove(teste);
                System.out.println("Veiculo removido, nova quantidade de carros: " + listaVeiculos.size());
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administracao that = (Administracao) o;
        return Objects.equals(listaVeiculos, that.listaVeiculos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaVeiculos);
    }
}
