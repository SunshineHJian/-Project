package life_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Process_CellTest {


	@Before
	public void setUp() throws Exception {
		
	}
	@Test
	public void testInit_1() {
		
		assertEquals(true,Process_Cell.init_1(Life_GUI.flag, Life_GUI.size));
		
	}

	@Test
	public void testInit_2() {
		assertEquals(true,Process_Cell.init_2(Life_GUI.flag, Life_GUI.size));
	}

	@Test
	public void testInit_3() {
		
		assertEquals(true,Process_Cell.init_3(Life_GUI.flag, Life_GUI.size));
		
	}

	@Test
	public void testProcess() {
		assertEquals(true,Process_Cell.Process(Life_GUI.flag, Life_GUI.size));
	}

}
