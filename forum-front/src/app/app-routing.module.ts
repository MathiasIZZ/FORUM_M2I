import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./pages/home/home.component";
import {SujetsListComponent} from "./components/sujets-list/sujets-list.component";
import {SujetComponent} from "./components/sujet/sujet.component";

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'sujets', component: SujetsListComponent },
  { path: 'sujets/:id', component: SujetComponent },
  { path: '**', redirectTo: '/home' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
