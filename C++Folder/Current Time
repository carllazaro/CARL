#include <ctime>
#include <iostream>

using std::cout;
using std::endl;

int main() {
    time_t t = time(0);
    tm* now = localtime(&t);
    cout << (now->tm_year + 1900) << '-' 
         << (now->tm_mon + 1) << '-'
         <<  now->tm_mday + 1
         << "\n";
}
