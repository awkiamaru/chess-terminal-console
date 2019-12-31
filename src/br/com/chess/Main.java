package br.com.chess;

import br.com.chess.boardgame.Board;
import br.com.chess.boardgame.Position;
import br.com.chess.chess.ChessMatch;
import br.com.chess.views.BoardView;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ChessMatch chessMatch = new ChessMatch();
        BoardView.printBoard(chessMatch.getPieces());
    }
}
