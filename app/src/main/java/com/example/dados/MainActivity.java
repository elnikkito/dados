package com.example.dados;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        Button boton = findViewById(R.id.button);
        TextView texto=findViewById(R.id.textView);
        ImageView imagen= findViewById(R.id.imageView);



        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int numeroRandom=(int)(Math.random()*6)+1;

                texto.setTextSize(40);
                texto.setGravity(Gravity.CENTER);
                texto.setText(String.valueOf(numeroRandom));

                int colorFondo = Color.argb(255,245,66,182);
                String textoValor="Lanzar";
                int colorFondoTexto = Color.argb(255,255,255,255);


                switch (numeroRandom){
                    case 1:
                        texto.setBackgroundTintList(ColorStateList.valueOf(Color.argb(255,255,0,0)));
                        boton.setText("FALLO");
                        boton.setBackgroundTintList(ColorStateList.valueOf(Color.argb(255,255,0,0)));
                        imagen.setImageResource(R.drawable.dice_one);
                        break;
                    case 2:
                        texto.setBackgroundTintList(ColorStateList.valueOf(colorFondoTexto));
                        boton.setText(textoValor);
                        boton.setBackgroundTintList(ColorStateList.valueOf(colorFondo));
                        imagen.setImageResource(R.drawable.dice_two);
                        break;
                    case 3:
                        texto.setBackgroundTintList(ColorStateList.valueOf(colorFondoTexto));
                        boton.setText(textoValor);
                        boton.setBackgroundTintList(ColorStateList.valueOf(colorFondo));
                        imagen.setImageResource(R.drawable.dice_three);
                        break;
                    case 4:
                        texto.setBackgroundTintList(ColorStateList.valueOf(colorFondoTexto));
                        boton.setText(textoValor);
                        boton.setBackgroundTintList(ColorStateList.valueOf(colorFondo));
                        imagen.setImageResource(R.drawable.dice_four);
                        break;
                    case 5:
                        texto.setBackgroundTintList(ColorStateList.valueOf(colorFondoTexto));
                        boton.setText(textoValor);
                        boton.setBackgroundTintList(ColorStateList.valueOf(colorFondo));
                        imagen.setImageResource(R.drawable.dice_five);
                        break;
                    case 6:
                        texto.setBackgroundTintList(ColorStateList.valueOf(colorFondoTexto));
                        boton.setText(textoValor);
                        boton.setBackgroundTintList(ColorStateList.valueOf(colorFondo));
                        imagen.setImageResource(R.drawable.dice_six);
                        break;
                }

            }
        });


    }
}