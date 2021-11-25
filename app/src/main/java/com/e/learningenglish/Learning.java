package com.e.learningenglish;

public class Learning extends Words
{
    private int countLearndWords;

    public Learning(String[] englishWord,String[] hebrewWords)
    {
        super(englishWord, hebrewWords);
        this.countLearndWords=0;
    }

    public int getCountLearndWords()
    {
        return this.countLearndWords;
    }

    public void setCountLearndWords(int countLearndWords)
    {
        this.countLearndWords = countLearndWords;
    }

    @Override
    public String toString()
    {
        return super.toString()+ ", Amount of learned words:"+this.countLearndWords;
    }


}
