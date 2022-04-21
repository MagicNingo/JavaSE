package Day0713.work;

import java.util.Arrays;

public class MyList {
    private int size=0;
    private Object[] myList;

    public MyList() {}

    public MyList(int size) {
        myList = new Object[size];
    }

    public int size(){
        return size;
    }

    public void add(Object o) {
        myList[size++] = o;
    }

    public Object get(int index){
        return myList[index];
    }

    public void set(int index , Object o){
            myList[index] = o;
    }

    public void remove(int index){
        /*for (int i = index; i < this.size ; i++) {
            myList[index] = myList[index+1];
        }
            myList[--size] = null;*/
        int numMoved = size - index - 1;

        if (numMoved > 0) {
            System.arraycopy(myList, index+1, myList, index,
                    numMoved);
        }
        myList[--size] = null;
    }
    public void remove(Object o) {
        if (o == null) {
            for (int index = 0; index < size; index++) {
                if (myList[index] == null) {
                    remove(index);

                }
            }
        } else {
            for (int index = 0; index < size; index++) {
                if (o.equals(myList[index])) {
                    remove(index);
                }
            }
        }
    }




    @Override
    public String toString() {
        return "myList=" + Arrays.toString(myList);
    }
}
