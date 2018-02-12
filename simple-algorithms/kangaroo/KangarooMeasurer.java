

public class KangarooMeasurer {

	private Boolean measure(
		Integer startUnus, 
		Integer jumpsUnus,
		Integer startDuo,
		Integer jumpsDuo){

		return false;
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