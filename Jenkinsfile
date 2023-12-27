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
                    deploy adapters: [tomcat9( url : 'http://localhost:8080/' ,  credentialsId: 'tomcat-cred', path: '/manager/text' )],
                    war: 'D:/main/demo/target/demo-0.0.1-SNAPSHOT.war'
             }
        }

    }



}