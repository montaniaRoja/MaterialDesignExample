package com.example.materialdesignexample;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClickMe=findViewById(R.id.btnClickMe);

        btnClickMe.setOnClickListener(e->Toast.makeText(this, "Saludos", Toast.LENGTH_SHORT).show());



    }
}