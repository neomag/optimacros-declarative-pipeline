@library('colorize')

pipeline {
    agent any 

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                script {
                    colorizeString('HEllo World!','red')
                }

            }
        }
    }
}
