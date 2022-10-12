#include <iostream>

using std::cout;
using std::cin;
using std::endl;
using std::string;

int main() {
  
  int num;
  do {
  cout << "Enter a number (1-10) : ";
  cin >> num;
  cout << "\nNumber : " << num << endl;
  cout  << endl;  
  cin.ignore();
  for(int i=1;i<=10;i++) {
    cout << "    "  << num << " x " << i  << " = " << num * i << endl;
  }
  string ans;
  cout << "\nTry again (y/n) : ";
  cin >> ans;
  
  if(ans.at(0)=='y' || ans.at(0)=='Y') {
    cout << endl;
    cout << "_________________________" << endl << endl;
    continue;
  }else if(ans.at(0)=='n' || ans.at(0)=='N') {
    break;
  }
  }
  while(true);
  return 0;
}
