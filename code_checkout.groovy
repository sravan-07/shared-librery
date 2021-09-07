def call()
{
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/jabedhasan21/java-hello-world-with-maven.git']]])
    
}
