import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();
    }

    private void run() {
        final int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber(){
                int baseNumber = 11;
                System.out.println(baseNumber); // result = 11
            }
        }

        // 람다
        IntConsumer printInt = (baseNumber) -> {
            System.out.println(baseNumber + i);
        };

        printInt.accept(baseNumber);
    }
}