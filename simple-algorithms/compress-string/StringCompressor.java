public class StringCompressor {

	private String compress(String string){
		return "";
	}
	
	public static void main(String[] args){
		String string = "aaabbbbcc";
		String result = new StringCompressor().compress(string);
		assert "a3b4c2" == result;
	}

}