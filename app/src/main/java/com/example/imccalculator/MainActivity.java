package com.example.imccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = (EditText) findViewById(R.id.nameInput);
        final EditText age = (EditText) findViewById(R.id.ageInput);
        final EditText weight = (EditText) findViewById(R.id.weightInput);
        final EditText height = (EditText) findViewById(R.id.heightInput);
        Button buttonReport = (Button) findViewById(R.id.buttonReport);


        buttonReport.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String varWeight = weight.getText().toString();
                String varHeight = height.getText().toString();
                String varAge = age.getText().toString();
                String varName = name.getText().toString();

                if(Double.parseDouble(varHeight) == 0){
                    varHeight = "0.1";
                }
                Double valueHeight = Double.parseDouble(varHeight);
                Double valueWeight = Double.parseDouble(varWeight);
                Double valueHeight2 = valueHeight*valueHeight;
                Double imc = valueWeight/valueHeight2;

                String classificacao = "";
                if(imc < 18.5){
                    classificacao = "Abaixo do Peso";
                }
                else if(imc >= 18.5 && imc <= 24.9){
                    classificacao = "Saudável";
                }
                else if(imc >= 30 && imc <= 34.9){
                    classificacao = "Obesidade Grau I";
                }
                else if(imc >= 35 && imc <= 39.9){
                    classificacao = "Obesidade Grau II (severa)";
                }
                else if(imc >= 40){
                    classificacao = "Obesidade Grau III (mórbida)";
                }
                Intent it = new Intent(getBaseContext(), SecondActivity.class);
                Bundle params = new Bundle();

                params.putString("nameOut", varName);
                params.putString("ageOut", varAge);
                params.putString("weightOut", varWeight);
                params.putString("heightOut", varHeight);
                params.putString("imcOut", String.valueOf(imc));
                params.putString("classOut", classificacao);

                it.putExtras(params);
                startActivity(it);

            }
        });
    }
}