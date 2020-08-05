package com.sample.roomwordsample.entity;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_word")
public class Word {

    public Word(String mWord){
        this.mWord=mWord;
    }
    @NonNull
    public String getmWord() {
        return mWord;
    }

    public int getId() {
        return id;
    }

    @NonNull
    @ColumnInfo(name = "word")
    public String mWord;


    @PrimaryKey(autoGenerate = true)
    public int id;





}
