package oat;
public class Professor extends Pessoa {
    private String codigo;
    
    // Método Construtor
    public Professor(String nom, String cod) {
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
