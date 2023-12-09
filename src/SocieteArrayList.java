import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employee> {

    ArrayList<Employee> employees;


    public SocieteArrayList() {
        this.employees = new ArrayList<>();
    }
    
    @Override
    public void ajouterEmploye(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee employee : employees) {
            if (employee.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }


    public boolean rechercherEmploye(Employee employee) {
        return employees.contains(employee);
    }


    public void supprimerEmploye(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Integer.compare(emp1.getIdentifiant(), emp2.getIdentifiant());
            }
        });
    }



    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                int compareNom = emp1.getNom().compareTo(emp2.getNom());
                if (compareNom == 0) {
                    int compareDepartement = emp1.getDepartement().compareTo(emp2.getDepartement());
                    if (compareDepartement == 0) {
                        return Integer.compare(emp1.getGrade(), emp2.getGrade());
                    }
                    return compareDepartement;
                }
                return compareNom;
            }
        });
    }
}