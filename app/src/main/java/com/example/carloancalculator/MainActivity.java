package com.example.carloancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView textPrice;
    private TextView textPayment;
    private TextView textInterest;
    private TextView textTime;
    private EditText editPrice;
    private EditText editPayment;
    private EditText editInterest;
    private EditText editTime;
    private Button button;
    private ToggleButton toggleButton;
    private TextView textResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textPrice = findViewById(R.id.textPrice);
        textPayment = findViewById(R.id.textPayment);
        textInterest = findViewById(R.id.textInterest);
        textTime = findViewById(R.id.textTime);
        editPrice = findViewById(R.id.editPrice);
        editPayment = findViewById(R.id.editPayment);
        editInterest = findViewById(R.id.editInterest);
        editTime = findViewById(R.id.editTime);
        button = findViewById(R.id.button);
        toggleButton = findViewById(R.id.toggleButton);
        textResult = findViewById(R.id.textResult);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ar = Integer.parseInt(editInterest.getText().toString());
                int mr =Integer.parseInt(String.valueOf(ar/12));
                int L =Integer.parseInt(editPrice.getText().toString());
                if (toggleButton.isChecked()) {
                    int n = Integer.parseInt(String.valueOf(36));
                    if (mr == 0) {

                    }
                    textResult.setText("Your payment is " + (mr * L / 1 - Math.pow(1 + mr,-n)  + "!"));
                }
                else {
                    int n = Integer.parseInt(editTime.getText().toString());

                    textResult.setText("Your payment is " + (mr * L / 1 - (1 + mr) ^ (-n)) + "!");
                }
            }
        });


    }

}