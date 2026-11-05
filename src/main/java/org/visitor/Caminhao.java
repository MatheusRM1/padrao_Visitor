package org.visitor;

public class Caminhao implements Veiculo {

    private int codigo;
    private String modelo;
    private float capacidadeCarga;

    public Caminhao(int codigo, String modelo, float capacidadeCarga) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCaminhao(this);
    }

}
