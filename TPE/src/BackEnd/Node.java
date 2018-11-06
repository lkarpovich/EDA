package BackEnd;

import java.util.HashSet;
import java.util.Set;

public class Node {
    private Board board;
    private Set<Node> descendants;
    private Disc lastMove;
    private Player player;
    private Player enemy;

    public Node(Board board, Disc lastMove, Player player, Player enemy){
        this.board = board;
        this.lastMove = lastMove;
        this.descendants = new HashSet<>();
    }


    public void getDescendants(){
        //IS BOARD COMPLETE?
        for(int i = 0; i < board.size; i++) {
            for (int j = 0; i < board.size; j++) {
                if (board.matrix[i][j] == null) {
                    //PASO DISCO O POSICION?
                    Disc newDisc = player.getDisc(i, j);
                    if (board.validPosition(newDisc)) {
                        descendants.add(new Node(board.putDisc(newDisc), newDisc, enemy, player));
                    }
                }
            }
        }
    }


}
