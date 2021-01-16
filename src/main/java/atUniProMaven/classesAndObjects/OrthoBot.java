package atUniProMaven.classesAndObjects;

public class OrthoBot {

    public void getPos(int x, int y){
        System.out.println("(" + x + ", " + y + ")");
    }

    public void up(int x, int y){
        System.out.println("(" + x + ", " + y + ")");
    }

    public void down(int x, int y){
        System.out.println("(" + x + ", " + y + ")");
    }

    public void left(int x, int y){
        System.out.println("(" + x + ", " + y + ")");
    }

    public void right(int x, int y){
        System.out.println("(" + x + ", " + y + ")");
    }
}

class OrthoBotAns{
    public static void main(String[] args) {
        OrthoBot wallE = new OrthoBot();
        wallE.getPos(0,0);                             // (0, 0)
        wallE.up(0,1);                                 // (0, 1)
        wallE.up(0,2);                                 // (0, 2)
        wallE.left(-1, 2);                               // (-1, 2)
        wallE.left(-2, 2);                               // (-2, 2)
        wallE.down(-2, 1);                               // (-2, 1)
        wallE.right(-2, 0);                              // (-2, 0)
        wallE.getPos(-2, 0);                             // (-2, 0)
    }
}
