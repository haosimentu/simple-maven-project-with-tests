node {
     stage 'Checkout'
     git([url: 'https://github.com/ciandcd/simple-maven-project-with-tests.git'])
     
     stage 'Build'
     withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
          sh "mvn clean package"
     }

     stage 'Test'
     junit 'target/surefire-reports/**/*.xml'
}
