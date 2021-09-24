def call()
{
withSonarQubeEnv(credentialsId: 'sonar-id') {
  sh "whoami && sonar-scanner -Dsonar.projectKey=myproject -Dsonar.sources=src -Dsonar.java.binaries=target/classes"
	}
}
