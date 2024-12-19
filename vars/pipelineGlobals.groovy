def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "851725610589"
        case 'qa':
            return "851725610589"
        case 'uat':
            return "851725610589"
        case 'pre-prod':
            return "851725610589"
        case 'prod':
            return "851725610589"
        default:
            return "nothing"
    } 
}