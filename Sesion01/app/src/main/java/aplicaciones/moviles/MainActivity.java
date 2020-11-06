package aplicaciones.moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int a;
    public int b;
    public int c;
    public String mensaje;
    public double d;
    public EditText edtUsuario;
    public EditText edtPassword;
    public Button btnAceptar , btnSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asociamos las variables con los componentes graficos
        edtUsuario=(EditText)findViewById(R.id.edtUsuario);
        edtPassword=(EditText)findViewById(R.id.edtPassword);
        btnAceptar=(Button)findViewById(R.id.btnaceptar);
        btnSalir=(Button)findViewById(R.id.btnsalir);
        //Asociar codigo java a un componente grafico mediante un evento
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=10;
                b=25;
                c=a+b;
                mensaje="Bienvenido";
                d=243.56;
                Toast.makeText(MainActivity.this,mensaje + " "+c + " "+d,Toast.LENGTH_SHORT).show();
                String usuario,clave;
                usuario=edtUsuario.getText().toString();
                clave=edtPassword.getText().toString();
                if(usuario.equalsIgnoreCase("paul") && clave.equals("java")){
                    Toast.makeText(MainActivity.this,"Bienvenido: "+usuario,Toast.LENGTH_SHORT).show();
                }

            }
        });//finaliza elcodigo del boton aceptar
        btnSalir.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Saliendo del sistema",Toast.LENGTH_SHORT).show();
            }
        });
    }
}