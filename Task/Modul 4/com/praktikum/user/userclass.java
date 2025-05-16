package com.praktikum.user;

public abstract class userclass {
    //attribut
    private String Student_Id;
    private String Name;

    //constructor
    public userclass(String Student_Id, String Name){
        this.Student_Id = getStudent_Id();
        this.Name = getName();
    }

    //getter
    public String getStudent_Id(){
        return Student_Id;
    }

    //setter
    public void setStudent_Id(String student_Id){
        this.Student_Id = student_Id;
    }

    //getter
    public String getName(){
        return Name;
    }

    //setter
    public void setName(String Name){
        this.Name = Name;
    }

    //method yang akan dioveride di subsclass
    public boolean login(String InputName, String InputId){
        return false;
    }

    //method yang akan dioveride di subclass
    public abstract void DisplayInfo();{
    }
}
