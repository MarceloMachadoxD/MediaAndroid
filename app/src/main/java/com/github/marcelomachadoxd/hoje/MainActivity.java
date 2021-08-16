package com.github.marcelomachadoxd.hoje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText n1, n2, n3;
    TextView mediaResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);
        n3 = (EditText) findViewById(R.id.num3);


        mediaResultado = (TextView) findViewById(R.id.media);

    }

    public void calcular(View view) {
        Double a1 = Double.parseDouble(String.valueOf(n1.getText()));
        Double a2 = Double.parseDouble(String.valueOf(n2.getText()));
        Double a3 = Double.parseDouble(String.valueOf(n3.getText()));

        Double maior;

        if (a3 > a2) {
            maior = a3;
        } else {
            maior = a2;
        }

        

        Double media = (a1 + maior) / 2;

        mediaResultado.setText(media.toString());


    }
}