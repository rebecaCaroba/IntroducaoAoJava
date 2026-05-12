import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
 
        // Não podemos duplicar as variaveis para criar um cenario dinamico
        // 1 - Para atender esse cenario é necessario duplicar as variaveis com nomes
        // diferentes, não é recomendado
 
        // Abstração é a representação de algo no mundo real em alguma modelagem de
        // software
        Aluno a1 = new Aluno();
        // Aluno é a classe
        // a1: é o nome do objeto
        // = new Aluno() estou avisando ao compilador para reservar um espaçoo na
        // memoria -> intanciar um objeto
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Digite seu nome");
        a1.nome = sc.nextLine();
 
        System.out.println("Digite seu cpf");
        a1.cpf = sc.nextLine();
        // a1 -> nomeObjeto -> atributos ou metodos que pertencem a essa classe
 
        System.out.println("Digite seu ra");
        a1.ra = sc.nextInt();
 
        System.out.println("Nome a1: " + a1.nome);
        // recuperando o valor que esta em um atributo que estao dentro de um objeto que
        // pertencem a uma classe
 
        Aluno a2 = new Aluno();
 
        System.out.println("Digite seu nome de novo");
        a2.nome = sc.next();
 
        System.out.println("Nome a2: " + a2.nome);
        // Objetos diferentes, mas com ainda tem as mesma características e
        // comportamentos
        // pois tem como base a mesma Class (Aluno)
 
        Aluno a3 = new Aluno();
        a3 = a2;
        // Copiando objetos por referencias
        System.out.println("Nome a3: " + a3.nome + " é igual a a2.nome: " + a2.nome);
 
        System.out.print("Digite o logradouro");
 
 
 
 
 
        Endereco e1 = new Endereco();
        e1.logradouro = sc.next();
 
        sc.close();
        System.out.print("O logradouro é: " + e1.logradouro);
 
 
    }
 
}
 