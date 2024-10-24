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
                script {
                    colorize('HEllo World!','red')
                    colorize('HEllo World!','green')
                    colorize('HEllo World!','blue')
                    colorize('HEllo World!','yellow')
                }
            }
        }
    }

}