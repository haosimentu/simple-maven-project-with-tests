stage 'build'
node {
     git 'https://github.com/ciandcd/simple-maven-project-with-tests.git'
     withEnv(["PATH+MAVEN=${tool 'm3'}/bin"]) {
          sh "mvn -B –Dmaven.test.failure.ignore=true clean package -dmaven.test.skip=true"
     }
     stash excludes: 'target/', includes: '**', name: 'source'
}
