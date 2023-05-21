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
                try{
                    harcSzimulator.harcoljunk();
                } catch(HarcException e) {
                    kiirato.kiirTer();
                    System.out.println(e.getMessage());
                    vege = true;
                }

            }
            try {
                Thread.sleep(1000); // 1 másodperc várakozás
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Jatek jatek = new Jatek();
        Thread jatekSzal = new Thread(() -> {
            jatek.jatekFut();
        });
        jatekSzal.start();
    }
}

class HarcException extends Exception {
    public HarcException(String message) {
        super(message);
    }
}