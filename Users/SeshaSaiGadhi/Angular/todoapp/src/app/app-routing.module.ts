
import { HomeComponent } from './home/home.component';

import { NgModule } from '@angular/core';

import { RouterModule, Routes } from '@angular/router';

import { ListUserComponent } from './listuser/listuser.component';
import { LoginComponent } from './login/login.component';

import { RegisterComponent } from './register/register.component';

import { AddtaskComponent } from './addtask/addtask.component';

import { ListtaskComponent } from './listtask/listtask.component';

import { EdittaskComponent } from './edittask/edittask.component';

import { EditUserComponent } from './edit-user/edit-user.component';

import { ViewUserComponent } from './view-user/view-user.component';





const routes: Routes = [



  {path:'home', component:HomeComponent},



  {path:'register', component:RegisterComponent},



  {path:'login', component:LoginComponent},



  {path:'users', component:ListUserComponent},

  {path:'listtask',component:ListtaskComponent},

  {path:'addtask', component:AddtaskComponent},

  {path:'edittask', component:EdittaskComponent},

  {path:'edituser', component:EditUserComponent},

  {path:'viewuser', component:ViewUserComponent},

  {path:'', redirectTo:'home' ,pathMatch:'full'}



];





@NgModule({



  imports: [RouterModule.forRoot(routes)],



  exports: [RouterModule]



})



export class AppRoutingModule { }