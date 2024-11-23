package edu.fatec.lp2;

public class Supermercado {
   private  String nome;

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}



public Supermercado(String nome) {
    this.nome = nome;
}

@Override
public String toString() {
    return "Supermercado " + nome;
}




   


}
