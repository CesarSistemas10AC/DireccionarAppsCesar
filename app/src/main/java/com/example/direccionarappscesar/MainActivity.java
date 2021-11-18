package com.example.direccionarappscesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton camara, musica, platanitos, youtube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camara = findViewById(R.id.imagebtnC);
        musica = findViewById(R.id.imagebtnM);
        platanitos = findViewById(R.id.imagebtnP);
        youtube = findViewById(R.id.imagebtnY);

        camara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camara = getPackageManager().getLaunchIntentForPackage("com.motorola.camera3");
                startActivity(camara);
            }
        });

        musica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musica = getPackageManager().getLaunchIntentForPackage("com.eliferun.music");
                startActivity(musica);
            }
        });

        platanitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent platanitos = getPackageManager().getLaunchIntentForPackage("com.platanitos.platanitosapp");
                startActivity(platanitos);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(youtube);
            }
        });
    }
}