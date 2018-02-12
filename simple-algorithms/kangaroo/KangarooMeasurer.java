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
		Integer jumpsUnus = 3;
		Integer startDuo = 4;
		Integer jumpsDuo = 2;
		Boolean meets = new KangarooMeasurer().measure(startUnus, jumpsUnus, startDuo, jumpsDuo);
		assert true == meets;
	}
	
}