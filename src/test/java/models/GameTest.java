package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Game GameTest;

    @Before
    public void initialize() {
        GameTest = new Game();
    }

    @Test
    public void getDeckTest() {
        assertNotNull(GameTest.getDeck());
    }

    @Test
    public void getWasteTest() {
        assertNotNull(GameTest.getWaste());
    }

    @Test
    public void getTableauTest() {
        assertNotNull(GameTest.getTableau());
    }

    @Test
    public void getFoundationTest() {
        assertNotNull(GameTest.getFoundation());
    }

    @Test
    public void getNumOptionsTest() {
        assert (GameTest.getNumOptions() > 0);
    }

    @Test
    public void getNumTableausTest() {
        assert (GameTest.getNumTableaus() > 0);
    }

}
