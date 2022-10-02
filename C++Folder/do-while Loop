/*
Made by Carl Lazaro @carllazaro
do-while loop
*/
#include <iostream>

using std::cout;
using std::cin;
using std::endl;
using std::string;

int main() {
    //intro
    cout << "Welcome" << endl;
    /*
    the program will accept
    uppercase and lowercase
    letter.
    */   
    string start;
    do {
        cout << "Press s | S to start" << endl;
        cout << ": ";
        cin >> start;
        /*
        - prompt the user to press
          s | S in order to start
          the game.
        
        - if the user inputs something
          other than s | S, the program
          will ask the user again to
          enter s | S.
        */
    }
    while(start.at(0) != 's' && start.at(0) != 'S');
    /*
    if the user inputs the right
    data, the program will proceed.
    */
    cout << "The game has started." << endl;
    cout << "*pew pew bam! boom! kaboom!" << endl << endl;
    cout << "The game has ended" << endl;
    // the game ends here
    string quit;
    do {
        cout << "Press q | Q to quit" << endl;
        cout << ": ";
        cin >> quit;
        /*
        - the program will ask the user 
          to enter q | Q to quit the game.
        
        - if the user inputs something other 
          than q | Q, the program will ask
          again the user to enter q | Q.
        */
    }
    while(quit.at(0) != 'q' && quit.at(0) != 'Q');
    cout << "You quit the game.\nThank you for playing." << endl;
    /*
    if the user's input is correct, 
    the program will automatically 
    going to exit.
    */
    exit(0);
    
    return 0;
}
//program ends here
