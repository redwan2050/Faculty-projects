package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah13;

public class sabah12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah12);
        ImageButton Next12=findViewById(R.id.Next12);
        Next12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah13=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah13.class);
                startActivity(sabah13);
                finish();
            }
        });
    }
}
