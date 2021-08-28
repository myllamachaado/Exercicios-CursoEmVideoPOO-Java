package conta;

public class ExemploConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.abrirConta(1,"CC", "Ludmila Machado", 250.00);
        conta1.status();

        conta1.depositar(210.0);
        conta1.status();

        conta1.sacar(950.0);
        conta1.status();

    }
}
