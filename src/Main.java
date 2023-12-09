// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{

        public static void main(String[] args){

            DepartementHashSet departementHashSet = new DepartementHashSet();
            Departement departement1=new Departement(1,"a",200);
            Departement departement2=new Departement(2,"b",300);
            Departement departement3=new Departement(3,"c",400);
            Departement departement4=new Departement(4,"m",1000);
            departementHashSet.ajouterDepartement(departement1);
            departementHashSet.ajouterDepartement(departement2);
            departementHashSet.ajouterDepartement(departement3);


            departementHashSet.supprimerDepartement(departement4);
            departementHashSet.displayDepartement();
            System.out.println(departementHashSet.trierDepartementById());

        }
}