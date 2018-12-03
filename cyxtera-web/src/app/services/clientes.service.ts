import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { catchError, map, tap } from 'rxjs/operators';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Respuesta } from '../objects/respuesta' 
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class ClientesService {
  private urlApi = 'http://localhost:8084/cyxteraweb/clients/';
  constructor(private http: HttpClient) { }

  getClientes(): Observable<Respuesta> {
    return this.http.get<Respuesta>(this.urlApi)
      .pipe(
        catchError(this.handleError('getClientes', null))
      );
  }

  postClientes(dto):Observable<Respuesta>{
    let headers = new Headers({
      'Content-Type': 'application/json'
    });
    return this.http.post<Respuesta>(this.urlApi, dto)
    .pipe(
      catchError(this.handleError('postClientes', null))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
  return (error: any): Observable<T> => {
 
    // Se lanza el error al log
    console.error(error);
 
    // Se lanza el error al usuario.
    //this.log(`${operation} failed: ${error.message}`);
    return of(result as T);
  };
}
}
