package com.example.myapplication.app.src.main.java.com.example.azkarelmoslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.azkarelmoslem.sabah25;

public class sabah24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah24);
        ImageButton Next24=findViewById(R.id.Next24);
        Next24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sabah25=new Intent(getApplicationContext(), com.example.azkarelmoslem.sabah25.class);
                startActivity(sabah25);
                finish();
            }
        });
    }
}
