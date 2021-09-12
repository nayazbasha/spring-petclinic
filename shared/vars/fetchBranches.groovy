def call(String branchName) {
    node {
        sh '''
        git branch -r | grep -ve '->' | cut -d/ -f2 > branch.txt;
        cat branch.txt
        '''
    }
