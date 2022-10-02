/*
 - Made by Carl Lazaro @carllazaro
 - This Program will demonstrate a few
   <string functions> and <math functions>
  */  
#include <iostream>
#include <cmath>

using std::cout;
using std::cin;
using std::endl;
using std::string;

int main();

void string_functions() {
  /*
   - contains string functions
   - this'll print the string functions category.
   - select a number from one to ten (1-10).
   - select ten (10) to go back.
    */
  int select;
  string name;
  string firstname; //stores first name (NOTE: no blank spaces)
  string lastname; //stores last name (NOTE: no blank spaces)
  string fullname; //stores full name w/ blank spaces
  string username; //stores username (NOTE: no blank spaces)
  string word; //stores a word (NOTE: no blank spaces)
  string letter; //stores only one (1) letter
  
  //options:
  cout << "[1] length\n[2] empty\n[3] append" <<
  "\n[4] substr\n[5] insert\n[6] at\n[7] erase" <<
  "\n[8] find\n[9] clear\n[10] Back" << endl;
  cout << ": ";
  cin >> select;
  cout << endl;
  cin.ignore();
  
  //options cases:
  switch(select) {
    case 1:
      //for the <length> function
      cout << "Enter first name: ";
      cin >> firstname;
      cout << "Length: " << firstname.length() << endl;
      break;
    
    case 2:
      //for the <empty> function
      cout << "Enter name: ";
      getline(cin, name);
      if(name.empty()) {
        cout << "No input." << endl;
        break;
    
    case 3:
      //for the <append> function
      cout << "Enter username: ";
      cin >> username;
      cout << username.append("@gmail.com") << endl;
      break;
      
    case 4:
      //for the <substr (substring)> function
      cout << "Enter first name: ";
      cin >> firstname;
      cout << "New name: " << firstname.substr(0,3) << endl;
      break;
      
    case 5:
      //for the <insert> function
      cout << "Enter username: ";
      cin >> username;
      cout << "Hey " << username.insert(0,"@") << endl;
      break;
      
    case 6:
      //for the <at> function
      cout << "Enter first name: ";
      cin >> firstname;
      cout << "Enter last name: ";
      cin >> lastname;
      cout << "The first letter of your " <<
      "First name is " << firstname.at(0) << endl;
      cout << "The first letter of your " <<
      "Last name is " << lastname.at(0) << endl;
      break;
      
    case 7:
      //for the <erase> function
      cout << "Enter first name: ";
      cin >> firstname;
      cout << "Your new first name is: " << 
      firstname.erase(0,3) << endl;
      break;
      
    case 8:
      //for the <find> function
      cout << "Enter a word: ";
      cin >> word;
      cout << "Enter a letter you want to "
      "locate: ";
      cin >> letter;
      cout << "The letter " << letter << " in the word " <<
      word << " is in position: " << word.find(letter) << endl;
      break;
      cin.ignore();
      
    case 9:
      //for the <clear> function
      cout << "Enter your full name: ";
      getline(cin, fullname);
      cout << "Hello " << fullname << ", Welcome." << endl;
      fullname.clear();
      cout << "*Your full name has been cleared*" << endl;
      cout << "Welcome " << fullname << endl;
      break;
    
    case 10:
      //back key
      cout << endl;
      main();
      
    default:
      /*
       will prompt again if the user inputs
       an unexpexted input
        */
      cout << "Please enter something.";
      string_functions();
      }
  }
  //back key
  string back;
      cout << endl;
      cout << "[<] Back" << endl;
      cout << ": ";
      cin >> back;
      
      if(back == "<") {
        cout << endl;
        string_functions();
      } else {
        cout << endl;
        cout << "Program automatically stopped.";
        exit(0);
      }  
}
void math_functions() {
 
  using std::max;
  using std::min;
  int select;
  int num;
  int firstnum;
  int secondnum;
  int exponent;
  double num1;
  
  cout << "[1] maximum and minimum\n[2] square root"
  "\n[3] power\n[4] absolute value\n[5] rounding off" << endl;
  cout << ": ";
  cin >> select;
  cout << endl;
  switch(select) {
    case 1:
      cout << "Enter first number: ";
      cin >> firstnum;
      cout << "Enter second number: ";
      cin >> secondnum;
      cout << "minimum: " << min(firstnum, secondnum) << endl;
      cout << "maximum: " << max(firstnum, secondnum);
      break;
   
    case 2:
      cout << "Enter a number: ";
      cin >> num;
      cout << "The square root of " << num << " is " << sqrt(num);
      break;
      
    case 3:
      cout << "Enter a number: ";
      cin >> num;
      cout << "Enter exponent: ";
      cin >> exponent;
      cout << num << " raised to " << exponent << " is equal to " <<
      pow(num, exponent);
      break;
    
    case 4:
      cout << "Enter a number: ";
      cin >> num;
      cout << "The absolute value of " << num << " is " << abs(num);
      break;
    
    case 5:
      cout << "Enter a number: ";
      cin >> num1;
      cout << "simpler: " << round(num1) << endl;
      cout << "nearest: " << floor(num1) << endl;
      cout << "up: " << ceil(num1);
      break;
    
    default:
      /*
       will prompt again if the user inputs
       an unexpexted input
        */
      cout << "Please enter something.";
      string_functions();
   }
   //back key
   cout << endl;
   string back;
       cout << endl;
       cout << "[<] Back" << endl;
       cout << ": ";
       cin >> back;
      
       if(back == "<") {
       cout << endl;
       string_functions();
       } else {
         cout << endl;
         cout << "Program automatically stopped.";
         exit(0);
       }
}
int main() {
    string select;
    /*
      the user will choose only one (1) 
      between string functions and math
      functions - 1 for string functions
      and 2 for math functions.
    */
    cout << "Select what you want:" << endl;
    cout << "[1] string functions\n[2] "
    "math functions" << endl;
    cout << ": ";
    cin >> select;
    cout << endl;
    
    //conditions
    if(select == "1") {
      //activates the string_functions method
      string_functions();
    } else if(select == "2") {
      //activates the math_functions method
      math_functions(); 
    }
    else {
      /*
       will automatically terminate if the user
       inputs an unexpected input
        */ 
      cout << "Program automatically stopped.";
      exit(0);
    }
    return 0;
}
