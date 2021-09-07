def call()
{
  sh "curl http://192.168.87.128:8082/repository/maven-releases/${group_id}/${artifact_id}/${version}/${artifact_id}-${version}.${type} -o ${artifact_id}-${version}.${type}"
  sshPublisher(publishers: [sshPublisherDesc(configName: 'test-tomcat', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: 'sparkjava-hello-world-1.3.war')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
}
