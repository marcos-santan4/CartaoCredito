package br.com.studies.alura.models;

public class Produto implements Comparable<Produto> {
    private String descricao;
    private Integer preco;

    public Produto(String descricao, Integer preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto() {}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return this.descricao + " - " + this.preco;
    }

    @Override
    public int compareTo(Produto produto) {
        return this.preco.compareTo(produto.getPreco());
    }
}
