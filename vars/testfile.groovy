#!/usr/bin/env groovy

def getFoo()  { 
   return this.foo 
   
}

def call() {
   this.foo = "working"
   this.var = "not working"
  
  
}
