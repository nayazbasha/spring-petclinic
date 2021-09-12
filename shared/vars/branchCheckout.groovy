def call(String branchName) {
    node {
        sh "echo ${branchName}"
        git url:'https://github.com/nayazbasha/spring-petclinic-1.git',
            branch: "${branchName}"
    }
}