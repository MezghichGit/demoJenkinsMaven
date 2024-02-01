pipeline {

  agent any

  tools {
    maven 'maven'
  }

  stages {
  
      // Récupération du code depuis github
      
    stage('Get from git project') {
      steps {
        git 'https://github.com/MezghichGit/mavenJunitProject'
      }
    }

    // Create a new .jar file

    stage('Create a new .jar') {

      steps {
        sh 'mvn clean install -DskipTests'
      }
    }
  }
}