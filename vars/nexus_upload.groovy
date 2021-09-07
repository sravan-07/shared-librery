def()
{
 nexusArtifactUploader artifacts: [[artifactId: 'jb-hello-world-maven', classifier: '', file: 'target/jb-hello-world-maven-0.1.0.jar', type: 'jar']], credentialsId: 'Nexus-ID', groupId: 'org.springframework', nexusUrl: '192.168.87.128:8082', nexusVersion: 'nexus3', protocol: 'http', repository: 'maven-releases', version: '0.1.0' 
}
