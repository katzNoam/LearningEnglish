package com.e.learningenglish;

import java.util.Arrays;

public class Users
{
    private User[] users;
    private int countUsers;

    public Users()
    {
        this.users=new User[1000];
        this.countUsers=0;
    }

    public User[] getUsers()
    {
        return users;
    }

    public int getCountUsers()
    {
        return countUsers;
    }

    public void setUsers(User[] users)
    {
        this.users = users;
    }

    public void setCountUsers(int countUsers)
    {
        this.countUsers = countUsers;
    }

    @Override
    public String toString()
    {
        String s="[";
        for(int i=0;i<this.countUsers-1;i++)
        {
            s=s+this.users[i].toString()+", ";
        }
        s=s+this.users[this.countUsers-1].toString()+"], Amount of users:"+this.countUsers;
        return s;
    }

    public User getUserByIndex(int i)
    {
        return this.users[i];
    }

    public void addingUser(User user)
    {
        if(this.countUsers<1000)
        {
            this.users[this.countUsers]=user;
            this.countUsers++;
        }
        else
        {
            System.out.println("There is no space for another user!");
        }
    }
}
