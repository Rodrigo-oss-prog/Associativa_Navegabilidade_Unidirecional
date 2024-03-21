public class Autor {
    private String nome;
    private String telefone;



    public Autor(String nome, String telefone) {
        this.setNome(nome);
        this.setTelefoen(telefone);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefoen(String telefoen) {
        this.telefone = telefone;
    }


}

