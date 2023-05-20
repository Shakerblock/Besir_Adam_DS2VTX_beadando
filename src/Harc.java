public class Harc {
    private Harcos harcos;
    private Varazslo varazslo;

    public Harc(Harcos harcos, Varazslo varazslo) {
        this.harcos = harcos;
        this.varazslo = varazslo;
    }

    public void harcoljunk() {
        int harcosTamadoEro = harcos.dobD6();
        int varazsloTamadoEro = varazslo.dobD6();
        harcos.szenved(varazsloTamadoEro);
        varazslo.szenved(harcosTamadoEro);

    }
}
