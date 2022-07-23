package com.example.myapplicationtest;

//소환
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity {

    private Button but1;
    private Button but2;
    private Button but3;
    private WordDao mWordDao;



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


        WordDatabase database = Room.databaseBuilder(getApplicationContext(), WordDatabase.class, "french.db")
                .createFromAsset(("mydb.db"))
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();


        mWordDao = database.wordDao();

        Word word = new Word();
        word.setBook("프랑스어 첫걸음");
        word.setUnit("1과");
        word.setMots("Bonjour");
        word.setMeaning("안녕하세요");

        mWordDao.setInsertWord(word);

    }
}