package edu.fatec.lp2;

class MsgTexto extends Mensagem {
    private int numChar;


  @Override
    public Mensagem sendMensagem(String conteudo) {
        setConteudo(conteudo);
        this.numChar = conteudo.length();
        setHoraEnvio(java.time.LocalTime.now().toString()); 
        System.out.println("Mensagem de texto enviada: " + conteudo);
        return this; 
    }

    @Override
    public String toString() {
        return super.toString() ;
    }

}
