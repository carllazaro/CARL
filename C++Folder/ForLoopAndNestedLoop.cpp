/*
  Made by Carl Lazaro @carllazaro
  - This program uses for loop and 
    nested loop.
  */
#include <iostream>

using std::cout;
using std::cin;
using std::endl;
using std::string;

int main() {
    /*
      This section is for the name 
      spelling, wherein the program 
      will ask the user to input any 
      word or his/her name.
      */
    string word;
    cout << "Enter a word: ";
    getline(cin,word);
    
    for(int i=0;i<word.length();i++) {
        cout << word.at(i) << " ";
    }
    //first section ends here
    cout << endl;
    
    /*
      This section will is for the
      shape generator, wherein the
      program will ask the user to
      input a symbol, width, and
      height of the shape he/she 
      want to create.
      */
    string symbol;
    int width;
    int height;
    
    /*
      - Any symbol is valid, also number.     
      - Different symbols and numbers 
        can affect the shape's appearance, 
        especially if the symbol is thin,
        you can increase or experiment the
        width to get the expectes result.
      - The width and height accepts only
        integers (whole number)
      */
    cout << "Enter symbol: ";
    cin >> symbol;
    cout << "Enter width: ";
    cin >> width;
    cout << "Enter height: ";
    cin >> height;
    cout << endl;
    
    //nested loop
    for(int i=0;i<height;i++) {
      for(int j=0;j < width;j++) {
        cout << symbol;
      }
      cout << endl;
    }
    //second section ends here
    return 0;
}
