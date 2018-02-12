public class KangarooMeasurer {

	private Boolean measure(
		Integer startUnus, 
		Integer jumpsUnus,
		Integer startDuo,
		Integer jumpsDuo){

		double left = jumpsUnus - jumpsDuo;
		double right = startDuo - startUnus;

		if(left < 0){
			left = left * -1;
			right = right * -1;
		}

		double result = right / left;		
		return right > 0 && result % 1 == 0;
	}

	public static void main(String[] args){
		Integer startUnus = 0;
		Integer jumpsUnus = 2;
		Integer startDuo = 5;
		Integer jumpsDuo = 3;
		Boolean meets = new KangarooMeasurer().measure(startUnus, jumpsUnus, startDuo, jumpsDuo);
		assert true == meets;
	}
	
}