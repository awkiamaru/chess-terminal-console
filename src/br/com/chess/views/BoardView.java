package br.com.chess.views;

import br.com.chess.chess.ChessPiece;

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
            System.out.print(piece);
        }else {
            System.out.print("-");
        }
        System.out.print(" ");
    }
}
