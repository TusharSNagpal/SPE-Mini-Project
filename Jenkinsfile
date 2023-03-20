pipeline {
    environment{
        imageName = ""
    }
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
                    imageName = docker.build 'tusharsnagpal/scientific_cal:latest'
                }
            }
        }
        stage('Docker Login and Build'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'docker-auth', variable: 'check')]) {
                        sh 'docker login -u tusharsnagpal -p ${docker-auth}'
                        imageName.push()
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