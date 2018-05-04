package com.drpicox.bowlingKata;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class BowlingGameTest {

    @Test
    public void testGutterGame() {
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(0);
    }

}


}
