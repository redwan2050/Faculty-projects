package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah21;

public class sabah20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah20);
        ImageButton Next20=findViewById(R.id.Next20);
        Next20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah21=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah21.class);
                startActivity(sabah21);
                finish();
            }
        });
    }
}
