package boardgame;

public class Board {

  private int rows;
  private int columns;
  private Piece[][] pieces;

  public Board(int rows, int columns) {
    if (rows < 1 || columns < 1) {
      throw new BoardException("Error creating board: board must be at least 1 unit tall and 1 unit wide.");
    }
    this.rows = rows;
    this.columns = columns;

    pieces = new Piece[rows][columns];
  }

  public int getRows() {
    return rows;
  }

  public void setRows(int rows) {
    this.rows = rows;
  }

  public int getColumns() {
    return columns;
  }

  public void setColumns(int columns) {
    this.columns = columns;
  }

  public Piece piece(int row, int column) {
    return pieces[row][column];
  }

  public Piece piece(Position position) {
      if (!positionExists(position)) {
      throw new BoardException("Not a valid position.");
    }

    return pieces[position.getRow()][position.getColumn()];
  }

  public void placePiece(Piece piece, Position position) {
    if (isOccupied(position)) {
      throw new BoardException("Position " + position + " already occupied.");
    }

    pieces[position.getRow()][position.getColumn()] = piece;
    piece.position = position;
  }

  public Piece removePiece(Position position) {
    if(!isOccupied(position)) {
      return null;
    }

    if (!positionExists(position)) {
      throw new BoardException("Not a valid position.");
    }

    Piece aux = piece(position);
    aux.position = null;
    pieces[position.getRow()][position.getColumn()] = null;
    return aux;
    
  }

  private boolean positionExists(int row, int column) {
    return row >= 0 && row < rows && column >= 0 && column < columns;
  }

  public boolean positionExists(Position position) {
    return positionExists(position.getRow(), position.getColumn());
  }

  public boolean isOccupied(Position position) {
    if (!positionExists(position)) {
      throw new BoardException("Not a valid position.");
    }
  
    return piece(position) != null;
  }
}
