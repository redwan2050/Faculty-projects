package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah16;

public class sabah15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah15);
        ImageButton Next15=findViewById(R.id.Next15);
        Next15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah16=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah16.class);
                startActivity(sabah16);
                finish();
            }
        });
    }
}
