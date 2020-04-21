package com.example.practica_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et1, et2;
    private CheckBox check1, check2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_valor1);
        et2 = (EditText) findViewById(R.id.txt_valor2);
        check1 = (CheckBox) findViewById(R.id.check_suma);
        check2 = (CheckBox) findViewById(R.id.check_resta);
        tv1 = (TextView) findViewById(R.id.tv_resultado);


    }

    public void Calcular( View view) {

    String valor1_string = et1.getText().toString();
    String valor2_string = et2.getText().toString();

    int valor1_int = Integer.parseInt(valor1_string);
    int valor2_int = Integer.parseInt(valor2_string);

    String resultado = "";

    if (check1.isChecked()==true){

        int suma = valor1_int + valor2_int;
        resultado ="la suma es: " + suma + " / ";

    }

    if (check2.isChecked()==true){

        int resta = valor1_int - valor2_int;
        resultado = resultado + "la resta es: " + resta;

        tv1.setText(resultado);

    }

    }
}
