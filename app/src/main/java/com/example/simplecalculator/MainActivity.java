package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1, number2;
    Button add, subtract, divide, multiply;

    float result_num;
    float num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat( number1.getText().toString());
                num2=Float.parseFloat( number2.getText().toString());

                result_num=num1+num2;
                result.setText(String.valueOf(result_num));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat( number1.getText().toString());
                num2=Float.parseFloat( number2.getText().toString());

                result_num=num1-num2;
                result.setText(String.valueOf(result_num));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat( number1.getText().toString());
                num2=Float.parseFloat( number2.getText().toString());

                result_num=num1*num2;
                result.setText(String.valueOf(result_num));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat( number1.getText().toString());
                num2=Float.parseFloat( number2.getText().toString());

                result_num=num1/num2;
                result.setText(String.valueOf(result_num));
            }
        });


    }

}
