package com.example.sesion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculoActivity extends AppCompatActivity {
    Button btnCalcular,btnLimpiar;
    EditText edtAAA,edtBB,edtCC,edtRR1,edtRR2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        //Log.d("ciclo","Created");


        btnCalcular=findViewById(R.id.btnCalcular);
        btnLimpiar=(Button)findViewById(R.id.btnLimpiar);
        edtAAA=findViewById(R.id.edtAAA);
        edtBB=(EditText)findViewById(R.id.edtBB);
        edtCC=(EditText)findViewById(R.id.edtCC);
        edtRR1=(EditText)findViewById(R.id.edtRR1);
        edtRR2=(EditText)findViewById(R.id.edtRR2);
        edtRR1.setEnabled(false);
        edtRR2.setEnabled(false);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //El siguiente comando nos pasa a la siguiente pagina
              // startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                int a=Integer.parseInt(edtAAA.getText().toString());
                int b=Integer.parseInt(edtBB.getText().toString());
                int c=Integer.parseInt(edtCC.getText().toString());
                double res1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
                double res2=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
                edtRR1.setText(String.valueOf(res1));
                edtRR2.setText(String.valueOf(res2));
                edtRR1.setEnabled(false);
                edtRR2.setEnabled(false);
            }
        });

            btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAAA.setText("");
                edtBB.setText("");
                edtCC.setText("");
                edtRR1.setText("");
                edtRR2.setText("");
                edtRR1.setEnabled(true);
                edtRR2.setEnabled(true);
                edtAAA.requestFocus();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ciclo","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclo","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo","onDestroy");
    }
}