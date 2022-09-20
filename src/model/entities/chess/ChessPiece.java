package model.entities.chess;

import model.entities.board.Board;
import model.entities.board.Piece;

public class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(){
	}
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
