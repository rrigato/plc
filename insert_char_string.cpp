#include <iostream>
#include <string>
//this assumes that the string is sorted
//it does not change the value of the string
//because it is pass by reference which only returns the value of a string
//These have parameters but do not use any variables
using namespace std;
string insertionsort(string );
char head (string );
string tail (string );
string insert (char , string  );
int main ()
{
    /*string test = "act";
    insert('s', test);
    cout << insert ('s', test);*/
    while (1)
    {
        string s;
        cout << "Enter any string: " <<endl;
        cin >>s;
        cout << "The sorted string is " <<insertionsort(s) <<endl;
    }
    cin.get();
    return 0;
}
string insert (char u, string  x)
{
    if (x.empty())
        { return x + u;}
    else if (head(x) <= u)
        {return (head(x) + insert(u,tail(x)));}
    else
        {return u + x;}

}
char head (string s)
{
    return s[0];
}
string tail (string s)
{
    return s.substr(1);
}

//functional version of a sorting algorithm
string insertionsort (string s)
{
    if (s.empty())
    {
        return s;
    }
    return insert(head(s), insertionsort(tail(s)));
}
