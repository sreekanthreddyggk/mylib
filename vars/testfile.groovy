#!/usr/bin/env groovy

def call() {
   powershell returnStatus: true, script: '.\\mylib\\vars\\sc.ps1'
   var0 = "working"
   this.var1 = "'not working'"
   this.var2 = "'devops working'"


}
