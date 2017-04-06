package com.example.laboratorio.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Q2 extends AppCompatActivity {
    int p1 =0, p2=0, p3=0;
    EditText Prova1, Prova2,Prova3;
    TextView Media;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        Prova1 =(EditText)findViewById(R.id.dProva1);
        Prova2 =(EditText)findViewById(R.id.dProva2);
        Prova3 =(EditText)findViewById(R.id.dProva3);
        Media =  (TextView) findViewById(R.id.Media);
    }

    public void Media(View view){
        Prova1 = Integer.valueOf(p1.getText().toString());
        Prova2 = Integer.valueOf(p2.getText().toString());
        Prova3 = Integer.valueOf(p3.getText().toString());
        Media = setText(""+MathQ2.Media(p1,p2,p3,));
    }

}
