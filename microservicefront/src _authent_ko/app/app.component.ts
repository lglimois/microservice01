import { Component } from '@angular/core';
import { AppService } from './app.service';

import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import 'rxjs/add/operator/finally';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  /*title = 'Mon Microservice';
  data = {};
  //data = {'author': 'john', 'title': 'doe'};
  constructor(private http: HttpClient) {
    http.get('http://localhost:8080/book').subscribe(data => this.data = data);
    console.log('reload');
  }*/
  constructor(private app: AppService, private http: HttpClient, private router: Router) {
      this.app.authenticate(undefined, undefined);
    }
    logout() {
      this.http.post('logout', {}).finally(() => {
          this.app.authenticated = false;
          this.router.navigateByUrl('/login');
      }).subscribe();
    }

}
