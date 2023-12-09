public interface IGestion<T> {
    void ajouterEmploye(T var1);

    boolean rechercherEmploye(String var1);

    boolean rechercherEmploye(T var1);

    void supprimerEmploye(T var1);

    void displayEmploye();

    void trierEmployeParId();

    void trierEmployeParNomDepartementEtGrade();
}

