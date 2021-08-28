package conta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;

    public void Conta(){
        this.setSaldoConta(0.0);
        this.setStatusConta(false);
    }

    public void abrirConta(int numConta, String tipoConta, String donoConta, double saldoConta){
        this.setNumConta(numConta);
        this.setTipoConta(tipoConta);
        this.setDonoConta(donoConta);
        if(this.tipoConta.equals("CC")){
            this.setSaldoConta(50.0);
        }
        else{
            this.setSaldoConta(150.0);
        }
        this.setSaldoConta(getSaldoConta()+saldoConta);
        this.setStatusConta(true);
    }

    public void fecharConta(){
        if(this.saldoConta == 0){
            this.setStatusConta(false);
            System.out.printf("A conta foi encerrada! ");
        }
        else{
            System.out.printf("A conta não pode ser fechada pois o saldo não está zerado! ");
        }
    }

    public void depositar(double valor){
        if(this.statusConta){
            this.setSaldoConta(getSaldoConta()+valor);
            System.out.println(valor + " depositado na conta com sucesso!");
        }
        else{
            System.out.println("A conta não está aberta, abra a conta antes de depositar!");
        }
    }

    public void sacar(double valor) {
        if (this.statusConta) {
            if (this.saldoConta >= valor) {
                this.setSaldoConta(getSaldoConta() - valor);
                System.out.println(valor + " sacado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente! ");
            }
        } else {
            System.out.println("A conta não está aberta, abra a conta antes de sacar!");
        }
    }

    public void pagarMensalidade(){
        if(this.statusConta){
            if (this.tipoConta.equals("CC")){
                this.setSaldoConta(getSaldoConta()-12.0);
            }
            else{
                this.setSaldoConta(getSaldoConta()-20.0);
            }
        }
        else{
            System.out.printf("A conta não está aberta! ");
        }
    }

    public void status(){
        System.out.println("-------------------------------------------");
        System.out.println("O número da conta é: " + this.getNumConta());
        System.out.println("O saldo da conta é: " + this.getSaldoConta());
        System.out.println("O tipo da conta é: " + (this.getTipoConta().equals("CC") ? "Conta Corrente" : "Conta Poupança"));
        System.out.println("O dono da conta é: " + this.getDonoConta());
        System.out.println("O status da conta é: " + this.isStatusConta());
    }
}
