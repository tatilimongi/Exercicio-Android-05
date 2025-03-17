package com.example.exercicio_android_05;

public interface Investimento {
    double calcularRetorno();
    String getDescricao();
    boolean precisaRevisao();
    void exibirDetalhes();
    double getValorInvestido();
}
