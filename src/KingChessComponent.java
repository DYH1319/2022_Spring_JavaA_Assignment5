import java.util.ArrayList;
import java.util.List;

public class KingChessComponent extends ChessComponent {
    
    private final ChessComponent[][] chessBoard;
    private final ChessColor chessColor;
    
    public KingChessComponent(ChessComponent[][] chessComponents, char name, int x, int y, ChessColor chessColor) {
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
        if (x + 1 < 8 && chessBoard[x + 1][y].getChessColor() != chessColor && chessBoard[x + 1][y].name != 'K' && chessBoard[x + 1][y].name != 'k') {
            canMoveTo.add(new ChessboardPoint(x + 1, y));
        }
        if (x - 1 >= 0 && chessBoard[x - 1][y].getChessColor() != chessColor && chessBoard[x - 1][y].name != 'K' && chessBoard[x - 1][y].name != 'k') {
            canMoveTo.add(new ChessboardPoint(x - 1, y));
        }
        if (y + 1 < 8 && chessBoard[x][y + 1].getChessColor() != chessColor && chessBoard[x][y + 1].name != 'K' && chessBoard[x][y + 1].name != 'k') {
            canMoveTo.add(new ChessboardPoint(x, y + 1));
        }
        if (y - 1 >= 0 && chessBoard[x][y - 1].getChessColor() != chessColor && chessBoard[x][y - 1].name != 'K' && chessBoard[x][y - 1].name != 'k') {
            canMoveTo.add(new ChessboardPoint(x, y - 1));
        }
        if (x + 1 < 8 && y + 1 < 8 && chessBoard[x + 1][y + 1].getChessColor() != chessColor && chessBoard[x + 1][y + 1].name != 'K' && chessBoard[x + 1][y + 1].name != 'k') {
            canMoveTo.add(new ChessboardPoint(x + 1, y + 1));
        }
        if (x + 1 < 8 && y - 1 >= 0 && chessBoard[x + 1][y - 1].getChessColor() != chessColor && chessBoard[x + 1][y - 1].name != 'K' && chessBoard[x + 1][y - 1].name != 'k') {
            canMoveTo.add(new ChessboardPoint(x + 1, y - 1));
        }
        if (x - 1 >= 0 && y + 1 < 8 && chessBoard[x - 1][y + 1].getChessColor() != chessColor && chessBoard[x - 1][y + 1].name != 'K' && chessBoard[x - 1][y + 1].name != 'k') {
            canMoveTo.add(new ChessboardPoint(x - 1, y + 1));
        }
        if (x - 1 >= 0 && y - 1 >= 0 && chessBoard[x - 1][y - 1].getChessColor() != chessColor && chessBoard[x - 1][y - 1].name != 'K' && chessBoard[x - 1][y - 1].name != 'k') {
            canMoveTo.add(new ChessboardPoint(x - 1, y - 1));
        }
        return canMoveTo;
    }
}
