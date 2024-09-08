

public class Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal(in all 4 directions)");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal");
    }
}