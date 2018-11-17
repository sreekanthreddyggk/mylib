#!/usr/bin/env groovy

class Globals {
   static String ouch = "I'm global.."
}

def call(String name = 'human') {
 
  powershell "Write-Output 'Hello, $name.'"
  
}

