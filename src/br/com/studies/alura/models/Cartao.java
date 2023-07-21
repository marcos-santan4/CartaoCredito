package br.com.studies.alura.models;

public class Cartao {
    private Integer limite;

    public Cartao(int limite) {
        this.limite = limite;
    }

    public Integer getLimite() {
        return limite;
    }

    public void realizaCompra(int valorCompra) {
        this.limite -= valorCompra;
    }

    @Override
    public String toString() {
        return "Saldo restante: " + limite;
    }
}
