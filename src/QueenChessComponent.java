import java.util.ArrayList;
import java.util.List;

public class QueenChessComponent extends ChessComponent {
    
    private final ChessComponent[][] chessBoard;
    private final ChessColor chessColor;
    
    public QueenChessComponent(ChessComponent[][] chessComponents, char name, int x, int y, ChessColor chessColor) {
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
        for (int i = x + 1; i < 8; i++) {
            if (chessBoard[i][y].name == '_') {
                canMoveTo.add(new ChessboardPoint(i, y));
            } else if (chessBoard[i][y].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(i, y));
                break;
            } else if (chessBoard[i][y].getChessColor() == chessColor) {
                break;
            }
        }
        for (int i = x - 1; i >= 0; i--) {
            if (chessBoard[i][y].name == '_') {
                canMoveTo.add(new ChessboardPoint(i, y));
            } else if (chessBoard[i][y].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(i, y));
                break;
            } else if (chessBoard[i][y].getChessColor() == chessColor) {
                break;
            }
        }
        for (int i = y + 1; i < 8; i++) {
            if (chessBoard[x][i].name == '_') {
                canMoveTo.add(new ChessboardPoint(x, i));
            } else if (chessBoard[x][i].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(x, i));
                break;
            } else if (chessBoard[x][i].getChessColor() == chessColor) {
                break;
            }
        }
        for (int i = y - 1; i >= 0; i--) {
            if (chessBoard[x][i].name == '_') {
                canMoveTo.add(new ChessboardPoint(x, i));
            } else if (chessBoard[x][i].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(x, i));
                break;
            } else if (chessBoard[x][i].getChessColor() == chessColor) {
                break;
            }
        }
        for (int i = x + 1, j = y + 1; i < 8 && j < 8; i++, j++) {
            if (chessBoard[i][j].name == '_') {
                canMoveTo.add(new ChessboardPoint(i, j));
            } else if (chessBoard[i][j].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(i, j));
                break;
            } else if (chessBoard[i][j].getChessColor() == chessColor) {
                break;
            }
        }
        for (int i = x - 1, j = y + 1; i >= 0 && j < 8; i--, j++) {
            if (chessBoard[i][j].name == '_') {
                canMoveTo.add(new ChessboardPoint(i, j));
            } else if (chessBoard[i][j].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(i, j));
                break;
            } else if (chessBoard[i][j].getChessColor() == chessColor) {
                break;
            }
        }
        for (int i = x + 1, j = y - 1; i < 8 && j >= 0; i++, j--) {
            if (chessBoard[i][j].name == '_') {
                canMoveTo.add(new ChessboardPoint(i, j));
            } else if (chessBoard[i][j].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(i, j));
                break;
            } else if (chessBoard[i][j].getChessColor() == chessColor) {
                break;
            }
        }
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j].name == '_') {
                canMoveTo.add(new ChessboardPoint(i, j));
            } else if (chessBoard[i][j].getChessColor() != chessColor) {
                canMoveTo.add(new ChessboardPoint(i, j));
                break;
            } else if (chessBoard[i][j].getChessColor() == chessColor) {
                break;
            }
        }
        return canMoveTo;
    }
}
