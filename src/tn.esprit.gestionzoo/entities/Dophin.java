package tn.esprit.gestionzoo.entities;

public class Dophin extends Aquatic {
    private float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public Dophin()
    {
        super();
    }

    public Dophin(String habitat, int age, String name, String family, boolean isMammal, float swimmingSpeed) {
        super(habitat, age, name, family, isMammal);
        this.swimmingSpeed = swimmingSpeed;
    }
    public void swim()
    {
        System.out.println("The dolphin is swimming");
    }
    @Override
    public String toString() {

        return super.toString() + "Habitat: " +swimmingSpeed;
    }
}