#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

inline double distanceBetween(
    double x1,
    double y1,
    double x2,
    double y2
) {
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}

inline double toRadians(double degrees) {
    return degrees * (M_PI / 180.0);
}

inline double clamp(
    double value,
    double minVal,
    double maxVal
) {
    if (value < minVal)
        return minVal;

    if (value > maxVal)
        return maxVal;

    return value;
}

inline bool isInSafeZone(
    double x,
    double y,
    double cx,
    double cy,
    double radius
) {
    double distance = distanceBetween(x, y, cx, cy);

    return distance <= radius;
}

int main() {

    double homeX = 0.0;
    double homeY = 0.0;

    double radius = 50.0;

    double x[] = {30.0, 40.0, 60.0};
    double y[] = {40.0, 30.0, 10.0};

    cout << fixed << setprecision(2);

    for (int i = 0; i < 3; i++) {

        double distance = distanceBetween(
            homeX,
            homeY,
            x[i],
            y[i]
        );

        bool safe = isInSafeZone(
            x[i],
            y[i],
            homeX,
            homeY,
            radius
        );

        cout << "Waypoint " << i + 1 << " : ("
             << x[i] << ", " << y[i] << ")" << endl;

        cout << "Distance from home : "
             << distance << " units" << endl;

        cout << "Safe Zone : "
             << (safe ? "Inside" : "Outside")
             << endl;

        cout << endl;
    }

    cout << "90 degrees in radians : "
         << toRadians(90.0) << endl;

    cout << "Clamp 75 to [0, 50] : "
         << clamp(75.0, 0.0, 50.0) << endl;

    return 0;
}