def call() {
   powershell "Write-Output 'HIE devops'"
   powershell "Powershell.exe -File C:\Program Files (x86)\Jenkins\workspace\multi-share@libs\mytestlibrary\vars\sc.ps1"


}
