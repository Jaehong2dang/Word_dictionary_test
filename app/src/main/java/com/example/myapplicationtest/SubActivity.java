package com.example.myapplicationtest;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;


@SuppressWarnings("FieldCanBeLocal")
public class SubActivity extends AppCompatActivity{

    private Button but1_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        but1_1=findViewById(R.id.but1_1);

        but1_1.setOnClickListener(view -> {
            Intent intent = new Intent(SubActivity.this, SubActivity222.class);
            startActivity(intent);
        });
    }
}
