import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { Erro404Component } from './erro404/erro404.component';

const routes: Routes = [
  {path:'',component:HomeComponent}
  ,{path:'home',component:HomeComponent}

  ,{path:'**', component:Erro404Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
