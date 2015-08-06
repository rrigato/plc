#include <iostream>
#include <string>
using namespace std;
bool isPal(string);
bool isLetter(char);
int main ()
{
	string test;
	cout << "enter a string: " <<endl;
	string Exit = "quit";
	do
	{
		getline( cin,test);
	
		if (isPal (test))
			cout <<"Yes the string is part of the grammar" <<endl;
		else
			cout << "No the string is not part of the grammar" <<endl;
	}	while(test != Exit);

		return 0;
}

bool isPal (string test)
{
	if (test.empty())
	{
		return true;
	}
	else if (test.length() ==1)
	{
		char letter = test[0];
		return isLetter(letter);
	}
	else if (test[0] == test[test.length() - 1])
	{
		string temp;

		temp = test.substr(1,(test.length() -2));
		if (temp.empty())
			return true;

		return isPal(temp);
	}
	

	return false;
}

bool isLetter(char test)
{
	if ((test >97) && (test <122))
			return true;
	return false;
}
