public class TerKiirato {
    private Harcos harcos;
    private Varazslo varazslo;

    public TerKiirato(Harcos harcos, Varazslo varazslo) {
        this.harcos = harcos;
        this.varazslo = varazslo;
    }

    public void kiirTer() {
        for (int i = 0; i < 3; i++) {
            if (harcos.getPozicio() == i && varazslo.getPozicio() == i) {
                System.out.print("X");
            } else if (harcos.getPozicio() == i) {
                System.out.print("H");
            } else if (varazslo.getPozicio() == i) {
                System.out.print("V");
            } else {
                System.out.print("_");
            }
        }
        if (harcos.getPozicio() == varazslo.getPozicio()){
            System.out.print("--> harc: H:" + harcos.getEletero() + ", V:" + varazslo.getEletero());
            System.out.println();
        } else {
            System.out.print("--> H:" + harcos.getEletero() + ", V:" + varazslo.getEletero());
            System.out.println();
        }
    }
}




