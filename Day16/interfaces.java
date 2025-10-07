public class interfaces {
    public static void main(String[] args){
        Queen q=new Queen();
        q.moves();s

    }
}
interface  chessplayer  {
    void moves();
   
}

class Queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,..");
    }
}

class Rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,..");
    }
}
