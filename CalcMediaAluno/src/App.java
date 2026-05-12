import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o nome do aluno e o rm!");
 
        Scanner sc = new Scanner(System.in);
 
        // Aluno a1 = new Aluno(11, "Rebs", 4, 10);
        Aluno a1 = new Aluno();
        System.out.println("rm: ");
        int rm = sc.nextInt();
        System.out.print("nome: ");
        String nome = sc.next();        
 
        a1 = new Aluno(rm, nome);
 
        System.out.print("Digite 1 para adicionar a nota, se não precione 0");
        int opcao = sc.nextInt();
 
        if(opcao == 0) {
            System.out.println("Fim do programa");
               System.out.println("Aluno(a): "+ a1.getNome());
           
        } else {
 
        System.out.println("p1: ");
        float p1 = sc.nextFloat();
        System.out.println("p2: ");
        float p2 = sc.nextFloat();    
       
        a1 = new Aluno(p1, p2);
 
        a1.calcNota();
 
        System.out.println("Aluno(a): "+ a1.getNome() + "com a média final: " + a1.getMF());
        }
 
 
 
    }
}