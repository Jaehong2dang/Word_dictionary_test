package com.example.myapplicationtest;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void setInsertWord(Word word);

    @Update
    void setUpdateWord(Word word);

    @Delete
    void setDeleteWord(Word word);

    @Query("SELECT * FROM Word")
    List<Word> getWordAll();


}
