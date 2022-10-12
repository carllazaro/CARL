#include <iostream>
#include <ctime>

using std::cout;
using std::cin;
using std::endl;
typedef int number_t;

int main() {
  
  int num;
  int guess;
  int attempts = 0;
  
  srand(time(NULL));
  
  num = (rand()%50)+1;
  do {
    cout << "Guess the Random number (1-50) : ";
    cin >> guess;
    attempts++;
    
    if(guess > num) {
      cout << "Too high" << endl;
    }else if(guess < num) {
      cout << "Too low" << endl;
    }else {
      cout << "You guessed it right!" << endl;
      cout << "Attempts : " << attempts << endl;
    }
    
  }while(guess != num);
  return 0;
}
