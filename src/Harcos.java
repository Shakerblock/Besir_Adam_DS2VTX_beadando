import java.util.Random;

class Harcos extends Karakter {

    public Harcos(Random random) {
        super(random);
        eletero = dobD6() + 3;
    }

}


