package Day0713.Test;

import Day0713.work.Students;

import java.util.Comparator;

public class MySort implements Comparator<Students> {
    private String filed;
    private String order;

    public MySort(String field, String order) {
        this.filed = field;
        this.order = order;
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
