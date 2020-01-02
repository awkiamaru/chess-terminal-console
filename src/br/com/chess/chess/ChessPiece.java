package br.com.chess.chess;

import br.com.chess.boardgame.Board;
import br.com.chess.boardgame.Piece;
import br.com.chess.boardgame.Position;
import br.com.chess.chess.utils.Color;

public abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void increaseMoveCount(){
        moveCount++;
    }
    public void decreaseMoveCount(){
        moveCount--;
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }
}
