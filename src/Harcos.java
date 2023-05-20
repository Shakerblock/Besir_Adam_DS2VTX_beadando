import java.util.Random;

class Harcos {
    private int eletero;
    private int pozicio;
    private Random random;

    public Harcos(Random random) {
        this.random = random;
        eletero = dobD6() + 3;
    }

    public int getEletero() {
        return eletero;
    }

    public int getPozicio() {
        return pozicio;
    }

    public void lepes(int ujPozicio) {
        pozicio = ujPozicio;
    }

    public void szenved(int tamadoEro) {
        eletero -= tamadoEro;
    }

    public int dobD6() {
        return random.nextInt(6) + 1;
    }

}
