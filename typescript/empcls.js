"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(firstName, lastName, salary, gender, email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
        this.email = email;
    }
    Employee.prototype.getFullName = function () {
        console.log("Full name of this employee is :" + this.firstName + " " + this.lastName);
    };
    return Employee;
}());
exports.Employee = Employee;
var emp = new Employee("John", "Doe", 50000, "Male", "doe@mail.com");
console.log(emp);
emp.getFullName();
