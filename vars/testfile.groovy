#!/usr/bin/env groovy

def getFoo()  { return this.foo }

def call(String name = 'human') {
   this.foo = "working"
  powershell "Write-Output 'Hello, $name.'"
  
}
