import { Injectable } from '@angular/core';
import {
  HttpEvent, HttpInterceptor, HttpHandler, HttpRequest
} from '@angular/common/http';

import { Observable } from 'rxjs';

/** Pass untouched request through to the next request handler. */
@Injectable()
export class NoopInterceptor implements HttpInterceptor {
  curToken: string = "";

  intercept(req: HttpRequest<any>, next: HttpHandler):
    Observable<HttpEvent<any>> {
    console.log("appel de l'interceptor");
    if (req.headers.get("Autorization"))
    {
      this.curToken = req.headers.get('Autorization')
      console.log("Autorization:"+this.curToken);
      localStorage.setItem('Autorization', this.curToken);
    }
    else
    {
      localStorage.setItem('Autorization', 'rien');
      console.log("pas de token");
    }
    return next.handle(req);
  }
}
