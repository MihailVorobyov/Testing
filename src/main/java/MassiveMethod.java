public class MassiveMethod {
	
	public int[] getNumbersAfterLastFour(int[] array) {
		if (array.length == 0) {
			throw new RuntimeException();
		}
		int lastFourIndex = -1;
		
		for (int i = array.length - 1; i >= 0 ; i--) {
			if (array[i] == 4) {
				lastFourIndex = i;
				
				int[] afterFourArray = new int[array.length - lastFourIndex - 1];
				for (int j = lastFourIndex + 1; j < array.length; j++) {
					afterFourArray[j - lastFourIndex - 1] = array[j];
				}
				return afterFourArray;
			}
		}
		throw new RuntimeException();
	}
}
