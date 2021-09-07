def call()
{
  sh "curl http://192.168.87.128:8082/repository/maven-releases/${group_id}/${artifact_id}/${version}/${artifact_id}-${version}.${type}"
}
