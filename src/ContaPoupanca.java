public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato(){
        System.out.println("--- Extrato Conta poupança ---");
        super.imprimirInfosComuns();
    }
}