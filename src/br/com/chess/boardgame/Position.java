package br.com.chess.boardgame;

public class Position {

    private Integer row;
    private Integer column;

    public Position(){
    }

    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    @Override
    public String toString(){
        return row + ", " + column;
    }

}

