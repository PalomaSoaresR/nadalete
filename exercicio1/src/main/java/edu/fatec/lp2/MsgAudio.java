package edu.fatec.lp2;

public class MsgAudio extends Mensagem {
    private int duracao;

    @Override
    public Mensagem sendMensagem(String conteudo) {
        setConteudo(conteudo);
        this.duracao = Integer.parseInt(conteudo); 
        System.out.println("Mensagem de áudio enviada com duração: " + duracao + " segundos");
        return this; 
    }

    @Override
    public String toString() {
        return super.toString() + "| Duracao: " + duracao + " segundos";
    }
}
