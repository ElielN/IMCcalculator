package com.example.imccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent it = getIntent();
        Bundle params = it.getExtras();

        Button buttonNewCal = (Button) findViewById(R.id.buttonNewCal);

        final TextView nameOut = (TextView) findViewById(R.id.nameOut);
        final TextView ageOut = (TextView) findViewById(R.id.ageOut);
        final TextView weightOut = (TextView) findViewById(R.id.weightOut);
        final TextView heightOut = (TextView) findViewById(R.id.heightOut);
        final TextView imcOut = (TextView) findViewById(R.id.imcOut);
        final TextView classOut = (TextView) findViewById(R.id.classOut);
        nameOut.setText(params.getString("nameOut"));
        ageOut.setText(params.getString("ageOut"));
        weightOut.setText(params.getString("weightOut"));
        heightOut.setText(params.getString("heightOut"));
        imcOut.setText(params.getString("imcOut"));
        classOut.setText(params.getString("classOut"));

        buttonNewCal.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
//                Double firstValue = Double.parseDouble(value1.getText().toString());
//                Double secondValue = Double.parseDouble(value2.getText().toString());
//                result.setText(String.valueOf(secondValue+firstValue));
//                Intent it = new Intent(getBaseContext(), SecondActivity.class);
//                startActivity(it);
                finish();

            }
        });
    }
}