package com.example.exercicio_android_05;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        GerenciadorInvestimentos gerenciador = new GerenciadorInvestimentos();

        Investimento rendaFixa1 = new InvestimentoRendaFixa("CDB Banco X", 5000, 0.05);
        Investimento rendaFixa2 = new InvestimentoRendaFixa("Tesouro Direto", 3000, 0.03);
        Investimento rendaVariavel1 = new InvestimentoRendaVariavel("Ações TechCorp", 7000, 0.07, -0.02);
        Investimento rendaVariavel2 = new InvestimentoRendaVariavel("Criptomoeda XYZ", 2000, 0.10, -0.08);

        gerenciador.adicionarInvestimento(rendaFixa1);
        gerenciador.adicionarInvestimento(rendaFixa2);
        gerenciador.adicionarInvestimento(rendaVariavel1);
        gerenciador.adicionarInvestimento(rendaVariavel2);

        Log.i(TAG, "--LISTA DE INVESTIMENTOS:");
        gerenciador.listarInvestimentos();
        gerenciador.calcularRetornoTotal();
        gerenciador.investimentosParaRevisao();
    }
}