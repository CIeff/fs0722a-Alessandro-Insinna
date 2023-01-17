import { Injectable } from '@angular/core';
import {
   HttpRequest,
   HttpHandler,
   HttpEvent,
   HttpInterceptor
} from '@angular/common/http';
import { Observable, tap } from 'rxjs';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

   constructor() { }

   intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
      console.log("ti sto intercettando da AuthInterceptor", request);
      const newReq=request.clone({
         headers:request.headers.append("Auth","secretId").append("firma","xyz")
      });
      return next.handle(newReq).pipe(tap(event=>{
         console.log("nuova richiesta: ", newReq);
         console.log("sono la risposta della chiamata da AuthInterceptor ",event)
      }));
   }
}
