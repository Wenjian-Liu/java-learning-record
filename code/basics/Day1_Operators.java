public class Day1_Operators {
  public static void main(String[] args) {
    int age = 25;
    // 1.关系运算符
    boolean isAdult = age >= 18;
    boolean isTeen = age >= 13 && age <= 19;

    // 2.逻辑运算符
    boolean hasStudentCard = false;
    boolean free = hasStudentCard || age < 12;

    // 3.三元运算符
    String result = age >= 18 ? "成年":"未成年";
    System.out.println("是否成年：" + isAdult);
    System.out.println("是否青少年：" + isTeen);
    System.out.println("是否免费：" + free);
    System.out.println("判定：" + result);
  }
}
