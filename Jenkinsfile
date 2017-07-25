node 
{
	// Setup the Docker Registry (Docker Hub) + Credentials 
	registry_url = "https://index.docker.io/v1/" // Docker Hub
	docker_creds_id = "name-DockerHub" // name of the Jenkins Credentials ID
	build_tag = "testing" // default tag to push for to the registry
	registry_host_port="192.168.17.140:5000"
	
	stage('Checkout')
	{
	 	git([url: 'https://github.com/haosimentu/simple-maven-project-with-tests.git',branch: 'master'])
	}
	 
	stage('Build')
	{
	     withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
	          sh "mvn clean package"
	     }
	}
	 
	stage('Testing')
	{
	 	junit 'target/surefire-reports/**/*.xml'
	}
	 
	stage('build Image')
	{
	 	container = docker.build("${registry_host_port}/mytest/docker-jenkins-pipeline-test:${env.BUILD_NUMBER}",'.')
	}
	
	stage('Pushing image to registry')
 	{
 		container.push()
 	}
	 	
	stage('approve')
	{
		timeout(time: 5, unit: 'MINUTES') {
		     input message: 'Do you want to deploy?', submitter: 'ops'
		}
	}
	
	post { 
	    always { 
	        echo 'I will always say Hello again!'
	    }
	}
}
