package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import java.util.Arrays;
public class Zoo {
    final private Animal [] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private int count;
    private String city;
    private final int NBR_CAGES=3;
    private int nbrAquatics;
    int nbrAnimals=0;

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
    public int getNbrAquatics() {
        return nbrAquatics;
    }
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

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }
    public Zoo(String name, String city)
    {

        this.name=name;
        this.city=city;
        animals=new Animal[NBR_CAGES];
        aquaticAnimals = new Aquatic[10];
    }

    public void displayZoo(){
        System.out.println("Name: "+name+",City: "+city+"N° Cages:" +NBR_CAGES);
    }

    public void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException {
        if (searchAnimal(animal) != -1)
            System.out.println("This animal already exist");
        if (isZooFull()) {
            throw new ZooFullException("The Zoo is full");
        }
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Invalid age for animal: " + animal.getName());
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
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
    public void addAquaticAnimal(Aquatic aquatic){


        if (count < aquaticAnimals.length) {
            aquaticAnimals[count] = aquatic;
            count++;
            System.out.println(Arrays.toString(aquaticAnimals));
        } else {
            System.out.println("No more space for aquatic animals in the zoo!");
        }
    }
    public void displaySwimmingOfAquaticAnimals() {
        for (int i = 0; i < count; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dophin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }
}