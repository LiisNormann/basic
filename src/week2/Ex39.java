package week2;

public class Ex39 {
//    public static void printStars(int amount) {
//        int times = 1;
//        while (times <= amount) {
//            System.out.println("*");
//            times++;
//        }
//        System.out.println();
//    }

//    private static void printSquare(int sideSize) {
//        int row = 1;
//        while (row <= sideSize) {
//            int field = 1;
//            while(field <= sideSize) {
//                System.out.print("* ");
//                field++;
//            }
//            System.out.println();
//            row++;
//        }
//    }

    private static void printRectangle(int width, int height) {
        int row = 1;
        while (row <= height) {
            int field = 1;
            while(field <= width) {
                System.out.print("* ");
                field++;
            }
            System.out.println();
            row++;
        }
    }



//    public static void main(String[] args) {
//        printStars(5);
//        printStars(3);
//        printStars(9);
//    }

//    public static void main(String[] args) {
//        printSquare(4);
//    }

    public static void main(String[] args) {
        printRectangle(4, 2);
    }
}
