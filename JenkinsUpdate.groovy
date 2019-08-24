node {
    stage("Pull Repo") {
        git "git@github.com:Nurjan87/packer_dev.git"
    }
    stage ("Build AMI"){
        sh "packer build updated/updated.json"
    }
}