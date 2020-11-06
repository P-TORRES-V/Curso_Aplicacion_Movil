package com.example.sesion3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {
    public Button btnCalcular;
    public EditText edtCodigo,edtNombre,edtOcupacion,edtSueldo,edtAfp,edtDescuento,edtIncremento,edtNeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        btnCalcular=(Button)findViewById(R.id.btnCalcular);
        edtCodigo=(EditText)findViewById(R.id.edtCodigo);
        edtNombre=(EditText)findViewById(R.id.edtNombre);
        edtOcupacion=(EditText)findViewById(R.id.edtOcupacion);
        edtSueldo=(EditText)findViewById(R.id.edtSueldo);
        edtAfp=(EditText)findViewById(R.id.edtAfp);
        edtDescuento=(EditText)findViewById(R.id.edtDesccuento);
        edtIncremento=(EditText)findViewById(R.id.edtIncremento);
        edtNeto=(EditText)findViewById(R.id.edtNeto);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cod=Integer.parseInt(edtCodigo.getText().toString());
                String nom=edtNombre.getText().toString();
                String ocup=edtOcupacion.getText().toString();
                Empleado e=new Empleado();
                e.codigo=cod;
                e.nombre=nom;
                e.ocupacion=ocup;
                double dcto=e.obtner_decuento();
                double inc=e.obtener_incremento();
                double tot=e.obtener_neto();
                edtDescuento.setText(String.valueOf(dcto));
                edtIncremento.setText(String.valueOf(inc));
                edtNeto.setText(String.valueOf(tot));
                edtSueldo.setText(String.valueOf(e.sueldo));
                edtAfp.setText(String.valueOf(e.afp));


            }
        });
    }
}