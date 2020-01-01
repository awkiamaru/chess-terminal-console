package br.com.chess.views;

import br.com.chess.chess.ChessPiece;
import br.com.chess.chess.utils.Color;
import br.com.chess.views.utils.BoardColors;

public class BoardView {

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
