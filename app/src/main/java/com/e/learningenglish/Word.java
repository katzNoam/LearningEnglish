package com.e.learningenglish;

public class Word
{
    private String word;
    private String translation;
    private int level;// 1 or 2 or 3
    private int countTimesOfLearning;
    private int typeOfTest;//1=american test, 2=compliting setences


    public Word(String word, String translation, int level)
    {
        this.word = word;
        this.translation = translation;
        this.level=level;
        this.countTimesOfLearning=0;
        this.typeOfTest=(int)Math.random()*2+1;

    }

    public String getWord()
    {
        return word;
    }

    public String getTranslation()
    {
        return translation;
    }

    public int getLevel() {
        return level;
    }

    public int getCountTimesOfLearning() {
        return countTimesOfLearning;
    }

    public int getTypeOfTest() {
        return typeOfTest;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public void setTranslation(String translation)
    {
        this.translation = translation;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCountTimesOfLearning(int countTimesOfLearning) {
        this.countTimesOfLearning = countTimesOfLearning;
    }

    public void setTypeOfTest(int typeOfTest) {
        this.typeOfTest = typeOfTest;
    }


    public String toString()
    {
        String s="Word="+this.word+", translation="+this.translation+", level="+this.level+", times learned="+this.countTimesOfLearning;
        switch (this.typeOfTest)
        {
            case 1:s=s+", type of test:american test";
                    break;
            default: s=s+"type of test:compliting setences";
                    break;
        }
        return s;
    }


}
