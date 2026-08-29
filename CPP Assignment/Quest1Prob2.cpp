#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int N;
    cin >> N;

    double arr[100];

    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }

    int skipped = 0;
    int normal = 0, warning = 0, critical = 0, shutdown = 0;

    double minTemp = 0;
    double maxTemp = 0;
    double sum = 0;
    int validCount = 0;

    int firstCriticalIndex = -1;

    cout << "Readings entered : " << N << endl;
    cout << "Valid readings : ";

    for (int i = 0; i < N; i++) {

        if (arr[i] < 0) {
            skipped++;
            continue;
        }

        cout << arr[i] << " ";

        if (validCount == 0) {
            minTemp = arr[i];
            maxTemp = arr[i];
        }

   
        if (arr[i] < minTemp) {
            minTemp = arr[i];
        }

        if (arr[i] > maxTemp) {
            maxTemp = arr[i];
        }

        sum += arr[i];
        validCount++;

        // Count categories
        if (arr[i] <= 29) {
            normal++;
        }
        else if (arr[i] <= 44) {
            warning++;
        }
        else if (arr[i] <= 59) {
            critical++;
        }
        else {
            shutdown++;
        }
    }

    cout << endl;

    cout << "Skipped (errors) : " << skipped << endl;

    // Find first reading >= 45 using break
    for (int i = 0; i < N; i++) {
        if (arr[i] >= 45) {
            firstCriticalIndex = i;
            break;
        }
    }

    if (firstCriticalIndex != -1) {
        cout << "First CRITICAL : Index "
             << firstCriticalIndex
             << " → " << arr[firstCriticalIndex] << "°C" << endl;
    }
    else {
        cout << "First CRITICAL : None" << endl;
    }

    double average = sum / validCount;

    cout << fixed << setprecision(2);

    cout << "Min : " << minTemp << "°C "
         << "Max : " << maxTemp << "°C "
         << "Avg : " << average << "°C" << endl;

    cout << "Normal:" << normal
         << " Warning:" << warning
         << " Critical:" << critical
         << " Shutdown:" << shutdown << endl;

    return 0;
}