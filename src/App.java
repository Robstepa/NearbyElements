import java.util.ArrayList;

public class App {

    private int y;
    private int x;
    private int range;
    private int[][] table = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }};

    public static void main(String[] args) {
        try {
            App app = new App(1,3,5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ooops, somethings goes wrong!");
        }
    }

    public App(int y, int x, int range){

        this.y = y;
        this.x = x;
        this.range = range;

        show(nearby(y, x, range));
    }

    private ArrayList<Integer> nearby(int y, int x, int range) {
       ArrayList<Integer> results = new ArrayList<>();

       for (int i = 0; i < table[y].length; i++){
           if (i >= x - range && i <= x+range && table[y][x] != table[y][i]) {
               results.add(table[y][i]);
           }
       }

       return results;
    }

    private void show(ArrayList<Integer> list) {
        for(int i : list) {
            System.out.println(i);
        }
    }
}
