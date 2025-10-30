pipeline {
    agent {
        docker {
            image 'maven:3.8.6-openjdk-17'
        }
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Nitour/demo-jenkins-pipeline.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        success {
            echo '✅ Build succeeded!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
