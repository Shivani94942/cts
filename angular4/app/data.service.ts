import { Injectable } from '@angular/core';
import { ReturnStatement } from '@angular/compiler';

@Injectable()
export class DataService {

  constructor() { }
  getEmployees(){
    return [
      {"id":"101","name":"john","gender":"male","salary":5000,"dateOfBirth":"10-20-2020"},
      {"id":"102","name":"mery","gender":"female","salary":5500,"dateOfBirth":"04-25-2020"},
      {"id":"103","name":"andrew","gender":"male","salary":6000,"dateOfBirth":"08-18-2020"},
      {"id":"104","name":"mattew","gender":"male","salary":6500,"dateOfBirth":"06-24-2020"},
      {"id":"105","name":"caleb","gender":"male","salary":7000,"dateOfBirth":"01-27-2020"},
];
  }
}
