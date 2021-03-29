pipeline {

    agent any
    tools {
        maven "Maven 3.6.3"
    }

    stages {
        stage('Build') {
            steps {
                echo 'Hello There!'
                echo 'General Kenobi..'
                sh 'java --version'
                sh 'mvn clean compile'
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}