public class Main {
    public static void main(String[] args) {

        Cliente Iggon = new Cliente();
        Iggon.setNome("Iggo Nicollas");

        Conta cc = new ContaCorrente(Iggon);
        Conta cp = new ContaPoupanca(Iggon);

        cc.depositar(100);


        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("\nAguardando nova operação...\n");

        cc.transferir(47, cp);

        System.out.println("Transferencia executada com sucesso! \n");

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}