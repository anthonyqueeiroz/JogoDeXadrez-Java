package model.entities.chess;

import model.entities.chess.exceptions.ChessException;
import model.entities.board.Position;

public class ChessPosition {
	public Character column;
	public Integer row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row >8) {
			throw new ChessException("Error instatiating ChessPosition: Valid from a1 to h8.");
		}
		this.column=column;
		this.row=row;
	}

	public Character getColumn() {
		return column;
	}

	public Integer getRow() {
		return row;
	}

	public ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), position.getRow() + 8);
	}
	
	public Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
