package br.com.chess.game;

import br.com.chess.game.chess.ChessMatch;
import br.com.chess.game.chess.ChessPiece;
import br.com.chess.game.chess.ChessPosition;
import br.com.chess.game.chess.exceptions.ChessException;
import br.com.chess.game.views.BoardView;
import br.com.chess.game.views.utils.BoardColors;

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
        System.out.print(BoardColors.ANSI_YELLOW_BACKGROUND);
        System.out.print(BoardColors.ANSI_BLACK);
        System.out.println("BEM VINDO AO JOGO DE XADREZ PARA CONSOLE\n\n" +
                "O game foi desenvolvido por Luis Fernando Poma Mamani\n"+
                "Durante o curso de Java com POO criado pelo professor\n"+
                "Nélio Alves");
        System.out.print("Para iniciar o jogo Digite y ou yes :");
        String init = sc.nextLine();
        if(init.equals("Y")||init.equals("y")||init.equals("yes") || init.equals("YES")){
            while (!chessMatch.isCheckMate()){
                try{
                    System.out.print(BoardColors.ANSI_RESET);
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

        }else {
            System.out.close();
        }

    }
}
