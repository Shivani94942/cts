import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css'],
  providers:[DataService]
})
export class EmpListComponent implements OnInit {

  constructor(private dataService:DataService) { }
  public employees=[];

  ngOnInit(): void {
    this.dataService.getEmployees().subscribe(data => this.employees=data);
  }

  

 
}
