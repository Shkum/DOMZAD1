package com.shkum1;

import java.util.ArrayList;

public class DB extends ArrayList
{

    public ArrayList<User> db = new ArrayList<>();

    public void add (User user)
    {
        db.add (user);

}

    public String toString()
    {
        String res="";
        for (User user : db)
        {
            res+=user.fio + " " + user.ID + " " + user.login + " " + user.pass + "\n";
        }
        return res;
    }
}
