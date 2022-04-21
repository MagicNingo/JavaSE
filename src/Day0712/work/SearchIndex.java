package Day0712.work;

import java.io.IOException;

public class SearchIndex {

    public String input(){
        byte[] buf = new byte[50];
        try {
            System.in.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buf).trim();
    }

    public int Search(int values,int[] arr) throws NumberNotFoundException {

        if(values<0){
            throw new NumberNotFoundException("输入的数值应该大于0！");
        }
        for (int i = 0; i < arr.length; i++) {
            if (values == arr[i]) {
                return i;
            }
        }
        throw new NumberNotFoundException("数值不存在！");

    }
    public void DuplicateValue(int v,int[] arr) throws DuplicateValueException {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==v){
               throw new DuplicateValueException("对不起，不允许存在重复的数值！");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        SearchIndex s = new SearchIndex();
        boolean f = true;

        int v = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入" + i + "号位置的值:");
            try {
                v = Integer.parseInt(s.input());
                s.DuplicateValue(v,arr);
                arr[i] = v;
            }catch (NumberFormatException e){
                System.out.println("只能输入数字！");
                i--;
            } catch (DuplicateValueException e) {
                i--;
                System.out.println(e.getMessage());
            }


        }
            int index = -1;
            int value = 0;
                while(f){
                    System.out.println("请输入你选择查找的选项: 1.通过索引查找该索引的数值 2.通过索引数值查找该索引 3.退出程序");
                    try {
                        int choose = Integer.parseInt(s.input());
                        switch (choose) {
                            case 1:
                                System.out.println("请输入索引查找索引值:");
                                index = Integer.parseInt(s.input());
                                System.out.println("索引" + index + "的值为:" + arr[index]);
                                break;
                            case 2:
                                System.out.println("请输入一个大于等于0的索引值查找索引:");
                                value = Integer.parseInt(s.input());
                                index = s.Search(value,arr);
                                System.out.println("索引值"+value+"的索引为"+index);
                                break;
                            case 3:
                                f = false;
                                break;
                            default:
                                System.out.println("输入有误，请重新输入！");
                        }
                    }catch (NumberFormatException e ){
                        System.out.println("只能输入整数！");
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("索引的范围在0-"+(arr.length-1));
                    } catch (NumberNotFoundException e) {
                        System.out.println(e.getMessage());
                    }

                }

    }
}
