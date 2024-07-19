import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        Cliente Iggon = new Cliente();
        Iggon.setNome("Iggo Nicollas");
        clientes.add(Iggon);

            Conta cc1 = new ContaCorrente(Iggon);
            Conta cp1 = new ContaPoupanca(Iggon);

        Cliente Caiog = new Cliente();
        Caiog.setNome("Caio Glauber");
        clientes.add(Caiog);

            Conta cc2 = new ContaCorrente(Caiog);
            Conta cp2 = new ContaPoupanca(Caiog);

        cc1.depositar(100);

        System.out.println("Depósito executado com sucesso! \n");

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        System.out.println("\nAguardando nova operação...\n");

        cc1.transferir(47, cp2);

        System.out.println("Transferencia executada com sucesso! \n");

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        System.out.println("\nConta Destino Caio Glauber \n");

        cc2.imprimirExtrato();
        cp2.imprimirExtrato();

        System.out.println("\nLista de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}