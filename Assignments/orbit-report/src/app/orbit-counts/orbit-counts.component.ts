import { Component, OnInit, Input} from '@angular/core';
import { Satellite } from '../satellite';
@Component({
  selector: 'app-orbit-counts',
  templateUrl: './orbit-counts.component.html',
  styleUrls: ['./orbit-counts.component.css']
})
export class OrbitCountsComponent implements OnInit {
  @Input() satellites: Satellite[];

  constructor() { }

  ngOnInit() {
  }
  countByType(type: string): number{
    let count: number = 0;
    let index: number = 0;
    while(index < this.satellites.length){
      if(type.toLowerCase() === this.satellites[index].type.toLowerCase()){
        count += 1;
      }
      index = index + 1;
    }
    return count;
  }

}
