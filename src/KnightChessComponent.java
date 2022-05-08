import java.util.ArrayList;
import java.util.List;

public class KnightChessComponent extends ChessComponent {
    
    private final ChessComponent[][] chessBoard;
    private final ChessColor chessColor;
    
    public KnightChessComponent(ChessComponent[][] chessComponents, char name, int x, int y, ChessColor chessColor) {
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
        if (x + 2 < 8 && y + 1 < 8 && chessBoard[x + 2][y + 1].getChessColor() != chessColor) {
            canMoveTo.add(new ChessboardPoint(x + 2, y + 1));
        }
        if (x + 2 < 8 && y - 1 >= 0 && chessBoard[x + 2][y - 1].getChessColor() != chessColor) {
            canMoveTo.add(new ChessboardPoint(x + 2, y - 1));
        }
        if (x - 2 >= 0 && y + 1 < 8 && chessBoard[x - 2][y + 1].getChessColor() != chessColor) {
            canMoveTo.add(new ChessboardPoint(x - 2, y + 1));
        }
        if (x - 2 >= 0 && y - 1 >= 0 && chessBoard[x - 2][y - 1].getChessColor() != chessColor) {
            canMoveTo.add(new ChessboardPoint(x - 2, y - 1));
        }
        if (x + 1 < 8 && y + 2 < 8 && chessBoard[x + 1][y + 2].getChessColor() != chessColor) {
            canMoveTo.add(new ChessboardPoint(x + 1, y + 2));
        }
        if (x + 1 < 8 && y - 2 >= 0 && chessBoard[x + 1][y - 2].getChessColor() != chessColor) {
            canMoveTo.add(new ChessboardPoint(x + 1, y - 2));
        }
        if (x - 1 >= 0 && y + 2 < 8 && chessBoard[x - 1][y + 2].getChessColor() != chessColor) {
            canMoveTo.add(new ChessboardPoint(x - 1, y + 2));
        }
        if (x - 1 >= 0 && y - 2 >= 0 && chessBoard[x - 1][y - 2].getChessColor() != chessColor) {
            canMoveTo.add(new ChessboardPoint(x - 1, y - 2));
        }
        return canMoveTo;
    }
}
