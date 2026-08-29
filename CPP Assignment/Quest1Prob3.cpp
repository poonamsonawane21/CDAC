#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double temp[3][3];

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            cin >> temp[i][j];
        }
    }

    double hottest = temp[0][0];
    int hottestFloor = 0;
    int hottestRoom = 0;

    double highestAverage = -1;
    int hottestFloorIndex = 0;

    int warningCount = 0;

    cout << fixed << setprecision(1);

    cout << "        Room1 Room2 Room3" << endl;

    for (int i = 0; i < 3; i++) {
        cout << "Floor " << i + 1 << " : ";

        for (int j = 0; j < 3; j++) {
            cout << setw(5) << temp[i][j] << " ";

            if (temp[i][j] > hottest) {
                hottest = temp[i][j];
                hottestFloor = i;
                hottestRoom = j;
            }

            if (temp[i][j] >= 30) {
                warningCount++;
            }
        }

        cout << endl;
    }

    for (int i = 0; i < 3; i++) {
        double sum = 0;

        for (int j = 0; j < 3; j++) {
            sum += temp[i][j];
        }

        double average = sum / 3;

        if (average > highestAverage) {
            highestAverage = average;
            hottestFloorIndex = i;
        }
    }

    cout << setprecision(2);

    cout << "Hottest Room : Floor "
         << hottestFloor + 1
         << ", Room "
         << hottestRoom + 1
         << " → "
         << hottest
         << "°C" << endl;

    cout << "Hottest Floor : Floor "
         << hottestFloorIndex + 1
         << " (avg "
         << highestAverage
         << "°C)" << endl;

    cout << "Rooms at WARNING or above : "
         << warningCount << endl;

    return 0;
}