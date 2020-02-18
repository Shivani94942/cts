import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css'],
  providers:[DataService]
})
export class EmpListComponent implements OnInit {

  public employee=[];
  constructor(private dataService:DataService) {
    this.employee=this.dataService.getEmployees();
   }

  

  ngOnInit(): void {
  }

}
