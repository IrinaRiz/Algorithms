package hw15_16;

public class BeerSong {
    public static void countBottles() {

        int count = 99;
        for (int i = count; i >= 0; i--) {
            System.out.print(i + " bottles of beer on the wall,");
            System.out.println(i + " bottles of beer.");
            System.out.print("Take one down and pass it around,");
            System.out.println(i - 1 + " bottles of beer on the wall.");
            System.out.println();

            if (i == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more," + count + "bottles of beer on the wall.");
            }
        }
    }


    public static void main(String[] args) {
        countBottles();
    }
}




