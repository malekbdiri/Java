package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{

    private float swimmingDepth;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public Penguin() {}
    public Penguin(String habitat, int age, String name, String family, boolean isMammal, float swimmingSpeed) {
        super(habitat, age, name, family, isMammal);
        this.swimmingDepth = getSwimmingDepth();
    }
    public String toString() {

        return super.toString() + "Habitat: " +swimmingDepth;
    }
}
