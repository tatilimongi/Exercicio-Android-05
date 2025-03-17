package com.example.exercicio_android_05;

import android.util.Log;

public class InvestimentoRendaFixa extends InvestimentoBase {
    public InvestimentoRendaFixa(String descricao, double valorInvestido, double taxaRetorno) {
        super(descricao, valorInvestido, taxaRetorno);
    }

    @Override
    public void exibirDetalhes() {
        Log.i(TAG, "Renda Fixa: " + descricao + " | Investido: R$" + String.format("%.2f", valorInvestido) +
                " | Retorno: R$" + String.format("%.2f", calcularRetorno()) + (precisaRevisao() ? " (Precisa de Revisão)" : ""));
    }

}

