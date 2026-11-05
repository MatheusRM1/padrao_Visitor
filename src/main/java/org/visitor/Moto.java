package org.visitor;

public class Moto implements Veiculo {

    private int codigo;
    private String modelo;
    private int cilindradas;

    public Moto(int codigo, String modelo, int cilindradas) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMoto(this);
    }

}