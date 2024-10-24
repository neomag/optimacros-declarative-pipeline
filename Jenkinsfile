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
        stage('Make HTTP Request') {
            steps {
                script {
                    def response = httpRequest(
                        url: 'https://2ip.ru',
                        httpMode: 'GET',
                        contentType: 'APPLICATION_JSON',
                        acceptType: 'APPLICATION_JSON'
                    )
                    
                    echo "Response status: ${response.status}"
                    echo "Response body: ${response.content}"
                }
            }
        }
    }

}