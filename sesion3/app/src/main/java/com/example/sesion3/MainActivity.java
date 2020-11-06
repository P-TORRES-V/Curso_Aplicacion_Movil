package com.example.sesion3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Button btnAceptar, btnSalir;
    public EditText edtCodigo, edtNombre, edtCantidad, edtPrecio, edtSubtotal, edtIgv, edtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAceptar = (Button) findViewById(R.id.btnAceptsar);
        btnSalir = (Button) findViewById(R.id.btnSalir);
        edtCodigo = (EditText) findViewById(R.id.edtCodigo);
        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtCantidad = (EditText) findViewById(R.id.edtCantidad);
        edtPrecio = (EditText) findViewById(R.id.edtPrecio);
        edtSubtotal = (EditText) findViewById(R.id.edtSubtotal);
        edtIgv = (EditText) findViewById(R.id.edtIgv);
        edtTotal = (EditText) findViewById(R.id.edtTotal);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cod = Integer.parseInt(edtCodigo.getText().toString());
                String nom = edtNombre.getText().toString();
                int can = Integer.parseInt(edtCantidad.getText().toString());
                double pre = Double.parseDouble(edtPrecio.getText().toString());
                Producto p = new Producto();
                p.codigo = cod;
                p.nombre = nom;
                p.cantidad = can;
                p.precio = pre;
                double subt = p.obtener_subtotal();
                double igv = p.obtener_igv();
                double tot = p.obtener_total();
                edtSubtotal.setText(String.valueOf(subt));
                edtIgv.setText(String.valueOf(igv));
                edtTotal.setText(String.valueOf(tot));
                edtSubtotal.setEnabled(false);
                edtIgv.setEnabled(false);
                edtTotal.setEnabled(false);
            }

        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCodigo.setText("");
                edtNombre.setText("");
                edtCantidad.setText("");
                edtPrecio.setText("");
                edtSubtotal.setText("");
                edtIgv.setText("");
                edtTotal.setText("");
                edtCodigo.requestFocus();

            }
        });


    }
}