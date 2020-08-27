import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        // 일반적인 람다 표현식
        UnaryOperator<String> hi = (s) -> "hi" + s;
        hi.apply("Sean Sin");

        // 위와 동일 (스태틱 메소드 호출)
        UnaryOperator<String> methodRef = Greeting::hi;
        methodRef.apply("Sean Sin");

        // non static 메소드 참조
        Greeting greeting = new Greeting();
        UnaryOperator<String> methodRef2 = greeting::hello;
        methodRef2.apply("Sean Sin");

        // 인스턴스 생성 (No Arguments constructor)
        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting1 = newGreeting.get();

        // 인스턴스 생성 (Required Arguments constructor)
        Function<String, Greeting> seansinGreeting = Greeting::new;
        Greeting greeting2 = seansinGreeting.apply("Sean Sin");

        System.out.println(greeting1.getName());
        System.out.println(greeting2.getName());


        String[] names = {"Seansin", "SunMyoung", "YeNa"};
        Arrays.sort(names, String::compareToIgnoreCase);

    }
}
