package edu.fatec.lp2;

import java.util.HashSet;
import java.util.Set;

public class ListaCompra implements Calculavel {
    private Set<ItemCompra> itemCompra = new HashSet<>();
    private int quantMax;

    public Set<ItemCompra> getItemCompra() {
        return itemCompra;
    }

    public void setItemCompra(Set<ItemCompra> itemCompra) {
        this.itemCompra = itemCompra;
    }

    public int getQuantMax() {
        return quantMax;
    }



    public void listaDeCompras() {
        for (ItemCompra i : itemCompra) {
            System.out.println(i);
        }
    }

    public void incluirItem(ItemCompra item) {
        if (itemCompra.add(item)) {
            System.out.println("item: " + item.getProduto().getNome() + " incluido");

        }
    }

    public void excluirItem(ItemCompra item) {
        if (itemCompra.remove(item)) {
            System.out.println("item: " + item.getProduto().getNome() + " excluido");
        }
    }

    @Override
    public double calcularPreco() {
        double soma = 0;
        for (ItemCompra i : itemCompra) {
            soma += i.calcularPreco();
        }
        return soma;
    }

}
