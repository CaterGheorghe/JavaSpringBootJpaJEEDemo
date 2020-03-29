pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
        jdk 'jdk8'
    }

    stages {
        stage ('Compile Stage') {

            steps {
                //withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn clean compile'
                //}
            }
        }

        stage ('Testing Stage') {

            steps {
                //withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn test'
                //}
            }
        }


        stage ('Deployment Stage') {
            steps {
                //withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn deploy'
                //}
            }
        }
    }
}