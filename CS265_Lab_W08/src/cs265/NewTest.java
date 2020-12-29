package cs265;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class NewTest {

	// test data
	private static Object[][] testData = new Object[][] {
			// id, variable1, variable2, ... variableN, expected
			{"T1", true, true, true, true, 14},
			{"T2", true, true, true, false, 18},
			{"T3", true, true, false, true, 18},
			{"T4", true, true, false, false, 18},
			{"T5", true, false, true, true, 4},
			{"T6", true, false, true, false, 8},
			{"T7", true, false, false, true, 8},
			{"T8", true, false, false, false, 8},
			{"T9", false, true, true, true, 5},
			{"T10", false, true, true, false, 10},
			{"T11", false, true, false, true, 10},
			{"T12", false, true, false, false, 10 }
	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void test(String id, boolean cocktail, boolean nonAlc, boolean student, boolean happyHour, int expected) {
		assertEquals(CS265_Lab_W08.getPrice(cocktail, nonAlc, student, happyHour),expected);
	}
}