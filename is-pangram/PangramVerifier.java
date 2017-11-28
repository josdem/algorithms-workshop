import java.util.List;
import java.util.Arrays;
import java.lang.Character;

public class PangramVerifier {

	private List<Character> alphabet = Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');

	private Boolean isPangram(String quote){
		Boolean allInAlphabet = true;
		for(char c : quote.toCharArray()){
			if(!alphabet.contains(Character.toUpperCase(c))){
				allInAlphabet = false;
			}
    }
    return allInAlphabet;
	}


	public static void main(String[] args){
		String quote = "The quick brown fox jumps over the lazy dog";
		Boolean result = new PangramVerifier().isPangram(quote);
		System.out.println(result);
	}
	
}
