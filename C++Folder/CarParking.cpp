#include <iostream>
#include <stdlib.h>
//#include <time.h>
#include <ctime>

using std::cout;
using std::cin;
using std::endl;
using std::string;

int main() {
    
    srand(time(NULL));
    string fullname;
    string email;
    int number;
    
    cout << "Enter full name : ";
    getline(cin,fullname);
    cout << "Enter email address : " << endl;
    cin >> email;
    cout << "Enter number of car : ";
    cin >> number;
    cin.ignore();

    string* pCars = new string[number];
    cout << endl;
    
    for(int i=0;i<number;i++) {
        cout << "Enter car #" << i+1 << " : ";
        getline(cin,pCars[i]);
    }
    cout << endl << endl;
    cout << "-------------------------------------" << endl;
    cout << "        SORSOGON LUXURY HOTEL" << endl;
    cout << "-------------------------------------" << endl;
    cout << "OWNER'S DETAILS" << endl;
    cout << "    Full name : " << fullname << '\n' << "    Email address : " << '\n' << "    " << email << endl;
                             time_t t = time(0);
                             tm* now = localtime(&t);
                             cout << "    Date : " << (now->tm_year + 1900) << '-' 
                             << (now->tm_mon + 1) << '-'
                             <<  now->tm_mday + 1
                             << "\n";
    cout << "-------------------------------------" << endl;
    cout << "             PARKING SLOT" << endl;
    cout << "-------------------------------------" << endl;
    
    for(int i=0;i<number;i++) {
        int position = rand()%50+1;
        cout << pCars[i] << " : Parked at slot " << "[" << position << "]" << endl;
        cout << "-------------------------------------" << endl;
    }
    cout << "          Transaction success." << endl;
    cout << "      Salamat sa pagtitiwala lods." << endl << endl;
    
    return 0;
}
