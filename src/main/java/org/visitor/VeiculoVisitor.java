package org.visitor;

public class VeiculoVisitor implements Visitor {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(Carro carro) {
        return "Carro{" +
                "codigo=" + carro.getCodigo() +
                ", modelo='" + carro.getModelo() + '\'' +
                ", categoria=" + carro.getNomeCategoria() +
                '}';
    }

    @Override
    public String exibirMoto(Moto moto) {
        return "Moto{" +
                "codigo=" + moto.getCodigo() +
                ", modelo='" + moto.getModelo() + '\'' +
                ", cilindradas=" + moto.getCilindradas() +
                '}';
    }

    @Override
    public String exibirCaminhao(Caminhao caminhao) {
        return "Caminhao{" +
                "codigo=" + caminhao.getCodigo() +
                ", modelo='" + caminhao.getModelo() + '\'' +
                ", capacidadeCarga=" + caminhao.getCapacidadeCarga() +
                '}';
    }
}