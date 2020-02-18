import { Component, Output } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl:'./app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-dir';
  

  

  person={"fName":"mattew","lName":"vancouver","email":"matt@gmail.com"};

}
