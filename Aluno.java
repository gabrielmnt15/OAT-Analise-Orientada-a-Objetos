package oat;
public class Aluno extends Pessoa {
    private String codigo;
    
    // Método Construtor
    public Aluno(String nom, String cod) {
        super(nom);
        this.codigo = cod;
    }
    // Método Getter
    public String getCodigo() {
        return codigo;
    }
    // Método Setter
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    } 
}