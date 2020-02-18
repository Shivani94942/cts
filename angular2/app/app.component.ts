import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template:`
  <h1>TEmplate Reference variable</h1>
  <input type="text" #myInput />
  <button (click)="onButtonClick(myInput.value)">Button</button>

  <p>Two Way Data Binding</p>
  <h1>{{name}}</h1>
  <input type="text"  [(ngModel)]="name"/>

  <h1>Template Reference variable with Two Way Data Binding </h1>
  <h1>{{name}}</h1>
  <input type="text" #myInput [(ngModel)]="name"/>
  <button (click)="onButtonClick(myInput.value)">Button</button>
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-dir';
  name="andrew";
  onButtonClick(value){
      console.log(value);
  }

}
