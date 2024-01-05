public class Conta {
    private int numConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numConta, String nomeTitular, double initialDeposit) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = initialDeposit;
    }
    public Conta(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    //Número conta
    public int getNumConta() {
        return numConta;
    }

    //Nome do Titular
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    //Saldo
    public double getsaldo() {
        return saldo;
    }

    //Depósito
    public void depositoDinheiro(double deposito) {
        saldo += deposito;
    }

    //Saque
    public void saqueDinheiro(double saque) {
        saldo -= (saque + 5.00);
    }

    //toString
    public String toString() {
        return String.format("Número da conta: %s %nNome do Titular: %s %nSaldo: R$ %.2f", numConta, nomeTitular, saldo);
    }
}
