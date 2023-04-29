import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { retry, catchError } from 'rxjs/operators';
import { Observable, throwError } from 'rxjs';
import { Product } from '../models/product.model';
const productUrl = "http://localhost:9090/product"

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  // Http Headers
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  //DI
  constructor(public http: HttpClient) { }

  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(productUrl)
      .pipe(
        retry(1),
        catchError(this.errorHandler)
      )
  }

  //http://localhost:9090/product/1
  getProduct(productId: number): Observable<Product> {
    return this.http.get<Product>(`${productUrl}/${productId}`)
      .pipe(
        retry(1),
        catchError(this.errorHandler)
      )
  }
  //http://localhost:9090/product/1
  //deleting a product
  deleteProduct(productId: number) : Observable<Product> {
    return this.http.delete(`${productUrl}/${productId}`)
      .pipe(
        retry(1),
        catchError(this.errorHandler)
      )
  }
  //http://localhost:9090/product
  //saving a product
  saveProduct(product: Product): Observable<Product> {
    return this.http.post<Product>(productUrl, product, this.httpOptions)
      .pipe()
    /*     retry(1),
        catchError(this.errorHandler)
      ) */
  }
  //http://localhost:9090/product
  //updating a product
  updateProduct(product: Product): Observable<Product> {
    return this.http.put<Product>(productUrl, product, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandler)
      )
  }

  errorHandler(error: { error: { message: string; }; status: any; message: any; }) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }
}
