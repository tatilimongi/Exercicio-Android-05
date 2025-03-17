package com.example.exercicio_android_05;

import android.util.Log;

public abstract class InvestimentoBase implements Investimento {
    protected String descricao;
    protected double valorInvestido;
    protected double taxaRetorno;
    protected static final String TAG = "Investimento";

    public InvestimentoBase(String descricao, double valorInvestido, double taxaRetorno) {
        this.descricao = descricao;
        this.valorInvestido = valorInvestido;
        this.taxaRetorno = taxaRetorno;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    @Override
    public double calcularRetorno() {
        return valorInvestido * taxaRetorno;
    }

    @Override
    public boolean precisaRevisao() {
        return calcularRetorno() < 100;
    }

    @Override
    public void exibirDetalhes() {
        Log.i(TAG, descricao + " | Investido: R$" + String.format("%.2f", valorInvestido) +
                " | Retorno: R$" + String.format("%.2f", calcularRetorno()));
    }

}

