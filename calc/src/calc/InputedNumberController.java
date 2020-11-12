package calc;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class InputedNumberController extends CalculatorMain {


	public void NumberActionListener(String number)
	{
		frame.requestFocus();
		frame.setFocusable(true);
		
		answerRecord.setText( number);
		
	}
	

}