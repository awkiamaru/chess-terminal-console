package br.com.chess.chess;

import br.com.chess.boardgame.Board;
import br.com.chess.boardgame.Piece;
import br.com.chess.chess.utils.Color;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
