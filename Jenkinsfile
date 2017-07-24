stage 'build'
node {
     git 'https://github.com/ciandcd/simple-maven-project-with-tests.git'
     withEnv(["PATH+MAVEN=${tool 'Maven3'}/bin"]) {
          sh "mvn clean package -Dmaven.test.skip=true"
     }
     stash excludes: 'target/', includes: '**', name: 'source'
}
