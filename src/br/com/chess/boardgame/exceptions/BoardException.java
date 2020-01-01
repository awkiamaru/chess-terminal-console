package br.com.chess.boardgame.exceptions;

public class BoardException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BoardException(String msg){
        super(msg);
    }
}
