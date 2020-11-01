package ru.zebra134.RTU.Pr15;

public class ArrayList1<T> {
    private final int max = 16;
    private final int min = 2;
    private Object[] o = new Object[max];
    private int k = 0;

    public int size(){
        return k;
    }

    public T get (int a){
        return (T) o[a];
    }

    private void resize (int L){
        Object[] o1 = new Object[L];
        System.arraycopy(o,0, o1,0, k);
        o = o1;
    }

    public void add(T a){
        if (k == o.length-1){
            resize(o.length*2);
        }
        o[k++] = a;
    }

    public void remove(int a){
        for (int i = a; i<k; i++){
            o[i] = o[i+1];
        }
        o[k] = null;
        k--;
        if (o.length > max && k < o.length/min){
            resize(o.length/2);
        }
    }
}
