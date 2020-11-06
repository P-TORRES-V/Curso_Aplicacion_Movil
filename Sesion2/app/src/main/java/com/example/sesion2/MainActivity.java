package com.example.sesion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Button btnaceptar,btnsalir;
    public EditText edtNombre,edtPrecio,edtCantidad,edtSubtotal,edtIgv,edtTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnaceptar=(Button)findViewById(R.id.btnaceptar);
        btnsalir=(Button)findViewById(R.id.btnLimpiar);
        edtNombre=(EditText)findViewById(R.id.edtNombre);
        edtPrecio=(EditText)findViewById(R.id.edtPrecio);
        edtCantidad=(EditText)findViewById(R.id.edtCantidad);
        edtSubtotal=(EditText)findViewById(R.id.edtSubTotal);
        edtIgv=(EditText)findViewById(R.id.edtIgv);
        edtTotal=(EditText)findViewById(R.id.edtTotal);
        btnaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom=edtNombre.getText().toString();
                double pre=Double.parseDouble(edtPrecio.getText().toString());
                int can=Integer.parseInt(edtCantidad.getText().toString());
                double subt=pre*can;
                double igv=subt*0.18;
                double tot=subt+igv;
                edtSubtotal.setText(String.valueOf(subt));
                edtIgv.setText(String.valueOf(igv));
                edtTotal.setText(String.valueOf(tot));
                edtSubtotal.setEnabled(false);
                edtIgv.setEnabled(false);
                edtTotal.setEnabled(false);
            }
        });
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}





