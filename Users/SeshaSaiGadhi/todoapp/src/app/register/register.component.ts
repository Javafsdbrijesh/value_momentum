import { Component, OnInit } from '@angular/core';





@Component({



  selector: 'app-register',



  templateUrl: './register.component.html',



  styleUrls: ['./register.component.css']



})



export class RegisterComponent implements OnInit {





  constructor() { }





  ngOnInit(): void {



  }



 



  //string Interpolation





  name = "sai"







//structure Directives





  isValidUser = false;







  departments = ["CSE","IT","MECH","ECE"]







  onClick(){





    alert("Button Clicked");





}



}