pipeline {
    agent any
    tools {
        maven 'MAVEN 3.6'
        jdk 'JAVA_HOME'
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