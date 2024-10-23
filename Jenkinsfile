pipeline {
    agent any 

    libraries {
        library 'colorize'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                script {
                    // Вызов функции из vars/myFunction.groovy
                    colorizeString('HEllo World!','red')
                }

            }
        }
    }
}
