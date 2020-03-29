pipeline {
    agent any
    tools {
        maven '3.6.3'
        jdk 'jdk1.8.0_20'
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