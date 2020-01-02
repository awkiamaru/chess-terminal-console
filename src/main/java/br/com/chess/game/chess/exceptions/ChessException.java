package br.com.chess.game.chess.exceptions;

import br.com.chess.game.boardgame.exceptions.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }

}