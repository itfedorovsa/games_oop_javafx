package ru.job4j.chess.figures.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

public class BishopBlackTest {

    @Test
    public void whenPositionIsValid() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell actual = Cell.F8;
        Cell expected = bishopBlack.position();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenCopyIsValid() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell dest = Cell.D6;
        Figure expected = new BishopBlack(dest);
        Figure actual = bishopBlack.copy(dest);
        Assert.assertEquals(expected.position(), actual.position());
    }

    @Test
    public void whenWayG5ReturnsArrayD2E3F4G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertEquals(expected, bishopBlack.way(Cell.G5));
    }

    @Test
    public void whenWayD6ReturnsArrayE7D6() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell[] expected = {Cell.E7, Cell.D6};
        Assert.assertEquals(expected, bishopBlack.way(Cell.D6));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        bishopBlack.way(Cell.F7);
    }
}
