pipeline {
    agent any 

    libraries {
        library 'my-shared-library'
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
