#!/usr/bin/env groovy

def call(String name = 'human') {
  test1=working
  powershell "Write-Output 'Hello, $test1.'"
  
}

