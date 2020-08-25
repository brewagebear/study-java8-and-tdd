public class Bar {
    void printStr() { }

    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.run();
    }

    private void run() {
        String name = "Sean";

        Bar bar = new Bar(){
            String name = "Su-Ung";
            @Override
            void printStr() {
                System.out.println(name);
            }
        };
        bar.printStr();
    }
}
