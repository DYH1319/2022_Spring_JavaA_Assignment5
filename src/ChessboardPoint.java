public class ChessboardPoint {
    private int x;
    private int y;

    /**
     * should design
     * @param x horizontal location of this chess
     * @param y vertical location of this chess
     */
    public ChessboardPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * should design
     * @return horizontal location of this chess
     */
    public int getX() {
        return x;
    }

    /**
     * should design
     * @return vertical location of this chess
     */
    public int getY() {
        return y;
    }

    /**
     * should design
     * @return the location of this chess
     */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }


    /**
     * should design
     * @param dx change in horizontal location of this chess
     * @param dy change in vertical location of this chess
     * @return the new location of this chess
     */
    public ChessboardPoint offset(int dx, int dy) {
        if (x + dx < 0 || x + dx > 7 || y + dy < 0 || y + dy > 7) {
            return null;
        }
        return new ChessboardPoint(x + dx, y + dy);
    }
}
