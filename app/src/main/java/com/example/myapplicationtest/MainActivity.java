package com.example.myapplicationtest;

//소환
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity {

    private Button but1;
    private Button but2;
    private Button but3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1=findViewById(R.id.but1);

        but1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            startActivity(intent);
        });

        but2=findViewById(R.id.but2);

        but2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SubActivity333.class);
            startActivity(intent);
        });
    }
}