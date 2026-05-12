public class ContaCorrente {
    private String agencia, numeroConta;
    private double saldo; // o private proteje e encapsula a variavel, impedindo alterações diretas
 
    // Criando metodos
    // 1 - Métodos com retorno
    // 2 - Métodos sem retorno (void)
 
    // Construtores: Utilizando para inserir mais de um valor na instância
    // Obrigatoriedade para inserir valores ao criar objetos
    public ContaCorrente(String agencia, String numeroConta) {
        this.agencia = agencia; // this para saber a diferença entre agencia da classe ou agencia do parametro
        this.numeroConta = numeroConta;
    }
 
    // Sintaxe do método: Modificador(public) retorno(void) nomeMetodo({parametro})
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
 
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return true;
        }
 
        return false;
    }
 
    public double consultarSaldo() {
        // Todo metodo com retorno, é necessário informar: return
 
        return saldo;
    }
 
    // Recuperando valores por meio do metodo get
    public String getAgencia() {
        return agencia;
    }
 
    public String getNumeroConta() {
        return numeroConta;
    }
 
    // Guardando ou modificando valores
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
 
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
// getters, setters, construtores = 5
// Métodos = 3
// Atributos = 3