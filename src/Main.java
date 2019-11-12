import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Collections.addAll(items,"stuff1","stuff2","stuff3");
        Random random = new Random();
        int index = random.nextInt(items.size());
        GameBoard gameBoard = new GameBoard(int width, int height);


        //sets the item in a room
        for(int x = 0; x < width; x++) {
            gameBoard.setRoomItem(random.nextInt(4), random.nextInt(4), );
        }













       /* for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length;j++) {
                gameBoard[i][j] = random.nextInt(10);
            }
        } */



    }



}
