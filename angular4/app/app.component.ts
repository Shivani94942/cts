import { Component, Output } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl:'./app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-dir';
  
    name="Mattew Anderson";
    currentDate=" 10-24-2020";
    person={
      "firstname":"john",
      "lastname":"doe",
      "email":"doe@mail.com",
      "salary":2000,
      "gender":"male"
    }

}
