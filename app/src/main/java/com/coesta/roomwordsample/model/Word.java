package com.coesta.roomwordsample.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    public String mWord;

    public Word(@NonNull String word){
        this.mWord = word;
    }

    @NonNull
    public String getmWord() {
        return mWord;
    }
}
