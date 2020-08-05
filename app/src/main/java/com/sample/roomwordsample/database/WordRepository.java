package com.sample.roomwordsample.database;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.sample.roomwordsample.dao.WordDao;
import com.sample.roomwordsample.entity.Word;

import java.util.List;

public class WordRepository {

    private WordDao mWordDao;
    private LiveData<List<Word>> mWordsList;

    public WordRepository(Application application){
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mWordsList = mWordDao.getAlphabeticalOrder();
    }


    public LiveData<List<Word>> getAllWords() {
        return mWordsList;
    }


    public void insert(Word word) {
        WordRoomDatabase.databaseWriteExecutor.execute(() -> {
            mWordDao.insert(word);
        });
    }
}
