package cleancode.minesweeper.tobe.gamelevel;

public class Advanced implements GameLevel {

    @Override
    public int getRowSize() {
        return 20;
    }

    @Override
    public int gettColSize() {
        return 24;
    }

    @Override
    public int getLandMineCount() {
        return 99;
    }
}
