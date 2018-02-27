import java.util.stream.Collectors;

public class StringCompressor {

	private String compress(String string){
		string.chars()
        .mapToObj(i -> (char)i)
        .collect(Collectors.groupingBy(it -> it, Collectors.counting()))
    		.forEach((k, v) -> System.out.println((k.class + ":" + v.class)));    
		return "";
	}
	
	public static void main(String[] args){
		String string = "aaabbbbcc";
		String result = new StringCompressor().compress(string);
		assert "a3b4c2" == result;
	}

}