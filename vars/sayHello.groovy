#!/usr/bin/env groovy

def call(String name = 'human') {
  powershell "Hello, $name."
}

