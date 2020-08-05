package com.sample.roomwordsample.entity;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_word")
public class Word {

    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @PrimaryKey(autoGenerate = true)
    private int id;

    public String getmWord() {
        return mWord;
    }

    public void setmWord(String mWord) {
        this.mWord = mWord;
    }


}
