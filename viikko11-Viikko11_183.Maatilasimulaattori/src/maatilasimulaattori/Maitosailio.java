package maatilasimulaattori;

public class Maitosailio {
    private double tilavuus;
    private double saldo;
    
    public Maitosailio() {
        this.tilavuus = 2000;
    }

    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getSaldo() {
        return saldo;
    }

    public double paljonkoTilaaJaljella() {
        return this.tilavuus - this.saldo;
    }

    public void lisaaSailioon(double maara) {
        this.saldo += maara;
        if (this.saldo > this.tilavuus) {
            this.saldo = this.tilavuus;
        }
    }
    
    public double otaSailiosta(double maara) {
        this.saldo -= maara;
        if (this.saldo < 0) {
            this.saldo = 0;
        }
        return maara;
    }

    @Override
    public String toString() {
        return (Math.ceil(this.saldo) + "/" + Math.ceil(this.tilavuus));
    }
}
