package edu.fatec.lp2;

public class Main {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Arroz", "kg", "branco", 29.99, 0.99, new Supermercado("the best"));
        Produto p2 = new Produto("Feijão", "kg", "preto", 10.99,  0.99, new Supermercado("the best"));
        ItemCompra ic = new ItemCompra(1, p1, 0.99);
        ItemCompra ic2 = new ItemCompra(1, p2, 0.99);
        ListaCompra  lc = new ListaCompra();
        lc.incluirItem(ic2);
        lc.incluirItem(ic);
        lc.listaDeCompras();
        System.out.println(lc.calcularPreco()); 




    }
}