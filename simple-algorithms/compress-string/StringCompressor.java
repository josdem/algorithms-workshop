import java.util.Map;
import java.util.stream.Collectors;

public class StringCompressor {

	private String compress(String string){
		Map<Character, Long> map = string.chars()
        .mapToObj(i -> (char)i)
        .collect(Collectors.groupingBy(it -> it, Collectors.counting()));

    StringBuffer sb = new StringBuffer();    

    map.forEach((k,v) -> sb.append(k.toString() + v.toString()));    
		return sb.toString();
	}
	
	public static void main(String[] args){
		String string = "aaabbbbcc";
		String result = new StringCompressor().compress(string);
		System.out.println(result);		
	}

}