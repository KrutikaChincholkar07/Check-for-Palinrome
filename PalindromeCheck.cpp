#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);

    // Convert to lowercase
    transform(str.begin(), str.end(), str.begin(), ::tolower);

    string reversed = str;
    reverse(reversed.begin(), reversed.end());

    if (str == reversed)
        cout << "It is a palindrome." << endl;
    else
        cout << "It is not a palindrome." << endl;

    return 0;
}
