#!/usr/bin/env groovy

def call(String name = 'human') {
  powershell "Write-Output 'Hello, $name.'"
}

