package Day0507.Test;

public class AirPlan implements Comparable<AirPlan> {
    //飞机的属性：特点
    private String  id;
    private String  type;

    public AirPlan() {}

    public AirPlan(String id) {
        this.id = id;
    }
    public AirPlan(String id, String type) {
        this.id = id;
        this.type = type;
    }

    //飞机的行为，即方法
    public void fly(){
        System.out.println("飞机可以飞！");
    }
    public void takePeople(){
        System.out.println("飞机可以载人！");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AirPlan{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(AirPlan o) {
        if (this.id.equals(o.id)) {
            return this.type.compareTo(o.type);
        } else {
           return o.id.compareTo(this.id);
        }
    }

}
