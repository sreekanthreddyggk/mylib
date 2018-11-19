#!/usr/bin/env groovy

def getFoo()  { 
   return this
   
}

def call() {
   this.foo = "working"
   this.var1 = "'not working'"
   this.sreekanth="'Minoosha gottigadla'"
  
}
