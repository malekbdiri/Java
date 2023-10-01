public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages=25;
    int nbrAnimals;

    Zoo(){}
    Zoo(String name,String city,int nbrCages){
        this.animals=new Animal[nbrCages];
        this.city=city;
        this.name=name;


    }
    void displayZoo(){
        System.out.println("nom: "+name+" city: "+city+" nombre de cages: "+nbrCages);

    }

    public String toString()
    {
        return "nom: "+name+" city: "+city+" nombre de cages: "+nbrCages;
    }
    boolean AddAnimal(Animal animal){

        if(nbrCages==nbrAnimals)
            return false;

        if(searchAnimal(animal)==-1){
            animals[nbrAnimals]=animal;
            nbrAnimals++;
            return true;
        }



        return false;
    }

    int searchAnimal(Animal animal){
        int trouver=-1;
        for (int i=0;i<this.nbrAnimals;i++) {
            if (animal.name == animals[i].name) {
                trouver = i;
            }
        }
        return trouver;
    }

    boolean isZooFull(){
        if(nbrCages==nbrAnimals)
            return true;
        return false;
    }
    Zoo comparerZoo(Zoo z1,Zoo z2){
        if(z1.nbrAnimals>= z2.nbrAnimals)
            return z1;
        return z2;
    }


}