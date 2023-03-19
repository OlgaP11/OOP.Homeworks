package gb.list;

import gb.GBList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class GBArrayList<T> implements GBList<T> {

    private T[] values;

    public GBArrayList(){
        this.values = (T[]) new Object[10];
    }


    @Override
    public boolean add(T t) {
        try {
            for (int i = 0; i < values.length; i++) {
                if (values[i] == null){
                    values[i] = t;
                    break;
                }
            }
            capacity();
            return true;
        }catch (ClassCastException e){ // Указали тип исключения
            e.printStackTrace(); // Выведет в консоль, какая ошибка
        }
        return false;
    }

    @Override
    public void capacity() {
        try {
            if (values[values.length / 2] != null) {
                T[] temp = values;
                values = (T[]) new Object[temp.length+temp.length / 2];
                System.arraycopy(temp, 0, values, 0, temp.length);
            }
        }catch (ClassCastException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remove(int index) {
        try{
            T[] temp = values;
            values = (T[]) new Object[temp.length];
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
        int curLength = 0;
        for (T value : values) {
            if (value != null) {
                curLength++;
            }
        }
        return curLength;
    }

    @Override
    public void update(int index, T t) {
        if (values[index]!=null)
            values[index] = t;
        else
            System.out.println("Index out of bound.");
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        StringBuilder newString = new StringBuilder();
        for (T value: values) {
            if(value != null)
                newString.append(value+" ");
        }
        return newString.toString();
    }
}
