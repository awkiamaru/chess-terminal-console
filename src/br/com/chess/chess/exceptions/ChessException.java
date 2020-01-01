package br.com.chess.chess.exceptions;

public class ChessException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }

}
