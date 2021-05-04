package oat;
public class Oat {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Stephen Hawking", "Reino Unido");
        Autor autor2 = new Autor("Stepehn Covey", "Estados Unidos");
        Aluno aluno1 = new Aluno("Gabriel" , "92671");
        Professor professor1 = new Professor("Efrain", "25908");
        Livro livro1 = new Livro("Uma Breve História do Tempo", autor1);
        livro1.setEmprestadoPor(aluno1);
        Livro livro2 = new Livro("Os 7 Hábitos de Pessoas Altamente Eficazes", autor2);
        livro2.setEmprestadoPor(professor1);
    
        System.out.println("Livro 1\n"+ "Nome: " +livro1.getNome());
        System.out.println("Nacionalidade do Autor: " +livro1.getAutor().getNacionalidade());
        System.out.println("Pessoa que emprestou: " +livro1.getEmprestadoPor().getNome());
        
        System.out.println("\nLivro 2\n"+ "Nome: " +livro2.getNome());
        System.out.println("Nacionalidade do Autor: " +livro2.getAutor().getNacionalidade());
        System.out.println("Pessoa que emprestou: " +livro2.getEmprestadoPor().getNome());
    }
}
