package br.com.chess.pieces;

import br.com.chess.boardgame.Board;
import br.com.chess.chess.ChessPiece;
import br.com.chess.chess.utils.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "T";
    }
}
