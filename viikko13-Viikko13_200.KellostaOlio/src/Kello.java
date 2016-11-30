
public class Kello {

    private YlhaaltaRajoitettuLaskuri tunnit;
    private YlhaaltaRajoitettuLaskuri minuutit;
    private YlhaaltaRajoitettuLaskuri sekunnit;

    public Kello(int tunnitAlussa, int minuutitAlussa, int sekunnitAlussa) {
        // luodaan kello joka asetetaan parametrina annettuun aikaan
        this.tunnit = new YlhaaltaRajoitettuLaskuri(23);
        this.tunnit.asetaArvo(tunnitAlussa);
        this.minuutit = new YlhaaltaRajoitettuLaskuri(59);
        this.minuutit.asetaArvo(minuutitAlussa);
        this.sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        this.sekunnit.asetaArvo(sekunnitAlussa);
    }

    public void etene() {
        // kello etenee sekunnilla
        this.sekunnit.seuraava();
        if (this.sekunnit.arvo() == 0) {
            this.minuutit.seuraava();
            if (this.minuutit.arvo() == 0) {
                this.tunnit.seuraava();
            }
        }
    }

    public String toString() {
        // palauttaa kellon merkkijonoesityksen
        return tunnit + ":" + minuutit + ":" + sekunnit;
    }
}
