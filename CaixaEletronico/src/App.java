public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao caixa eletronico!");
 
        ContaCorrente c1 = new ContaCorrente("00001", "3212-1");
 
        System.out.println("Numero conta: " + c1.getNumeroConta());
        System.out.println("Agencia: " + c1.getAgencia());
 
        System.out.println("saldo antes: " + c1.consultarSaldo());
        c1.depositar(200);
 
        System.out.println("Saldo depois do deposito: " + c1.consultarSaldo());
 
        // Violção direta ou Acesso direta
        // c1.saldo = 50000;
 
        boolean resposta = c1.sacar(50000);
 
        System.out.println("Resposta: " + resposta);
        System.out.println("Saldo depois do saque: " + c1.consultarSaldo());
    }
}