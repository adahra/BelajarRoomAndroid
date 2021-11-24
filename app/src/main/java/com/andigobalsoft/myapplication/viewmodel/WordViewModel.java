package com.andigobalsoft.myapplication.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.andigobalsoft.myapplication.model.Word;
import com.andigobalsoft.myapplication.repository.WordRepository;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private final LiveData<List<Word>> mAllWords;
    private final WordRepository mRepository;

    public WordViewModel(Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }
}
