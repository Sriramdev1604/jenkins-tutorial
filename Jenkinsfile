pipeline{
    agent any
    tools{
        jdk 'JAVA_HOME'
    }
    environment{
        DOCKER_IMAGE='spring-application-pipe'
        CONTAINER_NAME='spring-container-demo'
    }
    stages{
        stage('git clone'){
           steps{
                git branch: 'main', credentialsId: 'freestyle_job', url: 'https://github.com/Sriramdev1604/jenkins-tutorial.git'
           }
        }
        
        stage('list files'){
            steps{
                sh 'ls'
            }
        }
        
        stage('maven test'){
            when{
                expression{
                    ENVIRONMENT=='testing'
                }
            }
            steps{
                sh 'mvn test'
            }
        }
        stage('maven build'){
            steps{
                sh 'mvn clean install -DskipTests=true'
            }
        }
        stage('docker image'){
            steps{
                sh 'docker build -t $DOCKER_IMAGE:$BUILD_NUMBER .'
            }
        }
        stage('docker remove exist container'){
            steps{
                sh 'docker rm -f $CONTAINER_NAME || true'
            }
        }
        stage('docker build container'){
            steps{
                sh 'docker run -d -p 8000:5000 --name=$CONTAINER_NAME $DOCKER_IMAGE:$BUILD_NUMBER'
            }
        }
       
    }
    
}
