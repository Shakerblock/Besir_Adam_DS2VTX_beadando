import java.util.Random;
public class Varazslo extends Karakter {

    public Varazslo(Random random) {
        super(random);
        eletero = dobD6() + 3;
        pozicio = 2;
    }

  @Override
    public void szenved(int tamadoEro){
        super.szenved(tamadoEro);
  }

}
