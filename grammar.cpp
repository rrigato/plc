#include <iostream>
#include <string>
using namespace std;
bool isPal(string);
bool isLetter(char);
int main ()
{
	string test;
	cout << "enter a string: " <<endl;
	cin >> test ;
	isPal (test);
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
		isPal(test.substr(1,test.length() -2));
	}
	

	return false;
}

bool isLetter(char test)
{
	if ((test >97) && (test <122))
			return true;
	return false;
}
