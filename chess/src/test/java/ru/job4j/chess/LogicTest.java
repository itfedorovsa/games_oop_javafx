package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

public class LogicTest {

    @Test (expected = FigureNotFoundException.class)
    public void whenFigureNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        logic.move(Cell.D6, Cell.B4);
    }

    @Test (expected = OccupiedCellException.class)
    public void whenCellOccupied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        logic.add(new PawnBlack(Cell.E7));
        logic.move(Cell.F8, Cell.C5);

    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenMoveImpossible()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        logic.move(Cell.F8, Cell.C6);
    }
}