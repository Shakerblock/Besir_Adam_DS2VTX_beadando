import java.util.Random;
public class Karakter {
    protected int eletero;
    protected int pozicio;
    protected Random random;

    public Karakter(Random random) {
        this.random = random;
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

    protected int dobD6() {
        return random.nextInt(6) + 1;
    }

}
