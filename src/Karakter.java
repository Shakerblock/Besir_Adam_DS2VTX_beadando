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

    public void szenved(int tamadoEro) throws HarcException {
        eletero -= tamadoEro;
        if (eletero <= 0){
            throw new HarcException("Játék vége!");
        }
    }

    protected int dobD6() {
        return random.nextInt(6) + 1;
    }

}
