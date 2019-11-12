import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    Room[][] coordinates;
    List<Room> rooms = new ArrayList<>();

    //creates an gameBoard map instance for user
    public GameBoard(int width, int height) {
        coordinates = new Room[width][height];
        for(int i = 0; i < width; i++) {
           for(int j = 0; j < height;j++) {
               coordinates[i][j] = new Room(i,j);
               rooms.add(coordinates[i][j]);
           }
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Room[][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Room[][] coordinates) {
        this.coordinates = coordinates;
    }

    public void setRoomItem(int x, int y, String item){
        coordinates[x][y].setItem(item);
    }
}
