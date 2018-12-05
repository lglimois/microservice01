import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';
import { HttpClient } from '@angular/common/http';

@Component({
  templateUrl: './home.component.html'
})
export class HomeComponent {

  title = 'Demo';
  data = {};

  constructor(private app: AppService, private http: HttpClient) {
    http.get('http://localhost:8080/book').subscribe(data => this.data = data);
  }

  authenticated() { return this.app.authenticated; }

}
