Jenkins CI/CD Project For Demo 🚀

This project demonstrates a simple CI/CD pipeline using Jenkins, GitHub, Maven, and Tomcat to automate the build and deployment of a Java .war file.
##  Project Overview

    Application Type: Java Web Application (WAR file)
    Build Tool: Maven
    CI/CD Tool: Jenkins
    Deployment Server: Apache Tomcat (Test + Prod)
    Version Control: Git & GitHub


## Setup Details
--> Environment

    Jenkins VM → 192.168.31.187
    Tomcat Test Server → 192.168.31.47
    Tomcat Prod Server → 192.168.31.75
    GitHub Repo → jenkins-demo-projects

--> Step-by-Step explanation of what i have done

    1. Created GitHub Repo
        https://github.com/master-ankitt/jenkins-demo-projects

    2. Set Up Jenkins on a Fresh VM
        Installed Jenkins manually (not using EC2).
        Installed necessary Jenkins plugins: Git client, Git server, Build Pipeline, Copy Artifact, Maven Integration, Deploy to container, etc.

    --> Configured Jenkins
         Created a new pipeline job.
         Connected to the GitHub repository.
         Used Poll SCM to check for code changes every 15 minutes.

    --> Set Up Apache Tomcat on Another VM
         Downloaded and configured Tomcat server on 192.168.31.47 as test server and 192.168.31.75 as Prod server.
         Configured Tomcat users and allowed deployment via Jenkins.

   -->  Created Jenkins Pipeline (**/*.war file)

        Pipeline stages: Build, Test, Deploy to test and then Deploy to Prod as manual build on prod server.
        Built WAR using mvn package.
        Deployed WAR file to the Tomcat server using Deploy to Container plugin.

   -->  Tested the CI/CD Workflow
         Made a code change and pushed to GitHub.
         Jenkins job triggered automatically via SCM polling.
         WAR file built and deployed successfully to Tomcat server.
         Verified output on browser: http://192.168.31.47:8080/app  ( Test server ) and http://192.168.31.47:8080/app ( Prod server )

## How to Test

 --> Clone the repo:
      -> git clone https://github.com/master-ankitt/jenkins-demo-projects.git Modify the code.

--> Commit and push changes:
      -> git add . 
      -> git commit -m "Test change" 
      -> git push origin main

--> Jenkins will poll the repo and trigger the build.

--> Check the deployed app: 
        http://192.168.31.47:8080/app [ Test Server ]
        http://192.168.31.75:8080/app [ Prod Server ]

##  Useful Links

--> Jenkins Dashboard: http://192.168.31.187:8080

--> Deployed App: http://192.168.31.47:8080/app [ Test Server ]
                  http://192.168.31.75:8080/app [ Prod Server ]

--> GitHub Repo: https://github.com/master-ankitt/jenkins-demo-projects/

## Technologies Used

--> Git & GitHub 
--> Jenkins 
--> Maven 
--> Apache Tomcat 
--> Shell Scripting and Java (basic) 
--> WAR Deployment


# Author: Ankit Choudhary  DevOps Enthusiast | Always exploring new tools & technologies in the DevOps ecosystem | Solving real-world problems through **hands-on troubleshooting** .