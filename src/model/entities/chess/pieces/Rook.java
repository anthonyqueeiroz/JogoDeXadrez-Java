package model.entities.chess.pieces;

import model.entities.board.Board;
import model.entities.chess.ChessPiece;
import model.entities.chess.Color;

public class Rook extends ChessPiece {

	public Rook() {
		super();
	}

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
}
