package tn.esprit.gestionzoo.entities;

public class Zoo {
    final private Animal [] animals;

    private String name;

    private String city;
    private final int NBR_CAGES=25;
    int nbrAnimals=0;


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
    public String getCity()
    {
        return this.city;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public Zoo()
    {
        animals=new Animal[NBR_CAGES];
    }
    public Zoo(String name, String city)
    {

        this.name=name;
        this.city=city;
        animals=new Animal[NBR_CAGES];
    }

    public void displayZoo(){
        System.out.println("Name: "+name+",City: "+city+"N° Cages:" +NBR_CAGES);
    }
    public boolean addAnimal(Animal animal){
        if(searchAnimal(animal) !=-1) {
            return false;
        }

        if(!isZooFull())
        {
            animals[nbrAnimals]=animal;
            nbrAnimals++;
            return true;
        }
        else return false;

    }
    public void displayAnimals()
    {
        System.out.println("Liste des animaux de "+name+":");
        for(int i=0; i<nbrAnimals;i++) {
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal){
        int index =-1;
        for (int i=0;i<nbrAnimals;i++)
        {
            if(animal.getName() == animals[i].getName()) {
                return i;
            }
        }
        return index;
    }
    public boolean removeAnimal(Animal animal){
        int indexAnimal =searchAnimal(animal);
        if(indexAnimal == -1)
        {
            return false;
        }
        for(int i=indexAnimal ;i<nbrAnimals;i++)
        {
            animals[i]=animals[i+1];

        }
        animals[nbrAnimals]=null;
        nbrAnimals--;
        return true;
    }
    public String toString()
    {
        return "Name: "+name+",City: "+city+"N° Cages:" +NBR_CAGES;
    }
    public boolean isZooFull()
    {
        return nbrAnimals==NBR_CAGES;
    }
    public static Zoo comparer(Zoo z1,Zoo z2 ) {

        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }


}