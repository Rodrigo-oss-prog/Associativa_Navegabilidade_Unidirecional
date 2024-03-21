public class Editora {

    private String razaoSocial;
    private String CNJ;


    public Editora(String razaoSocial, String CNJ) {
        this.setRazaoSocial(razaoSocial);
        this.setCNJ(CNJ);
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNJ() {
        return CNJ;
    }

    public void setCNJ(String CNJ) {
        this.CNJ = CNJ;
    }

}
