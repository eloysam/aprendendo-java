public class Produto {
    private Long id;
    private String nome;
    private Integer qtde;
    private Double valor;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getQtde() {
        return this.qtde;
    }
    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }
    public Double getValor() {
        return this.valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String toString(){
        return "Id:" + this.id + "\nNome:" + this.nome + "\nQtde:" + this.qtde + "\nValor:" + this.valor;
    }

    
    
}
