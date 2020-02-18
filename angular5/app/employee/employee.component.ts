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
  public employees=[];

  ngOnInit(): void {
    this.dataService.getEmployees().subscribe(data => this.employees=data);
  }

}
