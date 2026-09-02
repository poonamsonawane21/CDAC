#include <iostream>
#include <iomanip>
using namespace std;

double reorderCost(int qty, double unitPrice) {
    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice) {
    return qty * unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate) {
    double cost = qty * unitPrice;
    return cost + (cost * taxRate / 100);
}

double applyDiscount(double price, double discountPercent = 10.0) {
    return price - (price * discountPercent / 100);
}

int main() {
    cout << fixed << setprecision(2);

    cout << "Integer reorder cost: Rs. "
         << reorderCost(10, 50.00) << endl;

    cout << "Fractional reorder cost: Rs. "
         << reorderCost(2.5, 100.00) << endl;

    cout << "Reorder cost with tax: Rs. "
         << reorderCost(10, 50.00, 18.0) << endl;

    cout << "Price after default discount: Rs. "
         << applyDiscount(1000.00) << endl;

    cout << "Price after 20% discount: Rs. "
         << applyDiscount(1000.00, 20.0) << endl;

    return 0;
}