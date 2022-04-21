package Day0713.work2;

public class Teacher implements  Introduction {
        private String name;

        public Teacher(String name) {
            this.name = name;
        }

    public String detail(){
            return name+"老师的信息！";
        }
}
