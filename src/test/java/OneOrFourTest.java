import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class OneOrFourTest {
	
	private static OneOrFour oneOrFour;
	
	private static Stream<Arguments> intValuesWithoutOneOrFour() {
		return Stream.of(
			Arguments.arguments(new int[] {0, 2, 8, 16, 32, 64, 128, 256, 512, 1024}),
			Arguments.arguments(new int[] {0, 11, 2, 33}),
			Arguments.arguments(new int[] {-1, -4, 5, 14, 44}),
			Arguments.arguments(new int[] {0}),
			Arguments.arguments(new int[] {})
		);
	}
	
	private static Stream<Arguments> intValuesWithOneOrFour() {
		return Stream.of(
			Arguments.arguments(new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}),
			Arguments.arguments(new int[] {4}),
			Arguments.arguments(new int[] {1, 4, 2, 4, 1, 4}),
			Arguments.arguments(new int[] {-10, -4, 4, 4, 5, 4, 10, 11, 9})
		);
	}
	
	@BeforeAll
	public static void init() {
		oneOrFour = new OneOrFour();
	}
	
	@ParameterizedTest
	@MethodSource("intValuesWithOneOrFour")
	public void shouldReturnTrueWhenOneOrFourFound (int[] values) {
		Assertions.assertTrue(oneOrFour.findOneOrFour(values));
	}
	
	@ParameterizedTest
	@MethodSource("intValuesWithoutOneOrFour")
	public void shouldReturnFalseWhenOneOrFourNotFound (int[] values) {
		Assertions.assertFalse(oneOrFour.findOneOrFour(values));
	}
}
