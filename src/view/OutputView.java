package view;

public class OutputView {

    public static void printUserNameAge(String name, int age) {

        System.out.println(name + "(" + age + ")");
    }

    public static void printBirthday(int age) {

        System.out.printf("%d번째 생일을 축하합니다 !! \n ", age);
    }

    public static void printIsAdult(boolean isUnderAge) {

        if (isUnderAge) {
            System.out.println("미성년자입니다. ");
        } else {
            System.out.println("성인입니다. ");
        }
    }
}