package MyCollection;

/**
 * Created by Rudniev Oleksandr on 09.11.2016.
 */
public class ArrList<T> implements Ilist<T> {

    private Object myArr[];
    private int position;


    public ArrList(){
        this(10);
    }

    public ArrList(int capaity){
        position = 0;
        myArr = new Object[capaity];
    }

    private void extendMyArr(){
        Object[] newMyArr = new Object[(int) (myArr.length * 2)];
        for (int i = 0; i < myArr.length ; i++) {
            newMyArr[i] = myArr[i];
        }
        myArr = newMyArr;
    }


    @Override
    public boolean add(Object o) {
        if (myArr.length == position) {
            extendMyArr();
        }
        myArr[position++] = o;
        return true;
    }

    @Override
    public boolean add(Object value, int o){
        if(o > position){
            throw new IndexOutOfBoundsException("size:" + position + " index:" + o);
        }
        if(position >= myArr.length - 1){
            extendMyArr();
        }
        for (int i = position+1; i > o ; i--) {
            myArr[i] = myArr[i - 1];
        }
        myArr[o] = value;
        position++;

        return true;
    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < myArr.length ; i++) {

        }
        return false;
    }

    @Override
    public Object get(int index) {
        if (index > position) {
            throw new IndexOutOfBoundsException("size:" + position + " index:" + index);
        }
        return myArr[index];
    }

    @Override
    public int size() {
        return position;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] != null) return false;
        }
        return true;
    }

    @Override
    public void clear() {

    }
}
