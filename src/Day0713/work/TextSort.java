package Day0713.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TextSort implements Comparator<Students> {
    private String filed;
    private String order;

    public TextSort(String filed, String order) {
        this.filed = filed;
        this.order = order;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Students("张三","1801",210));
        list.add(new Students("李四","1802",310));
        list.add(new Students("王五","1803",220));

        TextSort textSort = new TextSort("name", "升序");
        Collections.sort(list, textSort);
        for (Object o: list) {
            System.out.println(o);
        }

        System.out.println("--------------------------");
        textSort = new TextSort("Id", "降序");
        Collections.sort(list, textSort);
        for (Object o: list) {
            System.out.println(o);
        }

        System.out.println("--------------------------");
        textSort = new TextSort("Score", "降序");
        Collections.sort(list, textSort);
        for (Object o: list) {
            System.out.println(o);
        }

    }

    @Override
    public int compare(Students o1, Students o2) {
        if("升序".equals(order)){
            if ("name".equals(filed)){
                return o1.getName().compareTo(o2.getName());
            }else if("Id".equals(filed)){
                return o1.getId().compareTo(o2.getId());
            }else if("Score".equals(filed)){
                return o1.getScore()-o2.getScore();
            }
        }else if("降序".equals(order)){
            if ("name".equals(filed)){
                return o2.getName().compareTo(o1.getName());
            }else if("Id".equals(filed)){
                return o2.getId().compareTo(o1.getId());
            }else if("Score".equals(filed)){
                return o2.getScore()-o1.getScore();
            }
        }else {
            System.out.println("无此排序方法！");
        }
        return 0;
    }
}
