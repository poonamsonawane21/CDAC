#include <iostream>
using namespace std;

namespace Physics {
    double clamp(double val, double min, double max) {
        if (val < min)
            return min;
        if (val > max)
            return max;
        return val;
    }

    double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }
}

namespace GameMath {
    int clamp(int val, int min, int max) {
        if (val < min)
            return min;
        if (val > max)
            return max;
        return val;
    }

    double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }
}

int main() {

    double velocity = Physics::clamp(150.0, 0.0, 100.0);

    int health = GameMath::clamp(120, 0, 100);

    cout << "Clamped velocity: " << velocity << endl;
    cout << "Clamped health: " << health << endl;

    double physicsResult = Physics::lerp(0.0, 100.0, 0.5);
    double uiResult = GameMath::lerp(0.0, 200.0, 0.25);

    cout << "Physics lerp: " << physicsResult << endl;
    cout << "GameMath lerp: " << uiResult << endl;

    {
        using namespace Physics;

        double value = clamp(150.0, 0.0, 100.0);

        cout << "Using namespace Physics: "
             << value << endl;
    }

    cout << "Outside block: "
         << Physics::clamp(-10.0, 0.0, 100.0)
         << endl;

    return 0;
}