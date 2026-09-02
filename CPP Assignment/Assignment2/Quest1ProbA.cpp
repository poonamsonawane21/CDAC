#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Product {
private:
    int productId;
    string name;
    double price;
    int quantity;
public:
    void acceptDetails() {
        cout << "Enter Product ID: ";
        cin >> productId;

        cout << "Enter Name: ";
        cin >> name;

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Quantity: ";
        cin >> quantity;
    }

    void displayDetails() const {
        cout << left << setw(10) << productId
             << setw(15) << name
             << right << setw(10) << fixed << setprecision(2) << price
             << setw(8) << quantity
             << setw(15) << totalValue()
             << endl;
    }

    double totalValue() const {
        return price * quantity;
    }

    bool isLowStock(int threshold) const {
        return quantity < threshold;
    }

    string getName() const {
        return name;
    }
};

int main() {
    Product products[5];

    cout << "===== ENTER PRODUCT DETAILS =====\n";

    for (int i = 0; i < 5; i++) {
        cout << "\nProduct " << i + 1 << endl;
        products[i].acceptDetails();
    }

    cout << "\n\n===== INVENTORY REPORT =====\n";

    cout << left << setw(10) << "ID"
         << setw(15) << "Name"
         << right << setw(10) << "Price"
         << setw(8) << "Qty"
         << setw(15) << "Total Value"
         << endl;

    cout << string(58, '-') << endl;

    for (int i = 0; i < 5; i++) {
        products[i].displayDetails();
    }

    int highestIndex = 0;

    for (int i = 1; i < 5; i++) {
        if (products[i].totalValue() >
            products[highestIndex].totalValue()) {
            highestIndex = i;
        }
    }

    cout << "\nHighest Value Product : "
         << products[highestIndex].getName()
         << " (Rs. "
         << fixed << setprecision(2)
         << products[highestIndex].totalValue()
         << ")\n";

     int threshold;
    // cout << "\nEnter low stock threshold: ";
     cin >> threshold;

    cout << "\nLow Stock (threshold: "
         << threshold << ") : ";

    bool found = false;

    for (int i = 0; i < 5; i++) {
        if (products[i].isLowStock(threshold)) {
            if (found)
                cout << ", ";

            cout << products[i].getName();
            found = true;
        }
    }

    if (!found) {
        cout << "None";
    }

    cout << endl;

    return 0;
}