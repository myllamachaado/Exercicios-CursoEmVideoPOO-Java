package caneta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void Caneta(){
        this.cor = "Azul";
        this.tampar();
    }

    public void rabiscar(){
        if (!this.tampada && this.carga > 0){
            System.out.println("Rabiscando........ ");
        }
        else{
            System.out.println("Não é possível rabiscar poque a caneta está tampada ou sem carga!");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("A cor da caneta é: " + getCor());
        System.out.println("O modelo da caneta é: " + getModelo());
        System.out.println("Aponta dessa caneta é: " + getPonta());
        System.out.println("O nível de carga da caneta é: " + getCarga());
        System.out.println("A canta está tampada? " + isTampada());
    }

}
