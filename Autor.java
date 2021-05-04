package oat;
public class Autor extends Pessoa {
    private String nacionalidade;
    
    //Método Construtor
    public Autor(String nom, String nac) {
        super(nom);
        this.nacionalidade = nac; 
    }
    // Método Getter
    public String getNacionalidade() {
        return nacionalidade;
    }
    // Método Setter
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
