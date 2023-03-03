package apresetacao;

import dominio.ContaCorrente;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();

        conta1.depositar(3000);
        System.out.println(conta1);

        conta1.transferir(conta2, 1500);
        System.out.println(conta1);

        conta1.sacar(1200);
        System.out.println(conta1);
        System.out.println(conta2);
    }
}