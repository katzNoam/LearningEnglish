package com.e.learningenglish;

public class Words
{
    protected Word[] words;

    protected int countWords;

    public Words(Word[] words)
    {
        for(int i=0;i< words.length;i++)
        {
            this.words[i]=words[i];

        }
        this.countWords=words.length;
    }

    public Word [] getWords()
    {
        return this.words;
    }

    public int getCountWords()
    {
        return this.countWords;
    }

    public void setWords(Word[] words)
    {
        this.words = words;
    }

    public void setCountWords(int countWords)
    {
        this.countWords = countWords;
    }

    @Override
    public String toString()
    {
        String s="Words:[";
        for(int j=0;j<this.countWords-1;j++)
        {
            s=s+this.words[j].toString();
        }
        s=s+this.words[this.countWords-1].toString()+"]";
        return s;
    }

    public Word getWordByIndex(int i)
    {
        return this.words[i];
    }

    public void addingWord(Word word)
    {
        Word [] tempWord = new Word[this.countWords];
        for(int i=0;i<this.countWords;i++)
        {
            tempWord[i]=this.words[i];
        }
        this.countWords++;
        this.words = new Word[this.countWords];
        for(int j=0;j<this.countWords-1;j++)
        {
            this.words[j]=tempWord[j];
        }
        this.words[this.countWords-1]=word;
    }
}
