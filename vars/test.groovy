def call() {
   powershell '''
     Write-Output 'HIE devops'
   
    powershell -File sc.ps1
    '''


}
