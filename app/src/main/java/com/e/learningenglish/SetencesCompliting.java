package com.e.learningenglish;

import java.util.Arrays;

public class SetencesCompliting extends Words
{
    private Word[] listOfOptions;
    private Word[] listOfSetences;

    public SetencesCompliting(Word[] words, Word[] listOfOptions, Word[] listOfSetences)
    {
        super(words);
        this.listOfOptions=new Word[listOfOptions.length];
        this.listOfSetences=new Word[listOfSetences.length];
        for(int i=0;i<listOfOptions.length;i++)
        {
            this.listOfOptions[i]=listOfOptions[i];
        }
        for(int j=0;j<listOfSetences.length;j++)
        {
            this.listOfSetences[j]=listOfSetences[j];
        }
    }

    public Word[] getListOfOptions() {
        return listOfOptions;
    }

    public Word[] getListOfSetences()
    {
        return listOfSetences;
    }

    public void setListOfOptions(Word[] listOfOptions) {
        this.listOfOptions = listOfOptions;
    }

    public void setListOfSetences(Word[] listOfSetences)
    {
        this.listOfSetences = listOfSetences;
    }

    @Override
    public String toString()
    {
        String s = super.toString()+"List of options: [";
        for(int i=0;i<listOfOptions.length-1;i++)
        {
            s=s+this.listOfOptions[i].toString()+", ";
        }
        s=s+this.listOfOptions[listOfOptions.length-1].toString()+"], List of setences: [";
        for(int i=0;i<listOfSetences.length-1;i++)
        {
            s=s+this.listOfSetences[i].toString()+", ";
        }
        s=s+this.listOfSetences[listOfSetences.length-1].toString()+"]";
        return s;
    }

    public Word getOptionByIndex(int i)
    {
        return this.listOfOptions[i];
    }


    public Word getSetenceByIndex(int i)
    {
        return this.listOfSetences[i];
    }
}
