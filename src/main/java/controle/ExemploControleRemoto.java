package controle;

public class ExemploControleRemoto {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.abrirMenu();

        controle.ligar();
        controle.maisVolume();
        controle.maisVolume();
        controle.abrirMenu();

        controle.play();
        controle.ligarMudo();
        controle.play();
        controle.desligarMudo();
        controle.play();

    }
}
