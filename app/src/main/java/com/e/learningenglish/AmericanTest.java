package com.e.learningenglish;

import java.util.Arrays;

public class AmericanTest extends Words
{
    private Word[] listOfOptions;
    public AmericanTest(Word[] words, Word[] listOfOptions)
    {
        super(words);
        this.listOfOptions=new Word[listOfOptions.length];
        for(int i=0;i<listOfOptions.length;i++)
        {
            this.listOfOptions[i]=listOfOptions[i];
        }
    }

    public Word[] getListOfOptions() {
        return listOfOptions;
    }

    public void setListOfOptions(Word[] listOfOptions) {
        this.listOfOptions = listOfOptions;
    }

    @Override
    public String toString() {
        String s = super.toString()+"List of options: [";
        for(int i=0;i<listOfOptions.length-1;i++)
        {
            s=s+this.listOfOptions[i].toString()+", ";
        }
        s=s+this.listOfOptions[listOfOptions.length-1].toString()+"]";
        return s;
    }

    public Word getOptionByIndex(int i)
    {
        return this.listOfOptions[i];
    }
}
