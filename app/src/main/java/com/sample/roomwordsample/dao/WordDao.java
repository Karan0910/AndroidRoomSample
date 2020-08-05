package com.sample.roomwordsample.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.sample.roomwordsample.entity.Word;

import java.util.List;

@Dao
public interface WordDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    @Query("Delete from table_word")
    void deleteAll();

    @Query("Select * from table_word ORDER BY word ASC")
    LiveData<List<Word>> getAlphabeticalOrder();

}
