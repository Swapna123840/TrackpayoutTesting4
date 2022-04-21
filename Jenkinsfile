pipeline{
  agent any
  
  stages{
    stage("run frontend")
    {
    steps{
      echo 'Executing yarn....'
      nodejs('Node-14-17')
      {
        bat 'yarn install'
      }
    }
    }
      stage("run backend"){
        steps{
              echo 'Executing gradle.......'
          withGradle(){
            bat 'gradlew.bat'
        }
      }
  }
}
}
