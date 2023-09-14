package com.example.jokempo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import java.util.Random;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    public int mudarPedra(View view) {
        ImageView vc = findViewById(R.id.vc);
        vc.setImageResource(R.drawable.pedra);
        sortear();
        return 0;
    }

    public int sortear() {
        Random ran = new Random();
        int jogada = ran.nextInt(3);
        ImageView ia = findViewById(R.id.ia);
        switch (jogada) {
            case 0:
                ia.setImageResource(R.drawable.pedra);
                break;
            case 1:
                ia.setImageResource(R.drawable.papel);
                break;
            case 2:
                ia.setImageResource(R.drawable.tesoura);
                break;
        }
        return jogada;
    }
}

