package com.example.myapplicationtest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("FieldCanBeLocal")
public class SubActivity333 extends AppCompatActivity {

    private Button but2_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub333);

        but2_1=findViewById(R.id.but2_1);

        but2_1.setOnClickListener(view -> {
            Intent intent = new Intent(SubActivity333.this, ListActivity.class);
            startActivity(intent);
        });
    }
}
