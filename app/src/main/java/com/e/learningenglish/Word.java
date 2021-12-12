package com.e.learningenglish;

public class Word
{
    private String word;
    private String translation;
    private int level;// 

    public Word(String word, String translation)
    {
        this.word = word;
        this.translation = translation;
    }

    public String getWord()
    {
        return word;
    }

    public String getTranslation()
    {
        return translation;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public void setTranslation(String translation)
    {
        this.translation = translation;
    }

    public String toString()
    {
        return "Word="+this.word+", translation="+this.translation;
    }


}
