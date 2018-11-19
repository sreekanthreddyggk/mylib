#!/usr/bin/env groovy

def getFoo()  { 
   return this.foo 
   return var1
}

def call() {
   this.foo = "working"
   var1 = "not working"
  
  
}
