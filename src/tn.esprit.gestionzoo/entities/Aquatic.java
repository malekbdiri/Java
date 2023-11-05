package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
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