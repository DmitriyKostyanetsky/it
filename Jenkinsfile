pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew assemble'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Deploy to k8s') {
            steps {
                script {
                    sh 'helm upgrade java-app HelmChart/'
                }
            }
        }

    }
}
