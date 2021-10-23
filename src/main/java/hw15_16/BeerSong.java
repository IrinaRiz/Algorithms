package hw15_16;

public class BeerSong {
    static int count = 99;

    public static void bottlesOfBeer() {
        System.out.print(" bottles of beer");
    }

    public static void onTheWall() {
        System.out.print("on the wall,");
    }

    public static void onTheWallDot() {
        System.out.println(" on the wall.");
    }

    public static void passItAround() {
        System.out.print("Take one down and pass it around,");
    }

    public static void noMore() {
        System.out.print("no more");
    }

    public static void singleBottle() {
        System.out.print(" bottle of beer");
    }

    public static void dot() {
        System.out.println(".");
    }

    public static void emptyLine() {
        System.out.println();
    }

    public static void goToTheStore() {
        System.out.print("Go to the store and buy some more," + count);
        bottlesOfBeer();
        onTheWallDot();
    }
    public static void space(){
        System.out.print(" ");
    }
    public static void noMoreCapital(){
        System.out.print("No more");
    }

    public static void printSong() {
        for (int i = count; i >= 0; i--) {
            if (i == 0) {
                emptyLine();
                noMoreCapital();
                bottlesOfBeer();
                space();
                onTheWall();
                noMore();
                bottlesOfBeer();
                dot();
                goToTheStore();
            } else if (i == 1) {
                System.out.print(i);
                singleBottle();
                space();
                onTheWall();
                System.out.print(i);
                singleBottle();
                dot();
                passItAround();
                noMore();
                bottlesOfBeer();
                onTheWallDot();

            } else if (i == 2) {
                System.out.print(i);
                bottlesOfBeer();
                onTheWall();
                System.out.print(i);
                bottlesOfBeer();
                dot();
                passItAround();
                System.out.print(i - 1);
                singleBottle();
                onTheWallDot();
                emptyLine();
            } else {
                System.out.print(i);
                bottlesOfBeer();
                space();
                onTheWall();
                space();
                System.out.print(i);
                bottlesOfBeer();
                dot();
                passItAround();
                space();
                System.out.print(i - 1);
                bottlesOfBeer();
                onTheWallDot();
                emptyLine();

            }
        }
    }
}









