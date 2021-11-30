package com.e.learningenglish;

public class Tests extends Words
{
    protected int countTestedWords;
    protected String[] listOfOptions;

    public Tests(Word[] words, String[] listOfOptions)
    {
        super(words);
        this.countTestedWords=0;
        for(int i=0;i< listOfOptions.length;i++)
        {
            this.listOfOptions[i]=listOfOptions[i];
        }
    }

    public int getCountTestedWords()
    {
        return countTestedWords;
    }

    public String[] getListOfOptions()
    {
        return listOfOptions;
    }

    public void setCountTestedWords(int countTestedWords)
    {
        this.countTestedWords = countTestedWords;
    }

    public void setListOfOptions(String[] listOfOptions)
    {
        this.listOfOptions = listOfOptions;
    }

    @Override
    public String toString()
    {
        String s= super.toString()+ ", Amount of tested words:"+this.countTestedWords+", Options: [";
        for(int i=0;i<listOfOptions.length-1;i++)
        {
            s=s+this.listOfOptions[i]+", ";
        }
        s=s+this.listOfOptions[listOfOptions.length-1]+"]";
        return s;
    }

    public String getOptionByIndex(int i)
    {
        return this.listOfOptions[i];
    }
}
