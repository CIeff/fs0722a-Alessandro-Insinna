import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpResponse,
  HttpErrorResponse
} from '@angular/common/http';
import { Observable, catchError, throwError } from 'rxjs';

@Injectable()
export class LogInterceptor implements HttpInterceptor {

  constructor() {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    return next.handle(request).pipe(
      catchError((error:HttpErrorResponse)=>{
        let errore="";
        if(error.error instanceof ErrorEvent){
          console.log("this is a client side error");
          errore=`error: ${error.error.message}`
        } else{
          console.log("this is a server side error");
          errore=`error code: ${error.status}, Message: ${error.message}`
        }
        console.log(errore);
        return throwError(errore)
      })
    )


}

}
