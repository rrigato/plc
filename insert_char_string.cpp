#include <iostream>
#include <string>
//this fu
using namespace std;
char head (string );
string tail (string );
string insert (char , string  );
int main ()
{
    string test = "act";
    insert('s', test);
    cout << insert ('s', test);
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

