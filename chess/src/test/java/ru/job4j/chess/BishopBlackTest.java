package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import java.util.Arrays;

public class BishopBlackTest {
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

    @Test
    public void isDiagonalTestWhenE6toG4isTrue() {
        BishopBlack bb = new BishopBlack(Cell.E6);
        Assert.assertTrue(bb.isDiagonal(Cell.E6, Cell.G4));
    }

    @Test
    public void isDiagonalTestWhenE6toG5isFalse() {
        BishopBlack bb = new BishopBlack(Cell.E6);
        Assert.assertFalse(bb.isDiagonal(Cell.E6, Cell.G5));
    }

}
