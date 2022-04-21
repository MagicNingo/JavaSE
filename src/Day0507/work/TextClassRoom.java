package Day0507.work;

public class TextClassRoom {
    public static void main(String[] args) {
        ClassRoom room = new ClassRoom("数学班",3);
        Student s1 = new Student("jack",18);
        Student s2 = new Student("rose",20);
        Student s3 = new Student("bin",20);
        Student s4 = new Student("bili",19);
            s4.schoolName = "湖南";
        room.getInfo(s1);
        room. showInfo();
        System.out.println("--------------------");
        room.getInfoMore(s2,s3,s4);
        room. showInfo();
    }
}
