pipeline {
    agent any

    stages {
        stage('Pull Github Repo') {
            steps {
                git credentialsId: 'git-credss', url: 'https://github.com/TusharSNagpal/SPE-Mini-Project.git'
            }
        }
        stage('MVN'){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('Docker Image'){
            steps{
                script{
                    sh 'docker build -t tusharsnagpal/scientific_cal:latest .'
                }
            }
        }
        stage('Docker Login and Build'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'docker-auth', variable: 'dockerhubcreds')]) {
                        sh 'docker login -u tusharsnagpal -p ${dockerhubcreds}'
                        sh 'docker push tusharsnagpal/scientific_cal:latest'
                    }
                }
            }
        }
        stage('Ansible'){
            steps{
                ansiblePlaybook becomeUser: null, installation: 'Ansible', inventory: 'inventory', playbook: 'deploy-playbook.yml', sudoUser: 'null'
            }
        }
    }
}

