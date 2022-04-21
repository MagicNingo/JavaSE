package Day0806.Test;

import java.io.Serializable;

public class Students implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String Id;
    private transient int Score;

    public Students() {
    }

    public Students(String name, String id, int score) {
        this.name = name;
        Id = id;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public int getScore() {
        return Score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                ", Score=" + Score +
                '}';
    }



}
