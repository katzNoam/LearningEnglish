package com.e.learningenglish;

public class User
{
    private String name;
    private String password;
    private String Email;
    private String level;
    private String[] learnedWords;

    public User(String name, String password, String Email)
    {
        this.name=name;
        this.password=password;
        this.Email=Email;
        this.level="Beginner";
        this.learnedWords=new String[100];//need to bee changed!
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public String getEmail()
    {
        return Email;
    }

    public String getLevel()
    {
        return level;
    }

    public String[] getLearnedWords()
    {
        return learnedWords;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setEmail(String email)
    {
        Email = email;
    }

    public void setLevel(String level)
    {
        this.level = level;
    }

    public void setLearnedWords(String[] learnedWords)
    {
        this.learnedWords = learnedWords;
    }

    public String toString()
    {
        String s= "Name:"+this.name+", Password:"+this.password+", Email:"+this.Email+", Level:"+this.level+", Learned words:[";
        for(int i=0;i<this.learnedWords.length-1;i++)
        {
            s=s+this.learnedWords[i]+", ";
        }
        s=s+this.learnedWords[this.learnedWords.length-1]+"]";
        return s;
    }

    public String getWordByIndex(int i)
    {
        return this.learnedWords[i];
    }

    public void leveledUp()
    {
        if(this.level.equals("Beginner"))
        {
            this.level="Expert";
        }
        else if(this.level.equals("Expert"))
        {
            this.level="Master";
        }
    }
}
