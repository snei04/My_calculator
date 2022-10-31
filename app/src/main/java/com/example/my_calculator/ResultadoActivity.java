package com.example.CalcularActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ResultadoActivity extends AppCampatActivity {

    TextView _recibenumero1, _recibenumero2, _texto, _resultado;
    Button _btnVolver;

    int n1,n2,r;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _recibenumero1= findViewById(R.id.recibenumero1);
        _recibenumero2= findViewById(R.id.recibenumero2);
        _texto = findViewById(R.id.texto);
        _resultado = findViewById(R.id.resultado);
        n1 = Integer.valueof(getIntent().getExtras().getString("numero1"));
        n2 = Integer.valueof(getIntent().getExtras().getString("numero2"));
        operacion = getIntent().getExtras().getString("operacion");
        switch (operacion){
            case "suma":
                r=n1 + n2;
                break;
            case "Resta":
                r=n1 - n2;
                break;
            case "División":
                r=n1 / n2;
                break;
            case "Multiplicación":
                r=n1 * n2;
                break;
        }
    }
}package codea.app.calculadora;

        import ...

public class ResultadoActivity extends AppCampatActivity {

    TextView _recibenumero1, _recibenumero2, _texto, _resultado;
    Button _btnVolver;

    int n1,n2,r;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _recibenumero1= findViewById(R.id.recibenumero1);
        _recibenumero2= findViewById(R.id.recibenumero2);
        _texto = findViewById(R.id.texto);
        _resultado = findViewById(R.id.resultado);
        n1 = Integer.valueof(getIntent().getExtras().getString("numero1"));
        n2 = Integer.valueof(getIntent().getExtras().getString("numero2"));
        operacion = getIntent().getExtras().getString("operacion");
        switch (operacion){
            case "suma":
                r=n1 + n2;
                break;
            case "Resta":
                r=n1 - n2;
                break;
            case "División":
                r=n1 / n2;
                break;
            case "Multiplicación":
                r=n1 * n2;
                break;
        }
    }
}

