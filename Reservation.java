import java.util.Date;

public class Reservation {
    private Livre livre;
    private Emprunteur emprunteur;
    private Date dateReservation;

    public Reservation(Livre livre, Emprunteur emprunteur, Date dateReservation) {
        this.livre = livre;
        this.emprunteur = emprunteur;
        this.dateReservation = dateReservation;
    }

    public Livre getLivre() {
        return livre;
    }

    public Emprunteur getEmprunteur() {
        return emprunteur;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    @Override
    public String toString() {
        return "Reservation{livre=" + livre + ", emprunteur=" + emprunteur
                + ", date=" + dateReservation + "}";
    }
}