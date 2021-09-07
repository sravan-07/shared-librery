def call()
{
 nexusArtifactUploader artifacts: [[artifactId: "${artifact_id}", classifier: '', file: "${file_path}", type: "${type}"]], credentialsId: 'Nexus-ID', groupId: "${group_id}", nexusUrl: '192.168.87.128:8082', nexusVersion: 'nexus3', protocol: 'http', repository: 'maven-releases', version: "${version}" 
}
