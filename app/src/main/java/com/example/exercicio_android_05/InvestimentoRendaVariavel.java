package com.example.exercicio_android_05;

import android.util.Log;

public class InvestimentoRendaVariavel extends InvestimentoBase {
    private double variacaoMercado;

    public InvestimentoRendaVariavel(String descricao, double valorInvestido, double taxaRetorno, double variacaoMercado) {
        super(descricao, valorInvestido, taxaRetorno);
        this.variacaoMercado = variacaoMercado;
    }

    @Override
    public double calcularRetorno() {
        return valorInvestido * (taxaRetorno + variacaoMercado);
    }

    @Override
    public void exibirDetalhes() {
        Log.i(TAG, "Renda Variável: " + descricao + " | Investido: R$" + String.format("%.2f", valorInvestido) +
                " | Retorno: R$" + String.format("%.2f", calcularRetorno()) + (precisaRevisao() ? " (Precisa de Revisão)" : ""));
    }

}

