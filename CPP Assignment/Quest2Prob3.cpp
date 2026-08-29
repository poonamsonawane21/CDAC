#include <iostream>
using namespace std;

int main() {

    int statusReg = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg = 0b11001010;

   
    // regPtr1: Pointer to const int
  
    const int* regPtr1 = &statusReg;

    cout << "Status Register : " << *regPtr1 << endl;

    // *regPtr1 = 100;
    // ERROR: regPtr1 points to a const value.
    // Firmware can read statusReg through this pointer,
    // but cannot modify it.

    // regPtr1 = &dataReg;
    // This is ALLOWED because the pointer itself is not const.
    // It can point to another int.


    // regPtr2: Const pointer to int

    int* const regPtr2 = &controlReg;

    *regPtr2 = 0b11110000;

    cout << "Control Register : " << *regPtr2 << endl;

    // regPtr2 = &dataReg;
    // ERROR: regPtr2 is a const pointer.
    // The pointer must always point to controlReg.


  
    // regPtr3: Const pointer to const int

    const int* const regPtr3 = &dataReg;

    cout << "ROM Config : " << *regPtr3 << endl;

    // *regPtr3 = 100;
    // ERROR: Cannot modify the value through regPtr3
    // because it points to a const int.

    // regPtr3 = &statusReg;
    // ERROR: Cannot change the address because
    // regPtr3 itself is also const.

    return 0;
}