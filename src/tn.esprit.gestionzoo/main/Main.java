// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.ZooFullException;
import tn.esprit.gestionzoo.entities.InvalidAgeException;



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
        catch (InvalidAgeException a){System.out.println("Erreur: " + a.getMessage());}

        myZoo.displayAnimals();



        Aquatic aquatic = new Aquatic("Fish", 2, "Sardine", "Sea", true);
        Terrestrial T = new Terrestrial("Panda", "Marla", 2, true, 12);

        System.out.println(aquatic);
        System.out.println(T);
        aquatic.swim();

        myZoo.addAquaticAnimal(dophin);
        myZoo.addAquaticAnimal(penguin);

        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);

        myZoo.displaySwimmingOfAquaticAnimals();
        myZoo.maxPenguinSwimmingDepth();
        myZoo.displayNumberOfAquaticsByType();


    }

}
