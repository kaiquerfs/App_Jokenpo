package com.example.jokempo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }
    public void mudarImg(View view){
        ImageView vc = findViewById(R.id.vc);
        ImageView pedra = findViewById(R.id.pedra);
vc.setImageResource(R.drawable.pedra);
    }
}

