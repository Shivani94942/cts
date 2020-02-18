import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl:'./app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-dir';
  employees=[
    {"id":"000","name":"mary","age":"25"},
  {"id":"111","name":"andrew","age":"19"},
  {"id":"222","name":"kriston","age":"28"},
  {"id":"333","name":"jason","age":"21"}
  ];

}
