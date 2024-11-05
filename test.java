import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("이름을 입력해주세요: ");
        String name = stdin.next();
        System.out.print("나이를 입력해주세요: ");
        int age = stdin.nextInt();

        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다!");
    }
}
