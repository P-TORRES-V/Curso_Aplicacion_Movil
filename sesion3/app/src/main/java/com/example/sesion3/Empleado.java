package com.example.sesion3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Empleado  {
    public int codigo;
    public String nombre,ocupacion,afp;
    public double sueldo,descuento,incremento,neto;

    public Empleado() {
        sueldo = 200;
        afp = "Habitat";
    }
    public double obtner_decuento(){
        descuento=sueldo*0.13;
        return descuento;
    }
    public double obtener_incremento(){
        incremento=95;
        return incremento;
    }
    public double obtener_neto(){
        neto=sueldo-descuento+incremento;
        return neto;
    }
}