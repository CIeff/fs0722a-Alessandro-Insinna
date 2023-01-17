import { Injectable } from '@angular/core';
import {
   HttpRequest,
   HttpHandler,
   HttpEvent,
   HttpInterceptor
} from '@angular/common/http';
import { Observable, tap } from 'rxjs';

@Injectable()
export class LogInterceptorInterceptor implements HttpInterceptor {

   constructor() { }

   intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
      console.log("richiesta dal logInterceptor ",request)
      return next.handle(request).pipe(tap(ris=>{
         console.log("risposta dal logInterceptor ",ris)
      }));
   }
}
