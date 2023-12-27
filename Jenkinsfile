pipeline{
    agent any

    stages{

        stage("pull"){

            steps{
                checkout scm
            }
        }
         stage("build"){
            steps{
                  bat ' ./mvnw  clean install'
            }
         }
        stage("package"){
            steps{
                 bat './mvnw clean package'
            }
            post{
                success{
                    archiveArtifacts 'target/*.war'
                }

            }
        }
        stage('Deploy'){
             steps {
             deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://localhost:8082')], contextPath: null, war: 'target/*.war'

             }
        }

    }



}