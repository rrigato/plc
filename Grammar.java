import java.util.Scanner;

public class Expressions {
static boolean ae(String [] tokens, int start, int end) {
if (start > end) return false;
if (start >0 && letter(tokens[start].charAt(0)) && integer(tokens[start-1]) ) return false;
if (start == end) return value(tokens[start]);

if (value(tokens[start])) return (ae(tokens, start+1, end));
char first = tokens[start].charAt(0), last =0;
int counter = start;
int temp = counter;
do
{
	if (tokens[counter].charAt(0) == ')') {
		last = tokens[counter].charAt(0);
		temp = counter;
	}
	counter++;
}while(counter <=end);
if (first=='-') return(ae(tokens, start+1, end));
if (
		(ae(tokens, start+1, temp -1)) 
		&& (  (first == '(' &&  last == ')' )) ){
		if (temp == end)
			return true;
		return ae(tokens,temp+1,end);
}
if (start >0 && operator(tokens[start]))return ae(tokens, start+1, end); 

// fill in recursive cases
return false;
}
static boolean arithmeticExpression(String [] tokens) {
return ae(tokens,0,tokens.length-1);
}
static boolean operator(String s) {
	char c = s.charAt(0);
	return (c=='+'||c=='-' ||c=='/'||c=='*' || c=='%') ;

}
static boolean nonnegativeInteger(String s) {
	if (s.length() ==1 && digit(s.charAt(0)) ) return true;
	if (digit(s.charAt(0))) return nonnegativeInteger(s.substring(1));
	return false;
}
static boolean negativeInteger(String s) {
		char first = s.charAt(0);
		if (( first == '-')) return true;
return false;
}
static boolean integer(String s) {
		if (nonnegativeInteger(s) || negativeInteger(s) ) return true;
		return false;
}
static boolean value(String s) {
	if (integer(s) ) return true;
	return variable(s);
}
static boolean digit(char c) {
	return c >=48 && c <= 57;
}
static boolean letter(char c) {
	return ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z');
}
static boolean varChar(char c) {
	if (letter(c) || digit(c)) return true;
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
			//	System.out.println(line);
				toks = line.split("\\s");
				 System.out.println(line+(arithmeticExpression(toks) ?" is ":" is not ") + " an expression.");
				}
		} while (!(line.equals("q")));
		}
}
