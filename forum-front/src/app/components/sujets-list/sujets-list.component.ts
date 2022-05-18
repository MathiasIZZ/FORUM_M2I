import { Component, OnInit } from '@angular/core';
import {SujetService} from "../../services/sujet.service";
import {Sujet} from "../../models/Sujet.entity";


@Component({
  selector: 'app-sujets-list',
  templateUrl: './sujets-list.component.html',
  styleUrls: ['./sujets-list.component.scss']
})
export class SujetsListComponent implements OnInit {
  sujet!: Sujet;
  sujets!: Sujet[];

  constructor(private service: SujetService) { }

  ngOnInit(): void {
    this.loadSujets();
  }

  loadSujets() {
    this.service.findAll().subscribe( (data) => {
      this.sujets = data
      console.log(this.sujets);
    })
  }

}
