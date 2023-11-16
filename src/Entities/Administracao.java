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
