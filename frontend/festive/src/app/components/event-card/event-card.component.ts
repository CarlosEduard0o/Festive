import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-event-card-component',
  standalone: true,
  imports: [],
  templateUrl: './event-card.component.html',
  styleUrl: './event-card.component.css'
})
export class EventCardComponent {
  @Input() title!: string;
  @Input() description!: string;
}
