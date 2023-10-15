// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;

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
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(dog.toString());
        System.out.println("--------------------");
        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        System.out.println(myZoo.toString());
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(dog));
        System.out.println(myZoo.removeAnimal(lion));

        System.out.println("-----------compar---------");
        System.out.println(myZoo.isZooFull());
        // System.out.println(Zoo.comparerZoo(myZoo2,myZoo));
        myZoo.addAnimal(dog);
        System.out.println(myZoo.toString());

        Aquatic aquatic = new Aquatic("Fish", 2, "Sardine", "Sea", true);
        Terrestrial T = new Terrestrial("Panda", "Marla", 2, true, 12);

        System.out.println(aquatic);
        System.out.println(T);
        aquatic.swim();


    }

}
