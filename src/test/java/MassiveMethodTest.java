import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class MassiveMethodTest {
	
	MassiveMethod massiveMethod;
	
	private static Stream<Arguments> intValuesWithoutFour() {
		return Stream.of(
			Arguments.arguments(new int[] {1, 2, 8, 16, 32, 64, 128, 256, 512, 1024}),
			Arguments.arguments(new int[] {0, 1, 2, 3}),
			Arguments.arguments(new int[] {1, -4, 5, 14, 44}),
			Arguments.arguments(new int[] {0})
		);
	}
	
	private static Stream<Arguments> intValues() {
		return Stream.of(
			Arguments.arguments(new int[] {1, 7}, new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}),
			Arguments.arguments(new int[] {}, new int[] {4}),
			Arguments.arguments(new int[] {}, new int[] {1, 4, 2, 4, 3, 4}),
			Arguments.arguments(new int[] {10, 11, 9}, new int[] {-10, 4, 4, 4, 5, 4, 10, 11, 9})
		);
	}
	
	@ParameterizedTest
	@MethodSource("intValuesWithoutFour")
	public void shouldReturnRuntimeExceptionWhenFourNotFound (int[] values) {
		Assertions.assertThrows(RuntimeException.class, () -> massiveMethod.getNumbersAfterLastFour(values));
	}
	
	@ParameterizedTest
	@MethodSource("intValues")
	public void shouldReturnValuesAfterLastFour (int[] expected, int[] real) {
		massiveMethod = new MassiveMethod();
		Assertions.assertArrayEquals(expected, massiveMethod.getNumbersAfterLastFour(real));
	}
}
