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
      
      stage("run backend"){
        steps{
              echo 'Executing gradle.......'
            bat './gradlew -v'
        }
      }
  }
}
