package com.e.learningenglish;

public class Tests extends Words
{
    protected int countTestedWords;

    public Tests(String[] englishWord,String[] hebrewWords)
    {
        super(englishWord, hebrewWords);
        this.countTestedWords=0;
    }

    public int getCountTestedWords()
    {
        return countTestedWords;
    }

    public void setCountTestedWords(int countTestedWords)
    {
        this.countTestedWords = countTestedWords;
    }

    @Override
    public String toString()
    {
        return super.toString()+ ", Amount of tested words:"+this.countTestedWords;
    }
}
