import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> livres;

    public Bibliotheque(){
        this.livres = new ArrayList<Livre>();
    }

    public ArrayList<Livre> getLivres() {
        return livres;
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public boolean supprimerLivre(Livre livre) {
        return livres.remove(livre);
    }

    public void afficherLivres() {
        for(Livre livre : livres){
            System.out.println(livre);
        }
    }

    @Override
    public String toString() {
        return "Bibliotheque{livres=" + livres + "}";
    }
     public ArrayList<Livre> rechercheParTitre(String titre) {
        ArrayList<Livre> result = new ArrayList<Livre>();
        for (Livre livre : livres) {
            if (livre.getTitre().contains(titre)) {
                result.add(livre);
            }
        }
        return result;
    }

    public ArrayList<Livre> rechercheParAuteur(String auteur) {
        ArrayList<Livre> result = new ArrayList<Livre>();
        for (Livre livre : livres) {
            if (livre.getAuteur().contains(auteur)) {
                result.add(livre);
            }
        }
        return result;
    }

    // ...
}
