package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.interfaces.Omnivore;
public final class Terrestrial extends Animal implements Omnivore<Food>  {
    private int nbrLegs;

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial (){

    }
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public String toString() {

        return super.toString() + "Habitat: " +nbrLegs;
    }
    @Override
    public void eatPlantAndMeet(Food food) {
        if(food==Food.BOTH) System.out.println("i eat meat and plants");
    }

    @Override
    public void eatMeat(Food meat) {
        if(meat==Food.MEAT) System.out.println("i eat meat");
    }

    @Override
    public void eatPlant(Food plant) {
        if(plant==Food.PLANT) System.out.println("i eat plants");
    }
}
