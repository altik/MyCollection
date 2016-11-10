package MyCollection;

/**
 * Created by Rudniev Oleksandr on 10.11.2016.
 */
interface Ilist<T> {

    boolean add(T t);

    boolean add(Object value, int o);

    boolean remove(int index);

    boolean contains(T t);

    Object get(int position);

    int size();

    boolean isEmpty();

    void clear();

    boolean set(Object value, int o);
}