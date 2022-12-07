package com.fer.aula16_reviso;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaJogo extends AppCompatActivity {
    TextView txJ1, txJ2;
    MediaPlayer goku, click, alert;
    ImageView img00, img01, img02, img03, img10, img11, img12, img13,
            img20, img21, img22, img23, img30, img31, img32, img33;
    Integer[] imagensVet = {101, 102, 103, 104, 105, 106, 107, 108,
            201, 202, 203, 204, 205, 206, 207, 208};
    int dbz101, dbz102, dbz103, dbz104, dbz105, dbz106, dbz107, dbz108,
            dbz201, dbz202, dbz203, dbz204, dbz205, dbz206, dbz207, dbz208;
    int primeiro, segundo, clique1, clique2, imgNum = 1, turno = 1;
    int ptsJ1 = 0, ptsJ2 = 0;

    Button btnVoltar;
    String j1, j2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_jogo);
        txJ1 = findViewById(R.id.txtJ1);
        txJ2 = findViewById(R.id.txtJ2);
        img00 = findViewById(R.id.base00);
        img01 = findViewById(R.id.base01);
        img02 = findViewById(R.id.base02);
        img03 = findViewById(R.id.base03);
        img10 = findViewById(R.id.base10);
        img11 = findViewById(R.id.base11);
        img12 = findViewById(R.id.base12);
        img13 = findViewById(R.id.base13);
        img20 = findViewById(R.id.base20);
        img21 = findViewById(R.id.base21);
        img22 = findViewById(R.id.base22);
        img23 = findViewById(R.id.base23);
        img30 = findViewById(R.id.base30);
        img31 = findViewById(R.id.base31);
        img32 = findViewById(R.id.base32);
        img33 = findViewById(R.id.base33);
        goku = MediaPlayer.create(TelaJogo.this,R.raw.goku);
        click = MediaPlayer.create(TelaJogo.this,R.raw.pen_click);
        alert = MediaPlayer.create(TelaJogo.this, R.raw.sms_alert);

        img00.setTag("0");
        img01.setTag("1");
        img02.setTag("2");
        img03.setTag("3");
        img10.setTag("4");
        img11.setTag("5");
        img12.setTag("6");
        img13.setTag("7");
        img20.setTag("8");
        img21.setTag("9");
        img22.setTag("10");
        img23.setTag("11");
        img30.setTag("12");
        img31.setTag("13");
        img32.setTag("14");
        img33.setTag("15");

        Intent dados = getIntent();
        j1 = dados.getStringExtra("j1");
        j2 = dados.getStringExtra("j2");

        txJ1.setText(j1+": "+ptsJ1);
        txJ1.setTextColor(Color.BLACK);

        txJ2.setText(j2+": "+ptsJ2);
        txJ2.setTextColor(Color.GRAY);

        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaJogo.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        iniciarImagens();
        img00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img00, aux);
            }
        });
        img01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img01,aux);
            }
        });
        img02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img02,aux);
            }
        });
        img03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img03,aux);
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img10,aux);
            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img11,aux);
            }
        });
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img12,aux);
            }
        });
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img13,aux);
            }
        });
        img20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img20,aux);
            }
        });
        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img21,aux);
            }
        });
        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img22,aux);
            }
        });
        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img23,aux);
            }
        });
        img30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img30,aux);
            }
        });
        img31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img31,aux);
            }
        });
        img32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img32,aux);
            }
        });
        img33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aux = Integer.parseInt((String)view.getTag());
                clickImagem(img33,aux);
            }
        });
    }

    private void clickImagem(ImageView img, int aux) {
        click.start();
        if (imagensVet[aux] == 101) img.setImageResource(dbz101);
        else if (imagensVet[aux] == 102) img.setImageResource(dbz102);
        else if (imagensVet[aux] == 103) img.setImageResource(dbz103);
        else if (imagensVet[aux] == 104) img.setImageResource(dbz104);
        else if (imagensVet[aux] == 105) img.setImageResource(dbz105);
        else if (imagensVet[aux] == 106) img.setImageResource(dbz106);
        else if (imagensVet[aux] == 107) img.setImageResource(dbz107);
        else if (imagensVet[aux] == 108) img.setImageResource(dbz108);
        else if (imagensVet[aux] == 201) img.setImageResource(dbz201);
        else if (imagensVet[aux] == 202) img.setImageResource(dbz202);
        else if (imagensVet[aux] == 203) img.setImageResource(dbz203);
        else if (imagensVet[aux] == 204) img.setImageResource(dbz204);
        else if (imagensVet[aux] == 205) img.setImageResource(dbz205);
        else if (imagensVet[aux] == 206) img.setImageResource(dbz206);
        else if (imagensVet[aux] == 207) img.setImageResource(dbz207);
        else if (imagensVet[aux] == 208) img.setImageResource(dbz208);
        if(imgNum == 1){
            primeiro = imagensVet[aux];
            if( primeiro > 200) primeiro -= 100;
            imgNum = 2;
            clique1 = aux;
            img.setEnabled(false);
        } else if(imgNum == 2){
            segundo = imagensVet[aux];
            if( segundo > 200) segundo -= 100;
            imgNum = 1;
            clique2 = aux;
            img00.setEnabled(false);
            img01.setEnabled(false);
            img02.setEnabled(false);
            img03.setEnabled(false);
            img10.setEnabled(false);
            img11.setEnabled(false);
            img12.setEnabled(false);
            img13.setEnabled(false);
            img20.setEnabled(false);
            img21.setEnabled(false);
            img22.setEnabled(false);
            img23.setEnabled(false);
            img30.setEnabled(false);
            img31.setEnabled(false);
            img32.setEnabled(false);
            img33.setEnabled(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    verificar();
                }
            },1000);
        }
    }

    private void verificar() {

        if(primeiro == segundo){

            if(clique1 == 0) img00.setVisibility(View.INVISIBLE);
            else if(clique1 == 1) img01.setVisibility(View.INVISIBLE);
            else if(clique1 == 2) img02.setVisibility(View.INVISIBLE);
            else if(clique1 == 3) img03.setVisibility(View.INVISIBLE);
            else if(clique1 == 4) img10.setVisibility(View.INVISIBLE);
            else if(clique1 == 5) img11.setVisibility(View.INVISIBLE);
            else if(clique1 == 6) img12.setVisibility(View.INVISIBLE);
            else if(clique1 == 7) img13.setVisibility(View.INVISIBLE);
            else if(clique1 == 8) img20.setVisibility(View.INVISIBLE);
            else if(clique1 == 9) img21.setVisibility(View.INVISIBLE);
            else if(clique1 == 10) img22.setVisibility(View.INVISIBLE);
            else if(clique1 == 11) img23.setVisibility(View.INVISIBLE);
            else if(clique1 == 12) img30.setVisibility(View.INVISIBLE);
            else if(clique1 == 13) img31.setVisibility(View.INVISIBLE);
            else if(clique1 == 14) img32.setVisibility(View.INVISIBLE);
            else if(clique1 == 15) img33.setVisibility(View.INVISIBLE);

            if(clique2 == 0) img00.setVisibility(View.INVISIBLE);
            else if(clique2 == 1) img01.setVisibility(View.INVISIBLE);
            else if(clique2 == 2) img02.setVisibility(View.INVISIBLE);
            else if(clique2 == 3) img03.setVisibility(View.INVISIBLE);
            else if(clique2 == 4) img10.setVisibility(View.INVISIBLE);
            else if(clique2 == 5) img11.setVisibility(View.INVISIBLE);
            else if(clique2 == 6) img12.setVisibility(View.INVISIBLE);
            else if(clique2 == 7) img13.setVisibility(View.INVISIBLE);
            else if(clique2 == 8) img20.setVisibility(View.INVISIBLE);
            else if(clique2 == 9) img21.setVisibility(View.INVISIBLE);
            else if(clique2 == 10) img22.setVisibility(View.INVISIBLE);
            else if(clique2 == 11) img23.setVisibility(View.INVISIBLE);
            else if(clique2 == 12) img30.setVisibility(View.INVISIBLE);
            else if(clique2 == 13) img31.setVisibility(View.INVISIBLE);
            else if(clique2 == 14) img32.setVisibility(View.INVISIBLE);
            else if(clique2 == 15) img33.setVisibility(View.INVISIBLE);

            if(turno == 1){
                ptsJ1++;
                txJ1.setText(j1+": "+ptsJ1);
            }else{
                ptsJ2++;
                txJ2.setText(j2+": "+ptsJ2);
            }

            alert.start();

        } else{
            img00.setImageResource(R.drawable.base00);
            img01.setImageResource(R.drawable.base00);
            img02.setImageResource(R.drawable.base00);
            img03.setImageResource(R.drawable.base00);
            img10.setImageResource(R.drawable.base00);
            img11.setImageResource(R.drawable.base00);
            img12.setImageResource(R.drawable.base00);
            img13.setImageResource(R.drawable.base00);
            img20.setImageResource(R.drawable.base00);
            img21.setImageResource(R.drawable.base00);
            img22.setImageResource(R.drawable.base00);
            img23.setImageResource(R.drawable.base00);
            img30.setImageResource(R.drawable.base00);
            img31.setImageResource(R.drawable.base00);
            img32.setImageResource(R.drawable.base00);
            img33.setImageResource(R.drawable.base00);
        }
        if(turno == 1){
            turno = 2;
            txJ1.setTextColor(Color.GRAY);
            txJ2.setTextColor(Color.BLACK);
        }else{
            turno = 1;
            txJ1.setTextColor(Color.BLACK);
            txJ2.setTextColor(Color.GRAY);
        }

        img00.setEnabled(true);
        img01.setEnabled(true);
        img02.setEnabled(true);
        img03.setEnabled(true);
        img10.setEnabled(true);
        img11.setEnabled(true);
        img12.setEnabled(true);
        img13.setEnabled(true);
        img20.setEnabled(true);
        img21.setEnabled(true);
        img22.setEnabled(true);
        img23.setEnabled(true);
        img30.setEnabled(true);
        img31.setEnabled(true);
        img32.setEnabled(true);
        img33.setEnabled(true);

        checarFim();

    }

    private void checarFim() {
        if( img00.getVisibility() == View.INVISIBLE &&
                img01.getVisibility() == View.INVISIBLE &&
                img02.getVisibility() == View.INVISIBLE &&
                img03.getVisibility() == View.INVISIBLE &&
                img10.getVisibility() == View.INVISIBLE &&
                img11.getVisibility() == View.INVISIBLE &&
                img12.getVisibility() == View.INVISIBLE &&
                img13.getVisibility() == View.INVISIBLE &&
                img20.getVisibility() == View.INVISIBLE &&
                img21.getVisibility() == View.INVISIBLE &&
                img22.getVisibility() == View.INVISIBLE &&
                img23.getVisibility() == View.INVISIBLE &&
                img30.getVisibility() == View.INVISIBLE &&
                img31.getVisibility() == View.INVISIBLE &&
                img32.getVisibility() == View.INVISIBLE &&
                img33.getVisibility() == View.INVISIBLE ){

            AlertDialog.Builder alerta = new AlertDialog.Builder(TelaJogo.this);
            alerta.setMessage("Fim de Jogo! \n\n"+j1+": "+ptsJ1+"\n"+j2+": "+ptsJ2)
                    .setCancelable(false)
                    .setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(TelaJogo.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setPositiveButton("Novo Jogo", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(TelaJogo.this,TelaJogo.class);
                            intent.putExtra("j1",j1);
                            intent.putExtra("j2",j2);
                            startActivity(intent);
                            finish();
                        }
                    });
            AlertDialog alertDialog = alerta.create();
            alertDialog.show();
            goku.start();
        }
    }

    private void iniciarImagens() {
        dbz101 = R.drawable.dbz101;
        dbz102 = R.drawable.dbz102;
        dbz103 = R.drawable.dbz103;
        dbz104 = R.drawable.dbz104;
        dbz105 = R.drawable.dbz105;
        dbz106 = R.drawable.dbz106;
        dbz107 = R.drawable.dbz107;
        dbz108 = R.drawable.dbz108;
        dbz201 = R.drawable.dbz201;
        dbz202 = R.drawable.dbz202;
        dbz203 = R.drawable.dbz203;
        dbz204 = R.drawable.dbz204;
        dbz205 = R.drawable.dbz205;
        dbz206 = R.drawable.dbz206;
        dbz207 = R.drawable.dbz207;
        dbz208 = R.drawable.dbz208;

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(TelaJogo.this, MainActivity.class);
        startActivity(i);
        finish();
    }


}