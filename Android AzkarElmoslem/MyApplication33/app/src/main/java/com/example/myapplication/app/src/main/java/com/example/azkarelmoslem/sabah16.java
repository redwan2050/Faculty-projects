package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah17;

public class sabah16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah16);
        ImageButton Next16=findViewById(R.id.Next16);
        Next16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah17=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah17.class);
                startActivity(sabah17);
                finish();
            }
        });
    }
}
