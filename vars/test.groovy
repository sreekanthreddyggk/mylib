def call() {
   powershell '''
     Write-Output 'HIE devops'
   
    powershell -File "C:\\'Program Files (x86)'\\Jenkins\\workspace\\multi-share@libs\\mytestlibrary\\resources\\sc.ps1"
    '''


}
