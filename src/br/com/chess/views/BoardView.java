package br.com.chess.views;

import br.com.chess.chess.ChessPiece;
import br.com.chess.chess.ChessPosition;
import br.com.chess.chess.utils.Color;
import br.com.chess.views.utils.BoardColors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {

    public static ChessPosition readChessPosition(Scanner scanner){
        try {
            String s = scanner.nextLine();
            char column = s.charAt(0);
            Integer row = Integer.parseInt(s.substring(1));
            return new ChessPosition(column,row);
        }catch (RuntimeException e){
            throw new InputMismatchException("Erro ao ler a posição no tabuleiro. Valores validos entre a1 até h8");
        }
    }

    public static void printBoard(ChessPiece[][] pieces){
        for (int i = 0; i< pieces.length; i++){
            System.out.print((8 - i) + " ");
            for (int j = 0; j< pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");
    }

    private static void printPiece(ChessPiece piece){
        if( piece != null){
            if (piece.getColor() == Color.WHITE){
                System.out.print(BoardColors.ANSI_WHITE + piece + BoardColors.ANSI_RESET);
            }else {
                System.out.print(BoardColors.ANSI_YELLOW + piece + BoardColors.ANSI_RESET);
            }
        }else {
            System.out.print("-");
        }
        System.out.print(" ");
    }
}
