node {
    def app

    stage('Clone repository from Github') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout scm
    }

    stage('Build image using the latest code') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */

        app = docker.build("45787548/phpapp")
    }

    stage('Push image to DockerHub') {
        /* Finally, we'll push the image with two tags:
         * First, the incremental build number from Jenkins
         * Second, the 'latest' tag.
         * Pushing multiple tags is cheap, as all the layers are reused. */
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
    }
}
