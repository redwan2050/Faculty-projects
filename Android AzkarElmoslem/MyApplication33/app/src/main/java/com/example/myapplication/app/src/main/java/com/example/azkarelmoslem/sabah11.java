package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah12;

public class sabah11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah11);
        ImageButton Next11=findViewById(R.id.Next11);
        Next11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah12=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah12.class);
                startActivity(sabah12);
                finish();
            }
        });
    }
}
