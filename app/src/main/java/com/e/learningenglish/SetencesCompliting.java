package com.e.learningenglish;

import java.util.Arrays;

public class SetencesCompliting extends Tests
{
    private String[] listOfSetences;

    public SetencesCompliting(String[] englishWord, String[] hebrewWords, String[] listOfOptions, String[] listOfSetences)
    {
        super(englishWord, hebrewWords, listOfOptions);
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
        return super.toString();
    }
}
