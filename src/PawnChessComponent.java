import java.util.ArrayList;
import java.util.List;

public class PawnChessComponent extends ChessComponent {
    
    private final ChessComponent[][] chessBoard;
    private final ChessColor chessColor;
    
    public PawnChessComponent(ChessComponent[][] chessComponents, char name, int x, int y, ChessColor chessColor) {
        super(x, y, chessColor);
        this.name = name;
        this.chessBoard = chessComponents;
        this.chessColor = chessColor;
    }
    
    @Override
    public List<ChessboardPoint> canMoveTo() {
        ChessboardPoint currentPoint = super.getSource();
        List<ChessboardPoint> canMoveTo = new ArrayList<>();
        int x = currentPoint.getX();
        int y = currentPoint.getY();
        if (chessColor == ChessColor.BLACK) {
            if (x + 1 < 8 && chessBoard[x + 1][y].name == '_') {
                canMoveTo.add(new ChessboardPoint(x + 1, y));
            }
            if (x == 1 && chessBoard[x + 1][y].name == '_' && chessBoard[x + 2][y].name == '_') {
                canMoveTo.add(new ChessboardPoint(x + 2, y));
            }
            if (x + 1 < 8 && y + 1 < 8 && chessBoard[x + 1][y + 1].name != '_' && chessBoard[x + 1][y + 1].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(x + 1, y + 1));
            }
            if (x + 1 < 8 && y - 1 >= 0 && chessBoard[x + 1][y - 1].name != '_' && chessBoard[x + 1][y - 1].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(x - 1, y + 1));
            }
        } else if (chessColor == ChessColor.WHITE) {
            if (x - 1 >= 0 && chessBoard[x - 1][y].name == '_') {
                canMoveTo.add(new ChessboardPoint(x - 1, y));
            }
            if (x == 6 && chessBoard[x - 1][y].name == '_' && chessBoard[x - 2][y].name == '_') {
                canMoveTo.add(new ChessboardPoint(x - 2, y));
            }
            if (x - 1 >= 0 && y + 1 < 8 && chessBoard[x - 1][y + 1].name != '_' && chessBoard[x - 1][y + 1].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(x - 1, y + 1));
            }
            if (x - 1 >= 0 && y - 1 >= 0 && chessBoard[x - 1][y - 1].name != '_' && chessBoard[x - 1][y - 1].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(x - 1, y - 1));
            }
        }
        return canMoveTo;
    }
}
