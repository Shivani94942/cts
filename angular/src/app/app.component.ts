import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  template:`<h1> App Component</h1>
  <h1>Mark</h1>
  <h1>{{name}}</h1>
  <h1>{{100+200}}</h1>
  <h1>{{'welcome'+name}}</h1>
<h1>{{name.toUpperCase()}}</h1>
<h1>{{getMessage()}}</h1>
<img [src]="imagePath"/>
<img [src]="imageName"/>
<img src="{{imagePath + imageName}}"/>
<button disabled>Click me</button><br>
<button disabled={{isDisabled}}>Click me</button><br>
<button [disabled]="isDisabled">Click me</button><br><br>
<button (click)="onButtonClicked($event)">Click</button>
  <button (dblclick)="onButtonClicked($event)">Double Click</button>
`,
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  title = 'angular';
  name = "sam williams";
  getMessage(){
    return "hey "+this.name
  }
  isDisabled=false;
  imagePath="https://www.google.com/logos/doodles/2016/googles-18th-birthday-5661535679545344-hp2x.gif";
  imageName="https://www.google.com/logos/doodles/2016/googles-18th-birthday-5661535679545344-hp2x.gif";

  onButtonClicked(event){
    console.log(event.type)
  }
}
