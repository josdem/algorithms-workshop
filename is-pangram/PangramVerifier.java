import java.util.List;
import java.util.Arrays;
import java.lang.Character;

public class PangramVerifier {

	private Boolean isPangram(String quote){
		quote.toUpperCase().chars().filter(x -> x > 64 & x < 91).forEach(System.out::println);
		return false;
	}


	public static void main(String[] args){
		String quote = "The quick brown fox jumps over the lazy dog";
		Boolean result = new PangramVerifier().isPangram(quote);
		System.out.println(result);
	}
	
}
