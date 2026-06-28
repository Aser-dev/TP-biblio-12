/**
  Ceci est une classe representant une bibliothèque et permettant de géré des livres.
 */

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
   
    public void reserverLivre(Livre livre, Emprunteur emprunteur){
            Reservation r= new Reservation( livre, emprunteur, "28062026");
            System.out.println("Livre réservé avec succès");
        }
 // Ajouter une methode pour rechercher un livre par titre
    @Override
    public String toString() {
        return "Bibliotheque{livres=" + livres + "}";
    }
}