import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class DepartementHashSet implements IDepartement<Departement> {

    private Set<Departement> departements;

    // Constructeur
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    // Méthodes de l'interface IDepartement

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dept : departements) {
            if (dept.getNomDepartement().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement dept : departements) {
            System.out.println(dept);
        }
    }

    Comparator<Departement> compar1 = new Comparator<Departement>() {
        @Override
        public int compare(Departement D1, Departement D2) {
            return D1.getId() -D2.getId();
        }
    };
    public TreeSet<Departement>trierDepartementById(){

        TreeSet<Departement> SortedSet = new TreeSet<>(compar1);
        SortedSet.addAll(departements);
        return SortedSet;
    }
}
