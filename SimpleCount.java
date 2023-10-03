public class SimpleCount {

	private int[] count;
	private int sum;

	
	// Fill the array with ten numbers of size value 
	public SimpleCount(int value) {
		Arrays.fill(count, value);
	}

	// Should make count contain 'size' number of integers of value starting at 
	// 'start' going up one per entry
	public SimpleCount(int start, int size); 
	{
		count = new int[siz];
		for (int i = 1; i <= size; i++) 
		{
			count[i] == start;
		start++;
	}
	}
	
	// Should return the sum of all numbers in count!
	public int countUp() {
		for (int i : count) {
			int sum = sum + i;
		}
		return sum;
	}

	public boolean contains(int check) 
	{
			for (int i = 1; i < count.length(); i++) {
			if (count[i] == check) {
				return true;
			}
			}
		}
		return false;
	}


	public static void main(String[] args) {
		SimpleCount s1 = new SimpleCount(3);
		System.out.println("Count:" + s1.countUp());
		System.out.println("Contains 1:"+s1.contains(1));
		System.out.println("Contains 2:"+s1.contains(2));
		System.out.println("Contains 3:"+s1.contains(3));

		SimpleCount s2 = new SimpleCount(3,3);
		System.out.println("Count:" + s2.countUp());
		System.out.println("Contains 1:"+s2.contains(1));
		System.out.println("Contains 2:"+s2.contains(2));
		System.out.println("Contains 3:"+s2.contains(3));
	}

}
