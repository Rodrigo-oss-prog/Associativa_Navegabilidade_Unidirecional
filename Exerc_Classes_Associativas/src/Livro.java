import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Livro {
    private List<Autor> autores = new ArrayList<>();
    private Editora editora;

    private String titulo;
    private int anoPublicacao;
    private double preco;

    public Livro(Editora editora, String titulo, int anoPublicacao, double preco) {

        this.setEditora(editora);
        this.setTitulo(titulo);
        this.setAnoPublicacao(anoPublicacao);
        this.setPreco(preco);
        this.autores = new ArrayList<>();
    }

    public void addAutor(Autor...autor){
         Collections.addAll(autores, autor);

    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}
