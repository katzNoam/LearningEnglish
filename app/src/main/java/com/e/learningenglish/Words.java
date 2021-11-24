package com.e.learningenglish;

import java.util.Arrays;

public class Words
{
    protected String[] englishWords;
    protected String[] hebrewWords;
    protected int countWords;

    public Words(String[] englishWord,String[] hebrewWords)
    {
        for(int i=0;i< englishWord.length;i++)
        {
            this.englishWords[i]=englishWord[i];
            this.hebrewWords[i]=hebrewWords[i];
        }
        this.countWords=englishWord.length;
    }

    public String [] getEnglishWords()
    {
        return this.englishWords;
    }

    public String [] getHebrewWords()
    {
        return this.hebrewWords;
    }

    public int getCountWords()
    {
        return this.countWords;
    }

    public void setEnglishWords(String[] englishWords)
    {
        this.englishWords = englishWords;
    }

    public void setHebrewWords(String[] hebrewWords)
    {
        this.hebrewWords = hebrewWords;
    }

    public void setCountWords(int countWords)
    {
        this.countWords = countWords;
    }

    @Override
    public String toString()
    {
        String s="English words:[";
        for(int j=0;j<this.countWords-1;j++)
        {
            s=s+this.englishWords[j];
        }
        s=s+this.englishWords[this.countWords-1]+"], Hebrew words:[";
        for(int i=0;i<this.countWords-1;i++)
        {
            s=s+this.hebrewWords[i];
        }
        s=s+this.hebrewWords[this.countWords-1]+"], Amount of words:"+this.countWords;
        return s;
    }

    public String getEnglishWordByIndex(int i)
    {
        return this.englishWords[i];
    }

    public String getHebrewWordByIndex(int i)
    {
        return this.hebrewWords[i];
    }

    public void addingWord(String englishWord, String hebrewWord)
    {
        String [] tempEnglishWord = new String[this.countWords];
        String [] tempHebrewWord = new String[this.countWords];
        for(int i=0;i<this.countWords;i++)
        {
            tempEnglishWord[i]=this.englishWords[i];
            tempHebrewWord[i]=this.hebrewWords[i];
        }
        this.countWords++;
        this.englishWords = new String[this.countWords];
        this.hebrewWords = new String[this.countWords];
        for(int j=0;j<this.countWords-1;j++)
        {
            this.englishWords[j]=tempEnglishWord[j];
            this.hebrewWords[j]=tempHebrewWord[j];
        }
        this.englishWords[this.countWords-1]=englishWord;
        this.hebrewWords[this.countWords-1]=hebrewWord;
    }
}
