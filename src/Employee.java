public class Employee implements Comparable<Employee> {
    private int identifiant;
    private int grade;
    private String nom;
    private String prenom;
    private String departement;

    public Employee() {
    }

    public Employee(int identifiant, int grade, String nom, String prenom, String departement) {
        this.identifiant = identifiant;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
    }

    public int getIdentifiant() {
        return this.identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return this.departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String toString() {
        return "Employee{ identifiant=" + this.identifiant + ", grade=" + this.grade + ", nom=" + this.nom + ", prenom=" + this.prenom + ", departement=" + this.departement + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Employee)) {
            return false;
        } else {
            Employee employe = (Employee)o;
            return this.getIdentifiant() == employe.getIdentifiant() && this.getNom().equals(employe.getNom());
        }
    }

    public int compareTo(Employee o) {

        return this.identifiant - o.identifiant;
    }
}
