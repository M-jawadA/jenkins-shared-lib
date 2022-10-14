#!/usr/bin/env groovy

package com.example
class Docker implements Serializable {
    def script
    Docker(script){
        this.script=script
    }
    def dockerBuild(){
        script.echo "building the docker image.."
//    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
//        sh 'docker build -t nanajanashia/demo-app:jma-2.0 .'
//        sh "echo $PASS | docker login -u $USER --password-stdin"
//        sh 'docker push nanajanashia/demo-app:jma-2.0'
//    }
    }
    def dockerLogin(){
        script.echo "login to docker huBB"
    }
    def dockerPush(String imageName){
        script.echo "building the docker image...$imageName"
    }
}