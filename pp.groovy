pipeline {
    agent any 

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Здесь вы можете добавить команды сборки, например:
                // sh 'make'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Здесь вы можете добавить команды тестирования, например:
                // sh 'make test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Здесь вы можете добавить команды развертывания, например:
                // sh 'deploy.sh'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
