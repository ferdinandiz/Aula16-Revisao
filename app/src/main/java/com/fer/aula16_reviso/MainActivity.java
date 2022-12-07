package com.fer.aula16_reviso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnIniciar;
    EditText edJ1, edJ2;
    String j1, j2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIniciar = findViewById(R.id.btnIniciar);
        edJ1 = findViewById(R.id.edJ1);
        edJ2 = findViewById(R.id.edJ2);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j1 = edJ1.getText().toString();
                j2 = edJ2.getText().toString();
                if(j1.isEmpty())
                    edJ1.setError("Não Pode Ser Vazio!");
                else if(j2.isEmpty())
                    edJ2.setError("Não Pode Ser Vazio!");
                else{
                    Intent i = new Intent(MainActivity.this, TelaJogo.class);
                    i.putExtra("j1",j1);
                    i.putExtra("j2",j2);
                    startActivity(i);
                    finish();
                }
            }
        });

    }
}