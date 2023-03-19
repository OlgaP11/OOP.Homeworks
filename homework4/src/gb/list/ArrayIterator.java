package gb.list;

import java.util.Iterator;

public class ArrayIterator <T> implements Iterator <T> {
    private int index;
    private final T[] values;

    public ArrayIterator(T[] values) {
        this.index = 0;
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return values[index] != null;
    }

    @Override
    public T next() {
        return values[index++];
    }
}
