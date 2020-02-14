export class Employee
{
    constructor(
        public firstName:String,
        public lastName:String,
        public salary:Number,
        public gender:String,
        public email:String
    ){

    }
    getFullName(){
        console.log("Full name of this employee is :"+this.firstName+" "+this.lastName);
    }
}
let emp=new Employee("John","Doe",50000,"Male","doe@mail.com");
console.log(emp);
emp.getFullName();