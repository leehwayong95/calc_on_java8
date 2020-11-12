package calc;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class InputedNumberController extends CalculatorMain {
	String tmpInteger = "";
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	ArrayList<String> op = new ArrayList<String>();
	boolean repeatFlag = false; // equals �ݺ� �����
	boolean opeditFlag = false; // ������ ������
	int repeatresult = 0; //�ݺ������� ���� ����� �����

	public void NumberActionListener(String number)
	{
		if(repeatFlag)
			reset_List();
		frame.requestFocus();
		frame.setFocusable(true);
		this.tmpinputNumber(number);
		answerRecord.setText(tmpInteger); //ȭ�� ���� ��ȯ
	}
	
	public void OpActionListener(String op)
	{
		repeatFlag = false;
		repeatresult = 0;
		frame.requestFocus();
		frame.setFocusable(true);
		if(!opeditFlag)
			this.inputOp(op);
		else
			this.editOp(op);
		answerRecord.setText(op);
	}
	
	public void EquActionListener()
	{
		frame.requestFocus();
		frame.setFocusable(true);
		if(!repeatFlag)
		{
			String result = calresult();
			answerRecord.setText(result);
			//System.out.println("RESULT : "+result);//DEBUG
		}
		else
		{
			String result = repeatCal();
			answerRecord.setText(result);
		}
	}
	
	//���� �Է� �̿�
	void tmpinputNumber(String input)
	{
		opeditFlag = false;
		tmpInteger += input;
	}
	
	//������ �Է½� ����
	void inputNumber()
	{
		if(tmpInteger.equals(""))
			numbers.add(0);
		else
		{
			try {
				numbers.add(Integer.parseInt(tmpInteger));
			}
			catch(Exception e)
			{
				System.out.println("fuck");
			}
		}
		tmpInteger="";
	}
	
	//���� ��� ť
	void inputOp(String input)
	{
		this.inputNumber();//�Է����� ���� list�� �ֱ�
		op.add(input);
		opeditFlag = true;
	}
	
	//������ ���� ť
	void editOp(String input)
	{
		op.set(op.size()-1, input);
		opeditFlag = true;
	}
	
	//equals �Է½� ���� ����
	String calresult ()
	{
		this.inputNumber(); //�Է����� ���� list�� �ֱ�
		int result = 0;
		if(numbers.size() == 1||op.size() == 0) {
			return Integer.toString(numbers.get(0));
		}
		else
		{
			int size = numbers.size();
			for(int i = 0 ; i < size; i++)
			{
				if(i == 0)
					result += numbers.get(0);
				else
				{
					if(op.get(i-1).equals("+"))
						result += numbers.get(i);
					else if(op.get(i-1).equals("-"))
						result -= numbers.get(i);
					else if(op.get(i-1).equals("*"))
						result *= numbers.get(i);
					else if(op.get(i-1).equals("/"))
					{
						try {
							result /= numbers.get(i);
						}
						catch (Exception e)
						{
							System.out.println("0���� ������ �õ�");
						}
					}
				}
			}
			repeatFlag = true;
			repeatresult = result; //�ݺ� �����..
			return Integer.toString(result);
		}
	}
	
	String repeatCal()
	{
		int x = numbers.get(numbers.size()-1);
		String operation = op.get(op.size()-1);
		if(operation.equals("+"))
			repeatresult += x;
		else if(operation.equals("-"))
			repeatresult -= x;
		else if(operation.equals("*"))
			repeatresult *= x;
		else if(operation.equals("/"))
			repeatresult /= x;
		
		return Integer.toString(repeatresult);
	}
	
	void reset_List()
	{
		numbers.clear();
		op.clear();
		repeatresult = 0;
		repeatFlag = false;
	}
	
}