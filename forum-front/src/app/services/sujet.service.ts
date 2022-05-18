import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Sujet} from "../models/Sujet.entity";
import {environment} from "../../environments/environment";


@Injectable({
  providedIn: 'root'
})
export class SujetService {

  constructor(private http: HttpClient) { }

  findAll() {
    return this.http.get<Sujet[]>(`${environment.apiBaseUrl}/sujets/all`);
  }

  findById(id: string | null) {
    return this.http.get<Sujet>(`${environment.apiBaseUrl}/sujets/${id}`)
  }
  create(sujet: Sujet) {
    return this.http.post<Sujet>(`${environment.apiBaseUrl}/sujets`, sujet);
  }

  delete(id: string) {
    return this.http.delete(`${environment.apiBaseUrl}/sujets/${id}`);
  }

  like(id: string) {
    return this.http.get(`${environment.apiBaseUrl}/sujets/like/${id}`);
  }

  unlike(id: string) {
    return this.http.get(`${environment.apiBaseUrl}/sujets/unlike/${id}`);
  }



}
