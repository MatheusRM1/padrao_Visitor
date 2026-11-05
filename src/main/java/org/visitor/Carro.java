package org.visitor;

public class Carro implements Veiculo {

    private int codigo;
    private String modelo;
    private Categoria categoria;

    public Carro(int codigo, String modelo, Categoria categoria) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNomeCategoria() {
        return this.categoria.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCarro(this);
    }
}
