#!/usr/bin/env groovy

def getFoo()  { 
   return this
   
}

def call() {
   this.foo = "working"
   this.var1 = "'not working'"
   this.git_url= "git credentialsId: 'e8e06f69-3c5e-4417-a719-ad4e73f6b346', url: 'https://github.com/sreekanthreddyggk/ASPNETCore-WebAPI-Sample.git'"

}
