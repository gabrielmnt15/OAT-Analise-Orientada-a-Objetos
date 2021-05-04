package oat;
public class Livro {
    private String nome;
    private Autor autor;
    private Pessoa emprestadoPor;
    
    // Métdo Cosntrutor
    public Livro(String nom, Autor aut) {
        this.nome = nom;
        this.autor = aut;
    }
    
    // Getter e Setter Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter Autor
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Getter e Setter EmprestadoPor
    public Pessoa getEmprestadoPor() {
        return emprestadoPor;
    }

    public void setEmprestadoPor(Pessoa emprestadoPor) {
        this.emprestadoPor = emprestadoPor;
    }
}
