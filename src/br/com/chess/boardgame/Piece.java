package br.com.chess.boardgame;

public abstract class Piece {

    private Board board;
    protected Position position;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    public boolean isThereAnyPossibleMove(){
        boolean [][] matrix = possibleMoves();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                if(matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
