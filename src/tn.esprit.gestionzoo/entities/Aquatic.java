package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.interfaces.Carnivore;
import tn.esprit.gestionzoo.entities.Food;

public abstract non-sealed class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;


    public String getHabitat() {
        return habitat;

    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic() {
        super();
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat ==Food.MEAT) System.out.println("i eat meat");
    }
    public Aquatic(String habitat, int age, String name, String family, boolean isMammal) {
        super(family, name, age, isMammal);
        this.habitat = habitat;

    }

    public void swim()
    {
        System.out.println("This aquatic animal is swimming");
    }
    @Override
    public String toString() {

        return super.toString() + "Habitat: " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aquatic)) {
            return false;
        }
        Aquatic otherAquatic = (Aquatic) obj;
        return this.getName().equals(otherAquatic.getName()) &&
                this.getAge() == otherAquatic.getAge() &&
                this.habitat.equals(otherAquatic.habitat);
    }

}