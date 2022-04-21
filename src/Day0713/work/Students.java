package Day0713.work;

public class Students implements Comparable<Students>{
    private String name;
    private String Id;
    private int Score;

    public Students() {
    }

    public Students(String name, String id, int score) {
        this.name = name;
        Id = id;
        Score = score;
    }

    public Students(String name, String id) {
        this.name = name;
        Id = id;
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


    @Override
    public int compareTo(Students stu) {
       return this.name.compareTo(stu.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        if (Score != students.Score) return false;
        if (!name.equals(students.name)) return false;
        return Id.equals(students.Id);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Id.hashCode();
        result = 31 * result + Score;
        return result;
    }
}
