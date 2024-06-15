public class Principal {

    public static void main (String[] args) {
        Cliente lucas = new Cliente("lucas","1575468754654787","20/05/2002", "187549875485465");


        Conta cc = new ContaCorrente(lucas);

        Conta contaPoupa = new ContaPoupanca(lucas);


        cc.depositar(100);
        cc.transferir(100, contaPoupa);
        cc.imprimirExtrato();
        contaPoupa.imprimirExtrato();
    }
}
