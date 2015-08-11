import java.util.Scanner;
public class Expressions {
static boolean ae(String [] tokens, int start, int end) {
if (start > end) return false;
if (start == end) return value(tokens[start]);
// fill in recursive cases
return false;
}
static boolean arithmeticExpression(String [] tokens) {
return ae(tokens,0,tokens.length-1);
}
static boolean operator(String s) {
return false;
}
static boolean nonnegativeInteger(String s) {
return false;
}
static boolean negativeInteger(String s) {
return false;
}
static boolean integer(String s) {
return false;
}
static boolean value(String s) {
return false;
}
static boolean digit(char c) {
	return c >=48 && c <= 57;
}
static boolean letter(char c) {
 		
		return ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z');

}
static boolean varChar(char c) {
return ( letter(c) || digit(c) );
}
static boolean variable(String s) {
return false;
}
static boolean variableTail(String s) {
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
