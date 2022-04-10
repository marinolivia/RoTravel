import { Injectable } from '@angular/core';

//manageriaza tokenul si inf userului in sesiunea curenta

const TOKEN_KEY='auth-token';
const USER_KEY = 'auth-user';
@Injectable({
  providedIn: 'root'
})
export class TokenStorageService {

  constructor() { }

  public saveToken(token:string):void{
    window.sessionStorage.removeItem(TOKEN_KEY);
    window.sessionStorage.setItem(TOKEN_KEY,token);
  }

  public getToken():String{
    return sessionStorage.getItem(TOKEN_KEY);
  }

  public saveUser(user):void{
    window.sessionStorage.removeItem(USER_KEY);
    window.sessionStorage.setItem(USER_KEY,JSON.stringify(user));
  }

  public getUser():any{
    return JSON.parse(sessionStorage.getItem(USER_KEY))
  }

  signOut():void{
    window.sessionStorage.clear();
  }
}
