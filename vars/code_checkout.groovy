def call()
{
  checkout([$class: 'GitSCM', branches: [[name: "${branch}"]], extensions: [], userRemoteConfigs: [[url: "${repo_host}"]]])
    
}
