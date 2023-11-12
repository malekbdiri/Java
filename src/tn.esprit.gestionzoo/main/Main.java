// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dophin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Food;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;


public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("simba");
        lion.setAge(8);
        lion.setFamily("cats");
        lion.setIsMammal(true);

        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Zoo myZoo = new Zoo("wildlife city", "Ariana");
        Zoo myZoo2 = new Zoo("new york city", "Tunis");
        myZoo.displayZoo();

        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(dog);
            myZoo.addAnimal(lion);
            myZoo.addAnimal(dog);
              }
        catch ( ZooFullException e){
            System.out.println("Erreur: " + e.getMessage());
        }
        catch ( InvalidAgeException e){
            System.out.println("Erreur: " + e.getMessage());}

        myZoo.displayAnimals();


        Dophin d = new Dophin();
        d.setSwimmingSpeed(24.5f);
        Dophin d1 = new Dophin();
        d1.setSwimmingSpeed(21.8f);
        Dophin d2 = new Dophin();
        d2.setSwimmingSpeed(20.3f);
        Dophin d3 = new Dophin();
        d3.setSwimmingSpeed(22.6f);


        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);
        Penguin p = new Penguin();
        p.setSwimmingDepth(24.6f);
        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(29.6f);
        Penguin p2 = new Penguin();
        p2.setSwimmingDepth(219.6f);
        Penguin p3 = new Penguin();
        p1.setSwimmingDepth(2.6f);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);
        myZoo.addAquaticAnimal(new Penguin());


        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

    }

    Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 6, true, 2);
        terrestrial.eatPlantAndMeet(Food.BOTH);

    Terrestrial terrestrial2 = new Terrestrial("Rabbits", "Bugs bunny", 4, true, 2);
        terrestrial2.eatPlants(Food.PLANTS);
    Aquatic a = new Aquatic("Fish", "Sardine", 2, true, "Sea"){
        public void swim() {
            System.out.println("This aquatic animal swims.");
        }
    } ;

        a.eatMeat(Food.MEAT);
        penguin.eatMeat(Food.MEAT);

}

}
