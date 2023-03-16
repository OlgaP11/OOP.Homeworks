package gb.list;

import gb.GBList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class GBArrayList<T> implements GBList<T> {

    private T[] values;

    public GBArrayList(){
        this.values = (T[]) new Object[0];
    }
    @Override
    public boolean add(T t) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = t;
            return true;
        }catch (ClassCastException e){ // Указали тип исключения
            e.printStackTrace(); // Выведет в консоль, какая ошибка
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try{
            T[] temp = values;
            values = (T[]) new Object[temp.length-1];
            System.arraycopy(temp, 0, values,0,index);
            int amountAfterIndex = temp.length - index - 1; // Находим, сколько элементов остается после удаленного индекса
            System.arraycopy(temp,index+1, values, index, amountAfterIndex);
        } catch (ClassCastException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {
        values[index] = t;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
