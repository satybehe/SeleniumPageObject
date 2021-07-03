pipeline {
    agent any
    tools{
    maven 'Maven-3.6.3'
    }

    options {
        timestamps()
    }

    stages {
        stage('setup') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/satybehe/SeleniumPageObject.git'
            }
        }

        stage('build') {

            sh 'mvn clean install'
        }

        stage('test') {

            sh 'mvn test'
        }

    }
}
