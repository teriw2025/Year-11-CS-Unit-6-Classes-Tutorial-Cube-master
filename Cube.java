import org.junit.Test;
public class Cube {
    //properties
    private int side;

    //constructors
    public Cube(){
        side = 1;
    }

    public Cube(int userNum){
        if (userNum<1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        else{
            side = userNum;
        }
    }

    //methods
    public int getSide() {
        return side;
    }

    public int setSide(int userSide) {
        if (userSide<1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        else{
            side = userSide;
            return side;
        }
    }

    public int getSurfaceArea(){
        return (side*side)*6;
    }

    public int getVolume(){
        return side*side*side;
    }

    public String toString(int userNum){
        return "" + userNum;
    }
}
