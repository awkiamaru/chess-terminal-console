package br.com.chess;

import br.com.chess.chess.ChessMatch;
import br.com.chess.chess.ChessPiece;
import br.com.chess.chess.ChessPosition;
import br.com.chess.chess.exceptions.ChessException;
import br.com.chess.views.BoardView;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captureChessPieces = new ArrayList<>();


        while (!chessMatch.isCheckMate()){
            try{
                BoardView.clearScreen();
                BoardView.printMatch(chessMatch, captureChessPieces);
                System.out.println();
                System.out.print("Posição de origem: ");
                ChessPosition source = BoardView.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                BoardView.clearScreen();
                BoardView.printBoard(chessMatch.getPieces(),possibleMoves);
                System.out.println();
                System.out.print("Posição de destino: ");
                ChessPosition target  = BoardView.readChessPosition(sc);
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                if(capturedPiece != null){
                    captureChessPieces.add(capturedPiece);
                }
                if(chessMatch.getPromoted() != null){
                    System.out.println("Digite a letra da peça a ser escolhida: (A/C/T/B)");
                    String type = sc.nextLine();
                    chessMatch.replacepromotedPiece(type);
                }
            }
            catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        BoardView.clearScreen();
        BoardView.printMatch(chessMatch, captureChessPieces);

    }
}
