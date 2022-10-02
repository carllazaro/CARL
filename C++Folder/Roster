#include <iostream>

using std::cout;
using std::cin;
using std::endl;
using std::string;
typedef std::string txt;
typedef int num;

int main() {
    
    num number;
    cout << "Number of players" << endl;
    cout << ": ";
    cin >> number;
    cin.ignore();
    txt* pPlayers = new txt[number];
    
    cout << "ENTER PLAYER NAME AND ROLE :\n(ex: Player 1 | Point Guard)" << endl;
    for(int i=0;i<number;i++) {
        cout << "P" << i+1 << ": ";
        getline(cin,pPlayers[i]);
    }
    cout << endl;
    cout << "\nROSTER: " << endl;
    for(int i=0;i<number;i++) {
        cout << "Player #" << i+1 << ": " << pPlayers[i] << endl;
    }
    
    return 0;
}
