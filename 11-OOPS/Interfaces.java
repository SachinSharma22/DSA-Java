public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves() {
        System.out.println("Moves all directions");
    }
}
class King implements chessPlayer{
    public void moves() {
        System.out.println("Move all directions and 1 step diagonal");
    }
}
class Rook implements chessPlayer{
    public void moves() {
        System.out.println("Moves Left, Right, Up and Down");
    }
}
