public class PangramVerifier {

  private static final Integer = ASCII_ALPHABET_SUM = 2015;

	private Boolean isPangram(String quote){
		Integer sum = quote.toUpperCase().chars().filter(x -> x > 64 & x < 91).distinct().sum();
		return sum == ASCII_ALPHABET_SUM;
	}

	public static void main(String[] args){
		String quote = "The quick brown fox jumps over the lazy dog";
		Boolean result = new PangramVerifier().isPangram(quote);
		assert result;
	}

}
