package com.e.learningenglish;

public class Learning extends Words
{
    private int countLearnedWords;

    public Learning(Word[] words)
    {
        super(words);
        this.countLearnedWords=0;
    }

    public int getCountLearndWords()
    {
        return this.countLearnedWords;
    }

    public void setCountLearndWords(int countLearnedWords)
    {
        this.countLearnedWords = countLearnedWords;
    }

    @Override
    public String toString()
    {
        return super.toString()+ ", Amount of learned words:"+this.countLearnedWords;
    }


}
