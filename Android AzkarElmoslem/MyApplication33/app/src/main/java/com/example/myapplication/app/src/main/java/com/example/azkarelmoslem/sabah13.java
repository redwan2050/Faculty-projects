package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah14;

public class sabah13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah13);
        ImageButton Next13=findViewById(R.id.Next13);
        Next13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah14=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah14.class);
                startActivity(sabah14);
                finish();
            }
        });
    }
}
