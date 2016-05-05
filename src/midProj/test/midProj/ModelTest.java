package midProj;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MashaJM
 */
public class ModelTest {

    private Model model;

    @Test
    public void testFindMidNumber() throws Exception {

        assertEquals( 0, model.findMidNumber(0,0,0), 0.01);

        assertEquals( 1, model.findMidNumber(1,1,1), 0.01);

        assertEquals(24.7, model.findMidNumber(10,21,43), 0.1);


    }

    @Test
    public void testTheClosestInt() throws Exception {

        assertTrue (model.theClosestInt(12.4) - 12 < 0.01);


    }

   @Before
    public void setup() {

       model = new Model();
   }
}