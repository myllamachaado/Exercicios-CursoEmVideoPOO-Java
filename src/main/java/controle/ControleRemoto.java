package controle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ControleRemoto implements InterfaceControleRemoto {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar(){
        this.setLigado(false);
    }

    public void abrirMenu(){
        System.out.println("\n-------------------------------------------");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("O volume é: " + this.getVolume());
        for(int i=10; i<110; i+=10){
            if(i <= this.getVolume()) {
                System.out.printf("[X]");
            }
            else{
                System.out.printf("[ ]");
            }
        }
    }

    public void fecharMenu(){
        System.out.println("Fechando o menu ........");
    }

    public void maisVolume(){
        if(this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println("Não é possível aumentar o volume pois o controle não está ligado! ");
        }
    }

    public void menosVolume(){
        if(this.ligado) {
            this.setVolume(this.getVolume() - 5);
        }
        else{
            System.out.println("Não é possível diminuir o volume pois o controle não está ligado! ");
        }
    }

    public void ligarMudo(){
        if(this.isLigado() && this.getVolume()>0){
            this.setVolume(0);
            System.out.println("Mudo ...");
        }
    }

    public void desligarMudo(){
        if(isLigado() && this.getVolume()==0) {
            this.setVolume(50);
            System.out.println("Mudo desligado ...");
        }
    }

    public void play(){
        if(this.isLigado() && !this.isTocando()){
            this.setTocando(true);
            System.out.println("Tocando ...");
        }
        else{
            System.out.println("Controle está desligado ou não está tocando ...");
        }
    }

    public void pause(){
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
            System.out.println("Pause ...");
        }
    }

}
