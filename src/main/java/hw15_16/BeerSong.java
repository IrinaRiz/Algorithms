package hw15_16;

public class BeerSong {
    public static void countBottles() {

        int count = 99;
        String bottlesOfBeer = " bottles of beer";
        String onTheWall = " on the wall, ";
        String onTheWallDot = " on the wall.";
        String passItAround = "Take one down and pass it around, ";
        String noMore = "no more";
        String singleBottle = " bottle of beer.";
        for (int i = count; i >= 0; i--) {
            if (i == 0) {
                System.out.println("No more "  + bottlesOfBeer + onTheWall +  noMore + " " + bottlesOfBeer + ".");
                System.out.println("Go to the store and buy some more," + " " + count + " " + bottlesOfBeer + ".");
                continue;
            }
            if ( i == 1){
                System.out.println(i + singleBottle + onTheWall  + i  + singleBottle);
                System.out.println(passItAround + noMore + bottlesOfBeer + onTheWallDot);
                System.out.println();
                continue;
            }
            if( i == 2){
                System.out.println(i +  bottlesOfBeer + onTheWall + i  + bottlesOfBeer + ".");
                System.out.print(passItAround);
                System.out.println(i - 1 + singleBottle + onTheWallDot);
                System.out.println();
                continue;
            }
                System.out.println(i +  bottlesOfBeer + onTheWall + i  + bottlesOfBeer + ".");
                System.out.print(passItAround);
                System.out.println(i - 1 + bottlesOfBeer + onTheWallDot);
                System.out.println();
            }
        }

    public static void main(String[] args) {
        countBottles();
    }
}




