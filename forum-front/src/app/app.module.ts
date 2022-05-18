import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { SujetsListComponent } from './components/sujets-list/sujets-list.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { SujetComponent } from './components/sujet/sujet.component';
import { MessagesListComponent } from './components/messages-list/messages-list.component';
import { MessageFormComponent } from './components/message-form/message-form.component';
import { SujetFormComponent } from './components/sujet-form/sujet-form.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    SujetsListComponent,
    SujetComponent,
    MessagesListComponent,
    MessageFormComponent,
    SujetFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
