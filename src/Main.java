import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard(int width, int height);
        ArrayList<String> items = new ArrayList<>();
        Collections.addAll(items,"stuff1","stuff2","stuff3");
        Random random = new Random();
        int index = random.nextInt(items.size());

        for(int x = 0; x < width; x++) {
            gameBoard.setRooms(new Room(x, 3 , "stuff"));

        }













       /* for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length;j++) {
                gameBoard[i][j] = random.nextInt(10);
            }
        } */



    }



}
