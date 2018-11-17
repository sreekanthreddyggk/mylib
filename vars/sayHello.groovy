#!/usr/bin/env groovy

var1="var1"
def call(String name = 'human') {
 
  powershell "Write-Output 'Hello, $name.'"
  
}

