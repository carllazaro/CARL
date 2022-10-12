#include <iostream>
/*
 Made by Carl Lazaro @carllazaro 
  */
using std::cout;
using std::cin;
using std::endl;
using std::string;
typedef std::string s_t;
typedef int i_t;
typedef double d_t;

int main() {
    
    s_t brand;
    s_t model;
    i_t year;
    d_t price;
    
    cout << "Enter car brand: ";
    cin >> brand;
    cout << "Enter car model: ";
    cin >> model;
    cout << "Enter year: ";
    cin >> year;
    cout << "Enter price: ";
    cin >> price;
    cout << endl;
    cout << "This is your receipt" << endl;
    printf("Car brand: [%s]\nCar model: [%s]", brand.c_str(), model.c_str()); cout << endl;
    printf("Year: [%d]\nPrice: [%.2f]", year, price);
    cout << endl;
    
    return 0;
} 
