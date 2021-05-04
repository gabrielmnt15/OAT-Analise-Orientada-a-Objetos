package oat;
public abstract class Pessoa {
    private String nome;
    
    // Método Construtor
    public Pessoa(String n) {
        this.nome = n;
    }
    // Método Getter
    public String getNome() {
        return nome;
    }
    // Método Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
}
