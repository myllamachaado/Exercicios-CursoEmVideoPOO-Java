package caneta;

public class ExemploCaneta {

    public static void main(String[] args){
        Caneta caneta1 = new Caneta();
        caneta1.setCor("Azul");
        caneta1.setModelo("Compactor");
        caneta1.setPonta(0.5f);
        caneta1.setCarga(59);
        caneta1.tampar();

        caneta1.status();
        caneta1.rabiscar();

        caneta1.destampar();
        caneta1.rabiscar();
    }
}
