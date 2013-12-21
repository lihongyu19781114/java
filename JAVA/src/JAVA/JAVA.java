/**
 * JAVA.java v1.00
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package JAVA;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class JAVA {
	public static void main(String[] args) {
		JAVA.printCurrentTime();
	}//public static void main(String[] args)

	public static boolean isOddNumber(int Number) {
		//return Number % 2 == 1;	//NG when negative
		return Number % 2 != 0;		//OK when negative

		//[performance-critical]
		//return (Number & 1) != 0;	//OK when negative
		//[performance-critical]
	}

	public static boolean isEvenNumber(int Number) {
		return !isOddNumber(Number);
	}

	public static boolean isPrimeNumber(int Number) {
		if(Number <= 1) return false;
		for(int ii = 2; ii * ii <= Number; ii++) {
			if(Number % ii == 0) return false;
		}
		return true;
	}

	public static boolean isCompositeNumber(int Number) {
		if(Number <= 1) return false;
		for(int ii = 2; ii * ii <= Number; ii++) {
			if(Number % ii == 0) return true;
		}
		return false;
	}

	public static boolean canBeExpressedAsTheSumOfTwoPrimes(int Number) {
		if(Number <= 2) {
			return false;
		} else { // greater than 2
			if(isEvenNumber(Number)) { // even integer
				// Goldbach's conjecture
				// Every even integer greater than 2 can be expressed as the sum of two primes.
				return true;
			} else { // odd integer
				return (isPrimeNumber(Number - 2))?(true):(false);
			}
		}
	}

	public static int getBit(int inputNumber, int beginIndex) {
		return new Integer(
			String.valueOf(inputNumber).substring(beginIndex, beginIndex+1)
		).intValue();
	}

	//[REF_START][http://www.2cto.com/kf/201207/142436.html]
	public static double arithmetic(String exp){
		String result = parseExp(exp).replaceAll("[\\[\\]]", "");
		return Double.parseDouble(result);
	}

	private static String parseExp(String expression){
		expression=expression.replaceAll("\\s+", "").replaceAll("^\\((.+)\\)$", "$1");
		String minExp="^((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\]))[\\+\\-\\*\\/]((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\]))$";

		if(expression.matches(minExp)){
			String result=calculate(expression);
			return Double.parseDouble(result)>=0?result:"["+result+"]";
		}

		String noParentheses="^[^\\(\\)]+$";
		String priorOperatorExp="(((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\]))[\\*\\/]((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\])))";
		String operatorExp="(((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\]))[\\+\\-]((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\])))";

		if(expression.matches(noParentheses)){
			Pattern patt=Pattern.compile(priorOperatorExp);
			Matcher mat=patt.matcher(expression);
			if(mat.find()){
				String tempMinExp=mat.group();
				expression=expression.replaceFirst(priorOperatorExp, parseExp(tempMinExp));
			}else{
				patt=Pattern.compile(operatorExp);
				mat=patt.matcher(expression);

				if(mat.find()){
					String tempMinExp=mat.group();
					expression=expression.replaceFirst(operatorExp, parseExp(tempMinExp));
				}
			}
			return parseExp(expression);
		}

		String minParentheses="\\([^\\(\\)]+\\)";
		Pattern patt=Pattern.compile(minParentheses);
		Matcher mat=patt.matcher(expression);

		if(mat.find()){
			String tempMinExp=mat.group();
			expression=expression.replaceFirst(minParentheses, parseExp(tempMinExp));
		}

		return parseExp(expression);
	}

	private static String calculate(String exp){
		exp=exp.replaceAll("[\\[\\]]", "");
		String number[]=exp.replaceFirst("(\\d)[\\+\\-\\*\\/]", "$1,").split(",");
		BigDecimal number1=new BigDecimal(number[0]);
		BigDecimal number2=new BigDecimal(number[1]);
		BigDecimal result=null;

		String operator=exp.replaceFirst("^.*\\d([\\+\\-\\*\\/]).+$", "$1");

		if("+".equals(operator)){
			result=number1.add(number2);
		}else if("-".equals(operator)){
			result=number1.subtract(number2);
		}else if("*".equals(operator)){
			result=number1.multiply(number2);
		}else if("/".equals(operator)){
			result=number1.divide(number2);
		}

		return result!=null?result.toString():null;
	}
	//[REF_END][http://www.2cto.com/kf/201207/142436.html]

	public static void printCurrentTime() {
		System.out.println(
			Calendar.getInstance().get(Calendar.HOUR_OF_DAY)   + ":" +
			Calendar.getInstance().get(Calendar.MINUTE) + ":" +
			Calendar.getInstance().get(Calendar.SECOND));
	}

	public static int sum(int... args) {
		int return_value = 0;
		for(int arg : args) {
			return_value += arg;
		}
		return return_value;
	}

	public static int min(int firstArg, int... remainingArgs) {
		int return_value = firstArg;
		for(int arg : remainingArgs) {
			if(return_value > arg) return_value = arg;
		}
		return return_value;
	}

	public static int max(int firstArg, int... remainingArgs) {
		int return_value = firstArg;
		for(int arg : remainingArgs) {
			if(return_value < arg) return_value = arg;
		}
		return return_value;
	}
}//public final class JAVA
