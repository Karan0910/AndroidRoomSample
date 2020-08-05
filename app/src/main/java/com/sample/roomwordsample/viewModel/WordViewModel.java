package com.sample.roomwordsample.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.sample.roomwordsample.database.WordRepository;
import com.sample.roomwordsample.entity.Word;

import java.util.List;

public class WordViewModel extends AndroidViewModel {


    private WordRepository repository;
    private LiveData<List<Word>> mWordList;

    public WordViewModel( Application application) {
        super(application);
        repository=new WordRepository(application);
        mWordList=repository.getAllWords();
    }
    public LiveData<List<Word>> getWordList(){
        return  mWordList;
    }

    public void insertWord(Word word){
        repository.insert(word);
    }

}
