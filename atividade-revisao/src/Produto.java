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

/******************************** HASHCODE E EQUALS ************************************************************************************** */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((qtde == null) ? 0 : qtde.hashCode());
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (qtde == null) {
            if (other.qtde != null)
                return false;
        } else if (!qtde.equals(other.qtde))
            return false;
        if (valor == null) {
            if (other.valor != null)
                return false;
        } else if (!valor.equals(other.valor))
            return false;
        return true;
    }




    /* Basicamente o equals faz uma comparação entre a referência de dois objetos */ 

    
    
}
