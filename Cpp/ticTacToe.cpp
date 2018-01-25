/*
John Mackin
HW 4 #1
09/23/2017
*/
#include <iostream>

using namespace std;

void outputGrid(char movelist[]);

int main()
{

    char moveList[9]={'1','2','3','4','5','6','7','8','9'};
    int pos, movNum = 9;

	//counts turns down from 9 to 0
    while (movNum > 0){

		//get position from user
        cout << "Enter Position > ";
        cin >> pos;
        pos -= 1;

        //Check if position is available.
		
		
		//check if position on grid is available
        if ((moveList[pos] == 'x') || (moveList[pos] == 'o')){
            do{
                cout << "That Space is already taken, please enter a different position. >";
                cin >> pos;
                pos -= 1;
            }while ((moveList[pos] == 'x') || (moveList[pos] == 'o'));
        }
		
		//Xs go on even turns, Os goe on odd turns.
        if (movNum % 2 == 0){
            moveList[pos] = 'x';
        }else{
            moveList[pos] = 'o';
        }
		
		//passes array to function to be output as a grid.
        outputGrid(moveList);

        movNum--;
    }

	//returns final grid and 'game over'
    cout << "\nGame Over\n";

    outputGrid(moveList);

    return 0;
}
//returns updated grid.
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
