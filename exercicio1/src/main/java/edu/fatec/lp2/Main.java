package edu.fatec.lp2;

public class Main {
    public static void main(String[] args) {

    Contatinho cont = new Contatinho("Paloma", "12900000000");
    Contatinho cont2 = new Contatinho("Pedro", "12901010101");

    Mensagem msgTexto = new MsgTexto();
    msgTexto.setDestinatario(cont);
    msgTexto.sendMensagem("Oiii");
    System.out.println(msgTexto);

    Mensagem msg = new MsgTexto();
    msg.setDestinatario(cont2);
    msg.sendMensagem("Olá!!");
    System.out.println(msg);

    Mensagem msgAudio = new MsgAudio();
    msgAudio.setDestinatario(cont);
    msgAudio.sendMensagem("120"); 
    System.out.println(msgAudio);
        
    Mensagem msgFoto = new MsgFoto();
    msgFoto.setDestinatario(cont);
    msgFoto.sendMensagem("2048"); 
    System.out.println(msgFoto);
    }

    
}