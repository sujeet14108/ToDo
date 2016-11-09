package com.example.sujeet.todo;

import java.io.Serializable;

/**
 * Created by sujeet on 8/11/16.
 */

public class Student  implements Serializable {
    public String name,des,year;


    public  String getname( )
    {
        return name;

    }

    public  String getyear( )
    {
        return year;

    }

    public  String getdes( )
    {
        return des;

    }
}

