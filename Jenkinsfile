node {
     stage('Checkout'){
     	git([url: 'https://github.com/haosimentu/simple-maven-project-with-tests.git',branch: 'master'])
     }
     
     stage('Build'){
	     withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
	          sh "mvn clean package"
	     }
	 }

     stage('Test'){
     	junit 'target/surefire-reports/**/*.xml'
     }
     
     stage('Image'){
     	docker.build("mytest/docker-jenkins-pipeline-test:${env.BUILD_NUMBER}")
     }
     
     
}
