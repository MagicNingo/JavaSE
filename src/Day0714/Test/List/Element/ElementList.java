package Day0714.Test.List.Element;

import java.util.List;

public class ElementList<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void showAll(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
                    // List<? super T> 里？的含义是 某一个类是T的父类类型
    public void one(List<? super T> list) {
        System.out.println(list);
    }
}
