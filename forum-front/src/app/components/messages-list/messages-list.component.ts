import { Component, OnInit } from '@angular/core';
import {Sujet} from "../../models/Sujet.entity";
import {Message} from "../../models/Message.entity";
import {SujetService} from "../../services/sujet.service";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {dashCaseToCamelCase} from "@angular/compiler/src/util";

@Component({
  selector: 'app-messages-list',
  templateUrl: './messages-list.component.html',
  styleUrls: ['./messages-list.component.scss']
})
export class MessagesListComponent implements OnInit {


  sujetId!: string | null;
  sujet!: Sujet;
  messages!: Message[];

  constructor(private sujetService: SujetService, private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe( (paramMap: ParamMap) => {
      const id = paramMap.get('id');
      this.sujetId = id;
    });
  }

  ngOnInit(): void {
    this.sujetId = this.activatedRoute.snapshot.params['sujetId'];
    console.log(this.sujetId);
  }

  loadSujet() {
    this.sujetService.findById(this.sujetId).subscribe((data) => {
      this.sujet = data;
    });
  }






}
