import java.util.ArrayList;

public class Tile {
    private int xPos, yPos;
    ArrayList<Room> rooms = new ArrayList<>();

    public Tile(){};

    public Tile(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = xPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
