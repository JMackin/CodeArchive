#include <iostream>
#include <fstream>
#include <cstring>

using namespace std;

int main()
{
    ifstream aFile;
    char filename[20];
    int n = 0, x = 0;
    double someNums[100];
    double numAvg = 0;

    //Get file name from user and open stream.
    cout << "Enter input file complete with file path> ";

    cin.getline(filename,20,'\n');

    aFile.open(filename);


    //read file to number array and compute average
    while(!aFile.eof()){
       aFile >> someNums[n];
       numAvg += someNums[n];
       n++;
    }

    numAvg /= n;


    //output number list.
    for(int x =0; x < n; x++){
        cout << someNums[x] << endl;
    }

    //return average
    cout << "\nAverage: " << numAvg << endl;


    //close file stream
    aFile.close();


    return 0;
}
