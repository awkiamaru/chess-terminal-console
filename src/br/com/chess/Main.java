package br.com.chess;

import br.com.chess.boardgame.Board;
import br.com.chess.boardgame.Position;
import br.com.chess.chess.ChessMatch;
import br.com.chess.chess.ChessPiece;
import br.com.chess.chess.ChessPosition;
import br.com.chess.chess.exceptions.ChessException;
import br.com.chess.views.BoardView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();


        while (true){
            try{
                BoardView.clearScreen();
                BoardView.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Posição de origem: ");
                ChessPosition source = BoardView.readChessPosition(sc);

                System.out.println();
                System.out.print("Posição de destino: ");
                ChessPosition target  = BoardView.readChessPosition(sc);
                ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
            }catch (ChessException | InputMismatchException i){
                System.out.println(i.getMessage());
                sc.nextLine();
            }

        }
    }
}
