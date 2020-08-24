public class Foo {
    public static void main(String[] args) {

        //순수 함수
        RunSomething runSomething1 = (number) -> number + 10;

        System.out.println(runSomething1.doIt(1));
        System.out.println(runSomething1.doIt(1));
        System.out.println(runSomething1.doIt(1));
        System.out.println(runSomething1.doIt(1));
        System.out.println(runSomething1.doIt(1));

        //비 순수 함수 = 함수가 외부 변수에 의해서 결과값이 바뀜
        RunSomething runSomething = new RunSomething() {
            int baseNumber = 10;
            @Override
            public int doIt(int number) {
                return number + baseNumber;
            }
        };

        //비 순수 함수 = 함수가 외부 변수를 바꾸자고 함
        RunSomething runSomething = new RunSomething() {
            int baseNumber = 10;
            @Override
            public int doIt(int number) {
                baseNumber++;
                return number + baseNumber;
            }
        };

    }
}
