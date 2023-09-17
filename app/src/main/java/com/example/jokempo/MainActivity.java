package com.example.jokempo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.Random;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    public void mudarpedra(View view) {
        this.jogadaVc("pedra");
        ImageView vc = findViewById(R.id.vc);
        vc.setImageResource(R.drawable.pedra);
    }

    public void mudarpapel(View view) {
        this.jogadaVc("papel");
        ImageView vc = findViewById(R.id.vc);
        vc.setImageResource(R.drawable.papel);
    }

    public void mudartesoura(View view) {
        this.jogadaVc("tesoura");
        ImageView vc = findViewById(R.id.vc);
        vc.setImageResource(R.drawable.tesoura);
    }

    public void jogadaVc(String jogadaVc) {
        ImageView ia = findViewById(R.id.ia);
        int sorteio = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String jogadaIA = opcoes[sorteio];

        switch (jogadaIA) {
            case "pedra":
                ia.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                ia.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                ia.setImageResource(R.drawable.tesoura);
                break;
        }
        TextView resultado = findViewById(R.id.resultado);
        if ((jogadaIA == "tesoura" && jogadaVc == "papel") || (jogadaIA == "papel" && jogadaVc == "pedra") || (jogadaIA == "pedra" && jogadaVc == "tesoura")) {
            resultado.setText(R.string.perdeu);
        } else if ((jogadaVc == "tesoura" && jogadaIA == "papel") || (jogadaVc == "papel" && jogadaIA == "pedra") || (jogadaVc == "pedra" && jogadaIA == "tesoura")) {
            resultado.setText(R.string.ganhou);
        } else {
            resultado.setText(R.string.empate);
        }
    }
}

