public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}


// multiple inheritence:
interface Herbivore{

}

interface Carnivore{

}

class Beer implements Herbivore, Carnivore{

}



// 100% abstraction:
interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up down left right diagonal (in all 4 directions)");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - (by 1 step)");
    }
}