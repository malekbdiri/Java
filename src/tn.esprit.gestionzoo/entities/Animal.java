package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.InvalidAgeException;

public class Animal {
    private   String name;
    private String family;
    private int age;
    private boolean isMammal;

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    { if(name.isBlank())
        System.out.println("un nom doit etre vide");
    else
        this.name=name;

    }
    public String getFamily()
    {
        return this.family;
    }
    public void setFamily(String family)
    {
        this.family=family;

    }
    public Boolean getIsMammal()
    {
        return isMammal;
    }
    public void setIsMammal(Boolean isMammal)
    {
        this.isMammal=isMammal;

    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    { if(age<0)
        System.out.println("un animal ne peut pas avoir un age négatif");
    else this.age=age;

    }
    public Animal(){

    }
    public Animal(String family, String name,int age, boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public String toString()
    {
        return "Animal :{"
                +"Family"+family+"\n"
                +",name: "+name+"\n"
                +"isMammal"+isMammal+"\n"
                +"}";
    }
}
