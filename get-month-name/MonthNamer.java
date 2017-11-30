import java.util.Locale;
import java.text.DateFormatSymbols;

public class MonthNamer {

	private final static INVALID_MONTH_LABEL = "invalid month";

	private String getMonthName(Integer month){		
		if(month < 1 || month > 12){
			return INVALID_MONTH_LABEL;
		}
		return new DateFormatSymbols(Locale.ENGLISH).getShortMonths()[month-1];
	}

	public static void main(String[] args){
		Integer month = 1;
		String result = new MonthNamer().getMonthName(month);
		assert result == 'Jan'
	}
	
}


