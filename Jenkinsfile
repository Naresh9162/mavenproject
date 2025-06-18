pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Example: sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Example: sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                withCredentials([string(credentialsId:'deploy', variable: 'deploy')]) {
            sh 'export deploy=$deploy'

            
            sh 'chmod u+x $WORKSPACE/test-classes/seleniumJava/upload.sh; ./test-classes/seleniumJava/upload.sh'
        }
            }
        }
    }
}

