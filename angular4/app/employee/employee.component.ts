import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
  providers:[DataService]
})
export class EmployeeComponent implements OnInit {

  constructor(private dataService:DataService) { }
  public employee=[];

  ngOnInit(): void {
    this.employee=this.dataService.getEmployees();
  }

}
