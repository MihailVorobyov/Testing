public class OneOrFour {
	
	public boolean findOneOrFour(int[] array) {
		for (int number : array) {
			if (number == 1 || number == 4) {
				return true;
			}
		}
		return false;
	}
}
