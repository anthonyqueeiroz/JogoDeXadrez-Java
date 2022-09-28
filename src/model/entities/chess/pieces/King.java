package model.entities.chess.pieces;

import model.entities.board.Board;
import model.entities.chess.ChessPiece;
import model.entities.chess.Color;

public class King extends ChessPiece {

	public King() {
		super();
	}

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return matriz;
	}
}
