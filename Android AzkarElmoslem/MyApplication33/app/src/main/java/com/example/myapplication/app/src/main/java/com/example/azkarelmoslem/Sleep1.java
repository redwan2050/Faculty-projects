package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sleep2;

public class Sleep1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep1);
        ImageButton Next_sleep1=findViewById(R.id.Next_sleep1);
        Next_sleep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep2=new Intent(getApplicationContext(), com.example.azkarelmoslem.sleep2.class);
                startActivity(sleep2);
                finish();

            }
        });
    }
}
