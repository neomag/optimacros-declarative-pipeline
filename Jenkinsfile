@Library('colorize') _ 

pipeline {
    agent any 

    options {
        ansiColor('xterm')
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                echo 'set +x'
                script {
                    colorize('HEllo World!','red')
                    colorize('HEllo World!','green')
                    colorize('HEllo World!','blue')
                }
                echo 'set -x'

            }
        }
    }

}