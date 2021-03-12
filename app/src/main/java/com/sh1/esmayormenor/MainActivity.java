package com.sh1.esmayormenor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtField1;
    EditText txtField2;
    EditText txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtField1  = findViewById(R.id.txtField1);
        txtField2 = findViewById(R.id.txtField2);
        txtResult = findViewById(R.id.txtResultado);
    }

    public void prueba(View v){
        if(txtField1.getText().toString().isEmpty()){ return; }
        if(txtField2.getText().toString().isEmpty()){ return; }
        if(Double.parseDouble(txtField1.getText().toString()) > (Double.parseDouble(txtField2.getText().toString())))
        {
            txtResult.setText(txtField1.getText().toString());
        }
        if(Double.parseDouble(txtField2.getText().toString()) > (Double.parseDouble(txtField1.getText().toString())))
        {
            txtResult.setText(txtField2.getText().toString());
        }
        txtField1.setText("");
        txtField2.setText("");
    }
    
}