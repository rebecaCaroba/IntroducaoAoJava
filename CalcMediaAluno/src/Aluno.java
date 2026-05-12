public class Aluno {
    private String nome;
    private int rm;
    private float p1, p2, MF;
 
 
    // Sobrecarga de contrutor:
 
    // Construtor vazio
    public Aluno() {
    }
 
    // Guardando parcialmente os dados
    public Aluno(int rm, String nome) {
        this.rm = rm;
        this.nome = nome;
     
    }
    // ou
    public Aluno(float p1, float p2) {
        this.p1 = p1;
        this.p2 = p2;
     
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public void calcNota() {
        this.MF = (p1 + p2)/2;
    }
 
    public float getMF() {
        return MF;
    }
}
 
 