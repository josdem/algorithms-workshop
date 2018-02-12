public class KangarooMeasurer {

	private Boolean measure(
		Integer x1, 
		Integer v1,
		Integer x2,
		Integer v2){

		double left = v1 - v2;
		double right = x2 - x1;

		if(left < 0){
			left = left * -1;
			right = right * -1;
		}

		double result = right / left;		
		return right > 0 && result % 1 == 0;
	}

	public static void main(String[] args){
		Integer x1 = 0;
		Integer v1 = 3;
		Integer x2 = 4;
		Integer v2 = 2;
		Boolean meets = new KangarooMeasurer().measure(x1, v1, x2, v2);
		assert true == meets;
	}
	
}