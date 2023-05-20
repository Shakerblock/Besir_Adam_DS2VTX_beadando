import java.util.Random;
public class Jatek {
    private Random random;
    private Harcos harcos;
    private Varazslo varazslo;
    private TerKiirato kiirato;
    private Harc harcSzimulator;

    public Jatek() {
        random = new Random();
        harcos = new Harcos(random);
        varazslo = new Varazslo(random);
        kiirato = new TerKiirato(harcos, varazslo);
        harcSzimulator = new Harc(harcos, varazslo);
    }

    public void jatekFut() {
        boolean vege = false;
        while (!vege) {
            kiirato.kiirTer();
            harcos.lepes(random.nextInt(3));
            varazslo.lepes(random.nextInt(3));
            if (harcos.getPozicio() == varazslo.getPozicio()) {
                harcSzimulator.harcoljunk();
                if (harcos.getEletero() <= 0 || varazslo.getEletero() <= 0) {
                    kiirato.kiirTer();
                    vege = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Jatek jatek = new Jatek();
        jatek.jatekFut();
    }
}