package gb;

public interface GBList<T> extends Iterable<T> { // указываем,что по наследникам сущности GBList можно будет пробегать через forech
    boolean add(T t);
    void capacity();
    void remove (int index); // удаление по индексу
    T get (int index); // возвращает переменную типа T
    int size();
    void update (int index, T t); // по указанному индексу будем вставлять новый объект, т.е. элемент
}
