#include <iostream>

using namespace std;

void outputGrid(char movelist[]);

int main()
{

    char moveList[9]={'1','2','3','4','5','6','7','8','9'};
    int pos, movNum = 9;

    while (movNum > 0){

        cout << "Enter Position > ";
        cin >> pos;
        pos -= 1;

        //Check if position is available.

        if ((moveList[pos] == 'x') || (moveList[pos] == 'o')){
            do{
                cout << "That Space is already taken, please enter a different position. >";
                cin >> pos;
                pos -= 1;
            }while ((moveList[pos] == 'x') || (moveList[pos] == 'o'));
        }

        if (movNum % 2 == 0){
            moveList[pos] = 'x';
        }else{
            moveList[pos] = 'o';
        }

        outputGrid(moveList);

        movNum--;
    }

    cout << "\nGame Over\n";

    outputGrid(moveList);




    return 0;
}

void outputGrid(char movelist[]){

    int z = 0;


    cout << endl;
    //Creates grid
    for (int x = 0; x < 3; x++){
        for (int y = 0; y < 3; y++){
            cout << movelist[z] << " ";
            z++;
        }
        cout << endl;
    }

    cout << endl;

}
