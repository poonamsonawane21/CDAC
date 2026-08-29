#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

double computeRMS(double* signal, int n) {
    double sum = 0;

    for (int i = 0; i < n; i++) {
        sum += (*(signal + i)) * (*(signal + i));
    }

    return sqrt(sum / n);
}

void normalise(double* signal, int n) {
    double maxAbs = 0;

    for (int i = 0; i < n; i++) {
        if (abs(*(signal + i)) > maxAbs) {
            maxAbs = abs(*(signal + i));
        }
    }

    if (maxAbs != 0) {
        for (int i = 0; i < n; i++) {
            *(signal + i) = *(signal + i) / maxAbs;
        }
    }
}

int countZeroCrossings(double* signal, int n) {
    int count = 0;

    for (int i = 0; i < n - 1; i++) {
        if ((*(signal + i) < 0 && *(signal + i + 1) > 0) ||
            (*(signal + i) > 0 && *(signal + i + 1) < 0)) {
            count++;
        }
    }

    return count;
}

void applyGain(double* signal, int n, double gainFactor) {
    for (int i = 0; i < n; i++) {
        *(signal + i) = *(signal + i) * gainFactor;
    }
}

// Print array
void printArray(double* signal, int n) {
    for (int i = 0; i < n; i++) {
        cout << *(signal + i) << " ";
    }
    cout << endl;
}

int main() {

    double signal[] = {
        0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1
    };

    int n = 7;
    double gainFactor = 2.0;

    cout << fixed << setprecision(2);

    cout << "Before : ";
    printArray(signal, n);

    double rms = computeRMS(signal, n);

    int crossings = countZeroCrossings(signal, n);

    normalise(signal, n);

    cout << "After normalise : ";
    printArray(signal, n);

    applyGain(signal, n, gainFactor);

    cout << "After applyGain : ";
    printArray(signal, n);

    cout << "RMS : " << rms << endl;
    cout << "Zero Crossings : " << crossings << endl;

    return 0;
}