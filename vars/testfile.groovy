#!/usr/bin/env groovy

def getFoo()  { return this.foo }

def call(String name = 'human') {
   this.foo = "hie variable working"
  powershell "Write-Output 'Hello, $name.'"
  
}
