package Day0719.Test;

public class SchoolClass {
    private Integer class_id;
    private String  class_name;

    public SchoolClass() {
    }


    public SchoolClass(Integer class_id, String class_name) {
        this.class_id = class_id;
        this.class_name = class_name;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                '}';
    }
}
