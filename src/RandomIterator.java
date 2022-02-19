import java.util.Iterator;

public class RandomIterator extends Randoms implements Iterator<Integer> {

    protected RandomIterator(int min, int max) {
        super(min, max);
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
