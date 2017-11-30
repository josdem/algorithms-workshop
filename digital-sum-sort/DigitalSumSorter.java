public class DigitalSumSorter {

	private List<Integer> getMonthName(Integer month){		
		return new ArrayList<Integer>();
	}

	public static void main(String[] args){
		List<Integer> numbers = Arrays.asList(13, 20, 7, 4);
		List<Integer> result = new DigitalSumSorter().digitalSumSort(numbers);
		result.forEach(System.out::println);
	}
	
}


