package Day0714.Test.SingleAnddouble;

import Day0714.Test.SingleAnddouble.Sex;

public class TextDouble {
    public static void main(String[] args) {
        /*Gender man = Gender.MAN;
        Gender man2 = Gender.MAN;
        Gender man3 = Gender.MAN;

        Gender woman = Gender.WOMAN;
        Gender woman2 = Gender.WOMAN;

        man.feature();
        woman.feature();

        System.out.println(man);
        System.out.println(woman);
        System.out.println(woman==woman2);*/


        Sex male = Sex.MAN;
        System.out.println(male.name());
        System.out.println(male.ordinal());

        Sex female = Sex.WOMAN;
        System.out.println(female.name());
        System.out.println(female.ordinal());

        male.feature();
        female.feature();





    }
}
