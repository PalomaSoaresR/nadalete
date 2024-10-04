package edu.fatec.lp2;

public class MsgFoto extends Mensagem {
    private int tamanho;

    @Override
    public Mensagem sendMensagem(String conteudo) {
        setConteudo(conteudo);
        this.tamanho = Integer.parseInt(conteudo); 
        setHoraEnvio(java.time.LocalTime.now().toString());
        System.out.println("Mensagem de foto enviada com tamanho: " + tamanho + " KB");
        return this; 
    }

    @Override
    public String toString() {
        return super.toString() + "| Tamanho: " + tamanho + " KB";
    }
}
