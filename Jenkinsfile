pipeline {
    agent any

    tools {
        maven 'maven 3.9.6'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Analyse') {
            steps {
                echo 'Analysing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
