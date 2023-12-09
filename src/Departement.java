import java.util.Objects;

public class Departement {
    int id;

    public String getNomDepartement() {
        return nomDepartement;
    }


    String nomDepartement ;
    int nbrEmployes ;

    public Departement() {
    }

    public Departement(int id, String nomDepartement, int nbrEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmployes = nbrEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == that.id && Objects.equals(nomDepartement, that.nomDepartement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbrEmployes=" + nbrEmployes +
                '}';
    }
}