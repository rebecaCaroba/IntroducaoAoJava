import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
       
        // Chamando um método para executar:
 
        // estruturaCondicional();
        metodoSemRetorno();
        String resposta = metodoComRetorno();
        System.out.println(resposta);
        System.out.println(metodoComRetorno() + "Concatenação é juntar");
 
        Calculadora calc = new Calculadora();
 
        System.out.println("Subtração: " + calc.subtrair(2, 6));
        calc.somar(2, 6);
    }
 
   
 
    public static void metodoSemRetorno() {
        System.out.println("Método sem retorno");
    }
 
    public static String metodoComRetorno() {
        return "Esse método possue um retorno do tipo String";
    }
 
    public static void estruturaCondicional() {
        //Assinatura do metodo -> public void estruturaCondicional()
        //Nivel de acesso -> Public
        //Tipo de retorno -> Void
        //Nome do Método -> estruturaCondicional()
        //(Parâmetro de Entrada)
        // public -> público em todo o projeto
        // void -> não tem um retorno, saída
        // static -> nao pode ser modificado
 
        //Estrutura condicional
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
 
        // Condção simples (IF)
        if(idade >= 18) {
            System.out.println("Maior de idade");
        }
 
        // Condição composta (IF-ELSE)
        if(idade >= 18) {
            System.err.println("Maior de idade");
        } else  {
            System.err.println("Menor de idade");
        }
 
        // Multiplas condições (IF-ELSE IF-ELSE)
 
        if(idade < 10) {
            System.out.println("Criança");
        }else if( idade>10 && idade<18) {
            System.out.println("Adolescente");
        }else if(idade>=18 && idade<65){
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
 
        //Multiplos Casos
        System.out.println("Digite o dia da semana: ");
        int dia = sc.nextInt();
 
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
 
        // Ternário (Simplificação de estrutura composta)
        sc.close();
        System.out.println("Digite a nota: ");
        float nota = sc.nextFloat();
        String resultado = (nota>=6) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
 