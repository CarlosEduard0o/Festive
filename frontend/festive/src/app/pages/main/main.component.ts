import { Component } from '@angular/core';
import { NavBarComponent } from "../../components/nav-bar/nav-bar.component";
import {FormsModule} from '@angular/forms';

import {MatButtonModule} from '@angular/material/button';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatMenuModule} from '@angular/material/menu';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatListModule} from '@angular/material/list';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatTooltipModule} from '@angular/material/tooltip';


import {Router, RouterModule, RouterOutlet} from '@angular/router';

import {FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import * as fontawesome from '@fortawesome/free-solid-svg-icons';
import { SearchFieldComponent } from "../../components/search-field/search-field.component";
import { EventCarouselComponent } from "../../components/event-carousel/event-carousel.component";
import { EventCardComponent } from "../../components/event-card/event-card.component";
import { CommonModule } from '@angular/common';
import { FooterComponent } from "../../components/footer/footer.component";
import { NewsLetterComponent } from "../../components/news-letter/news-letter.component";
import { SectionTitleComponent } from "../../components/section-title/section-title.component";

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [
    CommonModule,
    RouterOutlet,
    FormsModule,
    MatButtonModule,
    MatSidenavModule,
    MatMenuModule,
    MatToolbarModule,
    MatIconModule,
    MatListModule,
    RouterModule,
    MatExpansionModule,
    MatTooltipModule,
    FontAwesomeModule,
    NavBarComponent,
    SearchFieldComponent,
    EventCarouselComponent,
    EventCardComponent,
    FooterComponent,
    NewsLetterComponent,
    SectionTitleComponent
],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {
  faCoffee = fontawesome.faHeartBroken;
  
  sections = [
    {
      sectionTitle: 'Música',
      events: [
        { title: "images/image-1.jpg", description: 'Descrição do Evento 1' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 2' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 3' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 4' },
      ]
    },
    {
      sectionTitle: 'Teatro',
      events: [
        { title: "images/image-1.jpg", description: 'Descrição do Evento 5' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 6' },
      ]
    },
    {
      sectionTitle: 'Stand up',
      events: [
        { title: "images/image-1.jpg", description: 'Descrição do Evento 7' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 8' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 9' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 10' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 11' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 12' },
        { title: "images/image-1.jpg", description: 'Descrição do Evento 13' },
      ]
    }
  ];

  constructor(private router: Router) {
  }

  logout() {
  // this.authenticationService.logout();
  // this.router.navigate(['account/sign-in']);
  }

}
