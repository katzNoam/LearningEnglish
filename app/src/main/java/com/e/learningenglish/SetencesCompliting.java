package com.e.learningenglish;

import java.util.Arrays;

public class SetencesCompliting extends Tests
{
    private String[] listOfSetences;

    public SetencesCompliting(Word[] words, String[] listOfOptions, String[] listOfSetences)
    {
        super(words, listOfOptions);
        for(int i=0;i<listOfSetences.length;i++)
        {
            this.listOfSetences[i]=listOfSetences[i];
        }
    }

    public String[] getListOfSetences()
    {
        return listOfSetences;
    }

    public void setListOfSetences(String[] listOfSetences)
    {
        this.listOfSetences = listOfSetences;
    }

    @Override
    public String toString()
    {
        String s = super.toString()+"List of setences:";
        for(int i=0;i<listOfSetences.length-1;i++)
        {
            s=s+this.listOfSetences[i]+", ";
        }
        s=s+this.listOfSetences[listOfSetences.length-1]+"]";
        return s;
    }

    public String getSetenceByIndex(int i)
    {
        return this.listOfSetences[i];
    }
}
