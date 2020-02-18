import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";

import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { EmployeeComponent } from './employee/employee.component';
import { TitlePipe } from "./title.pipe";
import { EmpListComponent } from './emp-list/emp-list.component';
import { DataService } from './data.service';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    EmployeeComponent,
    TitlePipe,
    EmpListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
