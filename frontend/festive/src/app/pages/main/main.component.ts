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

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [
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
    EventCarouselComponent
],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {
  faCoffee = fontawesome.faHeartBroken;

  constructor(private router: Router) {
  }

  logout() {
  // this.authenticationService.logout();
  // this.router.navigate(['account/sign-in']);
  }

}