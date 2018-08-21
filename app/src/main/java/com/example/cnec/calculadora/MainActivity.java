package com.example.cnec.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Soma (View v){
        EditText etOp1 = findViewById(R.id.etOp1);
        EditText etOp2 = findViewById(R.id.etOp2);
        TextView tvResultado = findViewById(R.id.tvResultado);

        try{
            int iOp1 = Integer.parseInt(etOp1.getText().toString());
            int iOp2 = Integer.parseInt(etOp2.getText().toString());
            int iResultado = iOp1 + iOp2;

            String sResultado = String.valueOf(iResultado);

        }catch (Exception e ){
            tvResultado.setText(e.toString());
        }
    }
    public void Subtração (View v){
        EditText etOp1 = findViewById(R.id.etOp1);
        EditText etOp2 = findViewById(R.id.etOp2);
        TextView tvResultado = findViewById(R.id.tvResultado);

        try{
            int iOp1 = Integer.parseInt(etOp1.getText().toString());
            int iOp2 = Integer.parseInt(etOp2.getText().toString());
            int iResultado = iOp1 - iOp2;

            String sResultado = String.valueOf(iResultado);

        }catch (Exception e ){
            tvResultado.setText(e.toString());
        }
    }

}
