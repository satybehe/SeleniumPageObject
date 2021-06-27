node {

   stage('setup') {

      // Get some code from a GitHub repository
    try{
      git 'https://github.com/satybehe/SeleniumPageObject.git'

    }
    catch (err){
      echo err
   }

   }
   stage('build') {
      // Installing Dependencies
      sh 'mvn clean install'
    }

   stage('test') {
          try{
          sh 'mvn test'
          }
          catch (err){
          echo err
          }
   }
   stage('end') {
     echo "Success"
     }
 }
}