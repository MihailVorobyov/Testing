import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MassiveMethodTest {
	
	MassiveMethod massiveMethod;
	
	@Test
	public void shouldReturnNumbersAfterLastFour() {
		massiveMethod = new MassiveMethod();
		Assert.assertArrayEquals(new int[] {5, 6}, massiveMethod.getNumbersAfterLastFour(new int[] {0, 1, 2, 3, 4, 5, 6}));
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldReturnRuntimeException() {
		massiveMethod = new MassiveMethod();
		massiveMethod.getNumbersAfterLastFour(new int[] {0, 1, 2, 3, 2, 1, 0});
	}
}
