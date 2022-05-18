import {Component, Input, OnInit} from '@angular/core';
import {Sujet} from "../../models/Sujet.entity";
import {SujetService} from "../../services/sujet.service";

@Component({
  selector: 'app-sujet',
  templateUrl: './sujet.component.html',
  styleUrls: ['./sujet.component.scss']
})
export class SujetComponent implements OnInit {

  @Input() sujet!: Sujet;

  constructor(private service: SujetService) { }

  ngOnInit(): void {
  }

}
