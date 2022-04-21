package Day0714.Test.List.Element;

import Day0714.Test.List.Element.ElementList;
import Day0714.Test.List.Element.Human;
import Day0714.Test.List.Element.Man;

import java.util.ArrayList;

public class TestElementList {
    public static void main(String[] args) {
        ElementList<Man> list = new ElementList<>();
        ArrayList<Human> arrayList = new ArrayList<>();
        list.one(arrayList);
    }
}
