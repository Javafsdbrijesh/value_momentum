import { Component, OnInit } from '@angular/core';



@Component({

  selector: 'app-list-users',

  templateUrl: './listuser.component.html',

  styleUrls: ['./listuser.component.css']

})

export class ListUserComponent implements OnInit {



  constructor() { }



  ngOnInit(): void {

  }




//users!:any;

  //users = ["saigadhi","sai","nehru"];

 users=[

  {id:101, name:"saigadhi", email:"saigadhi@gmail.com"},

  {id:102, name:"sai", email:"sai@gmail.com"},

  {id:103, name:"nehru", email:"nehru@gmail.com"},

];



//Next Task:ListTaskComponent

tasks = [

  {id:1, name:"Install Java", status:"COMPLETED"},

  {id:2, name:"Install NodeJS", status:"PENDING"},

]

  deleteUser(){

    alert("Successfully Deleted");

  }





}

function deleteUser() {

  throw new Error('Function not implemented.');

}