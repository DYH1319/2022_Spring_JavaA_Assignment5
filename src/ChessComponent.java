import java.util.List;

public abstract class ChessComponent {
    //should design
    private ChessboardPoint source;
    private ChessColor chessColor;
    protected char name;
    
    //should design
    public ChessComponent() {
    }
    
    public ChessComponent(int x, int y, ChessColor chessColor) {
        this.chessColor = chessColor;
        this.source = new ChessboardPoint(x, y);
    }
    
    public ChessColor getChessColor() {
        return chessColor;
    }
    
    public ChessboardPoint getSource() {
        return source;
    }
    
    // should design
    public abstract List<ChessboardPoint> canMoveTo();
    
    /**
     * should design
     *
     * @return the name of current chess piece.
     */
    @Override
    public String toString() {
        return String.valueOf(this.name);
    }
    
}
