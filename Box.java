public class Box {
    int size = 0;

    public static void main(String[] args) {
        Box Box1 = new Box();
        Box1.size = 5;
        Box1.printBox();
        Box1.printBox('c');
    }
    public void printBox() {
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printBox(char c) {
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                System.out.print(c);
            }
            System.out.println();
        }
    }
}

