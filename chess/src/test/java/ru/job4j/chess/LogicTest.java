package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import java.util.Arrays;

public class LogicTest {

    @Test
    public void move()
        throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }


    @Test(expected = OccupiedCellException.class)
    public void moveOccupiedCellException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new PawnBlack(Cell.H6));
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = FigureNotFoundException.class)
    public void moveFigureNotFoundException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void impossibleMoveException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H7);
    }

    @Test
    public void blackBishopPositionTest() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        Assert.assertEquals(bb.position(), Cell.C8);
    }

    @Test
    public void blackBishopCopyTest() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        Figure copyOfBishop = bb.copy(Cell.A6);
        Assert.assertEquals(copyOfBishop.position(), Cell.A6);
    }
    @Test
    public void blackBishopWayTest() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] arr = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertTrue(Arrays.equals(arr, bb.way(Cell.G5)));
    }
}

