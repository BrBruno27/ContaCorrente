package dominio;

import servico.GeradorDeNumeroConta;

public class ContaCorrente {
    private String numero;
    private double saldo;

    public ContaCorrente() {
        this.numero = Integer.toString(GeradorDeNumeroConta.gerarNumeroConta());
    }

    public ContaCorrente(double saldo) {
        this();
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public double sacar(double valorDoSaque){
        boolean saqueInvalido = (valorDoSaque > this.saldo);
        if (saqueInvalido){
            throw new IllegalArgumentException("O VALOR DO SAQUE NÃO PODE SER MAIOR DO QUE O SALDO ATUAL DA CONTA!!!");
        }
        this.saldo = saldo - valorDoSaque;
        return valorDoSaque;
    }

    public void depositar(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(ContaCorrente conta, double valorDaTransferencia){
        boolean transferenciaInvalida = (valorDaTransferencia > this.saldo);
        if (transferenciaInvalida){
            throw new IllegalArgumentException("O VALOR DA TRANSFERENCIA NÃO PODE SER MAIOR DO QUE O SALDO ATUAL DA CONTA!!!");
        }
        conta.depositar(valorDaTransferencia);
        this.saldo = (saldo - valorDaTransferencia);
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
