#include <iostream>
#include <cstdlib>
#include <ctime>
#include <string>
using namespace std;

int level = 1;

namespace Engine {
    namespace Audio {

        void playSound(string name) {
            cout << "Playing: " << name << endl;
        }

    }
}

int main() {
    int level = 10;
    int R, C;
    cout << "\nEnter rows: ";
    cin >> R;
    cout << "Enter columns: ";
    cin >> C;
    int** map = new int*[R];

    for (int i = 0; i < R; i++) {
        map[i] = new int[C];
    }
    srand(time(0));
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            map[i][j] = rand() % 5;
        }
    }

    cout << "\n===== GAME MAP (" << R << " x " << C << ") =====\n";

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            cout << map[i][j] << " ";
        }
        cout << endl;
    }

    cout << "\nLegend: "
         << "0=Grass "
         << "1=Water "
         << "2=Mountain "
         << "3=Forest "
         << "4=Dungeon"
         << endl;

    int count[5] = {0};

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            count[map[i][j]]++;
        }
    }

    cout << "\nTile Count:\n";
    cout << "Grass    : " << count[0] << endl;
    cout << "Water    : " << count[1] << endl;
    cout << "Mountain : " << count[2] << endl;
    cout << "Forest   : " << count[3] << endl;
    cout << "Dungeon  : " << count[4] << endl;

    for (int i = 0; i < R; i++) {
        delete[] map[i];
    }

    delete[] map;

    return 0;
}