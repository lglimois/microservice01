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

  curToken: String = "";

  //data = {'author': 'john', 'title': 'doe'};
  constructor(private http: HttpClient) {
    http.get('api/book').subscribe(data => this.data = data);

    this.curToken = localStorage.getItem("Autorization");

    console.log('reload');
  }

  onNavigate(){
    window.open(this.lienappli, "_blank");
 }

}
