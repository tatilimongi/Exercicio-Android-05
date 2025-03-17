package com.example.exercicio_android_05;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorInvestimentos {
    private List<Investimento> investimentos;
    private static final String TAG = "GerenciadorInvestimentos";

    public GerenciadorInvestimentos() {
        this.investimentos = new ArrayList<>();
    }

    public void adicionarInvestimento(Investimento investimento) {
        investimentos.add(investimento);
    }

    public void calcularRetornoTotal() {
        double totalRetorno = 0;
        for (Investimento inv : investimentos) {
            totalRetorno += inv.calcularRetorno();
        }
        Log.i(TAG, "--Retorno Total: R$" + String.format("%.2f", totalRetorno));

    }

    public void listarInvestimentos() {
        for (Investimento inv : investimentos) {
            inv.exibirDetalhes();
        }
    }

    public void investimentosParaRevisao() {
        Log.i(TAG, "--Investimentos que precisam de revisão:");
        boolean encontrouRevisao = false;

        for (Investimento inv : investimentos) {
            if (inv.precisaRevisao()) {
                Log.i(TAG, inv.getDescricao() + " | Investido: R$" +
                        String.format("%.2f", inv.getValorInvestido()) +
                        " | Retorno: R$" + String.format("%.2f", inv.calcularRetorno()) +
                        " (Precisa de Revisão)");
                encontrouRevisao = true;
            }
        }

        if (!encontrouRevisao) {
            Log.i(TAG, "Nenhum investimento precisa de revisão no momento.");
        }
    }

}

