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
 // Ajouter une methode pour rechercher un livre par titre
    @Override
    public String toString() {
        return "Bibliotheque{livres=" + livres + "}";
    }
}