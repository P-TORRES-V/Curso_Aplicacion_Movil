package com.example.sesion3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Producto extends AppCompatActivity {
    public int codigo;
    public String nombre;
    public int cantidad;
    public double precio;
    public double subtotal;
    public double igv;
    public double total;
    public double obtener_subtotal(){
        subtotal=cantidad*precio;
        return subtotal;
    }
    public double obtener_igv(){
        igv=subtotal*0.18;
        return igv;
    }
    public double obtener_total(){
        total=subtotal+igv;
        return total;
    }


}