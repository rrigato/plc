import java.util.Scanner;

public class Expressions {
static boolean ae(String [] tokens, int start, int end) {
if (start > end) return false;
if (start == end) return value(tokens[start]);
if (tokens[start].length() ==2) return negativeInteger(tokens[start]);
//for (int counter = 0; counter <end; counter++)
//System.out.println(tokens[counter]);
//if (negativeInteger(tokens[start])) return true;
//if (ae(tokens, start+1, end)) return true;
//int counter = 0;
////return operator(tokens[0]);
//for (; counter <end; counter++)
//	{
//		
//	}


// fill in recursive cases
return false;
}
static boolean arithmeticExpression(String [] tokens) {
return ae(tokens,0,tokens.length-1);
}
static boolean operator(String s) {
	//return (s.charAt(0)||s.compareTo("-") ||s.compareTo("*")||s.equals("/") || s.equals("%")) ;
	return false;
}
static boolean nonnegativeInteger(String s) {
	if (s.length() ==1 && digit(s.charAt(0)) ) return true;
	if (digit(s.charAt(0))) return nonnegativeInteger(s.substring(1));
	return false;
}
static boolean negativeInteger(String s) {
		if ((s.charAt(0) == '-')) return true;
return false;
}
static boolean integer(String s) {
return false;
}
static boolean value(String s) {
	if (s.length() ==1 && letter(s.charAt(0) ) ) return true;
	return variable(s);
}
static boolean digit(char c) {
	return c >=48 && c <= 57;
}
static boolean letter(char c) {
	return ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z');
}
static boolean varChar(char c) {
return false;
}
static boolean variable(String s) {

	
	if (letter(s.charAt(0)) && variableTail(s.substring(1)) ) return true;
	return false;
}
static boolean variableTail(String s) {
	if (s.isEmpty()) return true;
	if   (varChar(s.charAt(0)) && variableTail(s.substring(1))  ) return true;
	return false;
	
}
static String addSpaces(String s) {
	// nothing to add here
	if (s.length() <= 1) return s;
	String first = s.substring(0, 1);
	char c = s.charAt(0), d = s.charAt(1);
	boolean addSpace = !(c==' ' || d==' ' || (c=='-' && digit(d)) || varChar(c) && varChar(d));
	if (addSpace) first += " ";
	return first + addSpaces(s.substring(1));
}
public static void main(String[] args) {
		// nothing to add here
		Scanner in = new Scanner(System.in);
		String[] toks ;
		String line;
		do {
				System.out.print("Enter a line or 'q' to quit: ");
				line = in.nextLine();
				if (!line.equals("q")) {
				line = addSpaces(line);
				toks = line.split("\\s");
				 System.out.println(line+(arithmeticExpression(toks) ?" is ":" is not ") + " an expression.");
				}
		} while (!(line.equals("q")));
		}
}
