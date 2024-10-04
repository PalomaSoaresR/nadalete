package edu.fatec.lp2;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[] mensagem;

    public  Whatsapp() {
        this.contatos = new Contatinho[0];
        this.mensagem = new Mensagem[0];
    }

    public void listarContatos(){
        for (int i = 0; i < contatos.length; i++) { 
            System.out.println(contatos[i].getNome());
    }
}

    public void listarMensagens(){
        for (int i = 0; i < mensagem.length; i++) {
            System.out.println(mensagem[i].getConteudo());
    }
}
}