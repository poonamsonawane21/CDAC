#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

class Employee {
private:
    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;

    static int employeeCount;

public:

    Employee() {
        empId = 1001 + employeeCount;
        employeeCount++;

        name = "";
        department = "";
        grade = 'D';
        basicSalary = 10001;
        isActive = true;
    }

    void setName(const string& n) {
        if (n.empty()) {
            cout << "ERROR: Name cannot be empty." << endl;
            return;
        }

        name = n;
    }

    void setDepartment(const string& dept) {
        if (dept == "Engineering" ||
            dept == "HR" ||
            dept == "Finance" ||
            dept == "Operations") {

            department = dept;
        }
        else {
            cout << "ERROR: '" << dept
                 << "' is not a registered department." << endl;
        }
    }

    void setGrade(char g) {
        if (g == 'A' || g == 'B' || g == 'C' || g == 'D') {
            grade = g;
        }
        else {
            cout << "ERROR: Invalid grade '" << g
                 << "'. Accepted values: A, B, C, D." << endl;
        }
    }

    void setBasicSalary(double salary) {
        if (salary > 10000 && salary < 500000) {
            basicSalary = salary;
        }
        else {
            cout << "ERROR: Salary must be between "
                 << "Rs.10,000 and Rs.5,00,000. Value rejected."
                 << endl;
        }
    }

    void deactivate() {
        isActive = false;
    }

    // Getters
    int getEmpId() const {
        return empId;
    }

    string getName() const {
        return name;
    }

    string getDepartment() const {
        return department;
    }

    char getGrade() const {
        return grade;
    }

    double getBasicSalary() const {
        return basicSalary;
    }

    bool getIsActive() const {
        return isActive;
    }

    // Business Logic
    double computeAllowances() const {
        if (grade == 'A')
            return basicSalary * 0.40;
        else if (grade == 'B')
            return basicSalary * 0.30;
        else if (grade == 'C')
            return basicSalary * 0.20;
        else
            return basicSalary * 0.10;
    }

    double computeGrossSalary() const {
        return basicSalary + computeAllowances();
    }

    double computeTax() const {
        double gross = computeGrossSalary();

        if (gross <= 50000) {
            return 0;
        }
        else if (gross <= 100000) {
            return (gross - 50000) * 0.10;
        }
        else {
            return 5000 + (gross - 100000) * 0.20;
        }
    }

    double computeNetSalary() const {
        return computeGrossSalary() - computeTax();
    }

    void printPayslip() const {
        cout << fixed << setprecision(2);

        cout << "============================================" << endl;
        cout << "EMPLOYEE PAYSLIP - AUG 2026" << endl;
        cout << "============================================" << endl;

        cout << "Emp ID : " << empId << endl;
        cout << "Name : " << name << endl;
        cout << "Department : " << department << endl;
        cout << "Grade : " << grade << endl;
        cout << "Status : "
             << (isActive ? "Active" : "Inactive") << endl;

        cout << "--------------------------------------------" << endl;

        cout << "Basic Salary : Rs. "
             << basicSalary << endl;

        cout << "Allowances (";

        if (grade == 'A')
            cout << "40%";
        else if (grade == 'B')
            cout << "30%";
        else if (grade == 'C')
            cout << "20%";
        else
            cout << "10%";

        cout << ") : Rs. "
             << computeAllowances() << endl;

        cout << "Gross Salary : Rs. "
             << computeGrossSalary() << endl;

        cout << "--------------------------------------------" << endl;

        cout << "Tax Deduction : Rs. "
             << computeTax() << endl;

        cout << "Net Salary : Rs. "
             << computeNetSalary() << endl;

        cout << "============================================" << endl;
    }

    static int getEmployeeCount() {
        return employeeCount;
    }

    // Input
    void acceptDetails() {
        string inputName;
        string inputDepartment;
        char inputGrade;
        double inputSalary;

        cout << "Enter name: ";
        getline(cin >> ws, inputName);
        setName(inputName);

        cout << "Enter department: ";
        getline(cin, inputDepartment);
        setDepartment(inputDepartment);

        cout << "Enter grade: ";
        cin >> inputGrade;
        setGrade(inputGrade);

        cout << "Enter basic salary: ";
        cin >> inputSalary;
        setBasicSalary(inputSalary);
    }
};


int Employee::employeeCount = 0;


struct Layout1 {
    char c1;
    int i;
    char c2;
};

struct Layout2 {
    int i;
    char c1;
    char c2;
};

/*
    Struct Padding Explanation:

    1. Layout1 and Layout2 contain the same members but in a
       different order. Their sizes can therefore be different
       because of memory alignment requirements.

    2. Padding is extra unused memory inserted by the compiler
       between members or at the end of a structure so that
       members are stored at properly aligned memory addresses.

    3. Member order matters because it can change the amount of
       padding and therefore the total size of the structure.

    4. This is especially important for network packet headers
       and hardware register maps because their exact memory
       layout must match the expected hardware or protocol layout.
*/


int main() {

    // One object on stack
    Employee e1;

    // Two objects on heap
    Employee* e2 = new Employee();
    Employee* e3 = new Employee();

    e1.acceptDetails();
    e2->acceptDetails();
    e3->acceptDetails();

    /*
        e1.empId = 999;
        e1.basicSalary = -1000;

        ERROR: empId and basicSalary are private members.
        Private members cannot be accessed directly from main().
        They can only be accessed through public member functions.
        Setters are used so that validation happens before storing
        the data.
    */

    e1.printPayslip();
    e2->printPayslip();
    e3->printPayslip();

    // Simulate a resignation
    e3->deactivate();

    if (!e3->getIsActive()) {
        cout << e3->getName()
             << " is no longer active. Payroll skipped."
             << endl;
    }

    cout << "Total Employees : "
         << Employee::getEmployeeCount()
         << endl;

   
    cout << "Size of Layout1 : "
         << sizeof(Layout1) << endl;

    cout << "Size of Layout2 : "
         << sizeof(Layout2) << endl;

    delete e2;
    delete e3;

    return 0;
}