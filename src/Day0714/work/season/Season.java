package Day0714.work.season;

public enum Season {

    SPRING("春天"){
        @Override
        public void view() {
            System.out.println("春天万物复苏！");
        }
    },
    SUMMER("夏天"){
        @Override
        public void view() {
            System.out.println("夏天酷热来袭！");
        }
    },
    FALL("秋天"){
        @Override
        public void view() {
            System.out.println("秋天树叶凋零！");
        }
    },
    WINTER("冬天"){
        @Override
        public void view() {
            System.out.println("冬天万物冰封！");
        }
    };

    public String value;

    Season() {
    }

    Season(String value) {
        this.value = value;
    }

    public  abstract void view();
}
