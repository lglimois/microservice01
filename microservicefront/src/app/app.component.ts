import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Mon Microservice';
  data = {};
  lienappli = 'http://www.google.com';
  //data = {'author': 'john', 'title': 'doe'};
  constructor(private http: HttpClient) {
    http.get('api/book').subscribe(data => this.data = data);

    console.log('reload');
  }

  onNavigate(){
    window.open(this.lienappli, "_blank");
 }

}
