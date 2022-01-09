# Insights Server
Java spring boot application which publishes the list of problems and the solutions for them. Problems have external links(geeksforgeeks, interview, leetcode etc)
and can be tagged with specific areas to which it belongs- arrays, bst etc for instance.

# Docker instructions
Dockerfile is used by docker to build latest image. 
The command to build image is:

<B>docker image build -t insights_server:0.0.1-SNAPSHOT.</B>

In Dockerfile, below command is used to copy settings.xml from project to docker image: 

<B>RUN mkdir -p /root/.m2 \\
    && mkdir /root/.m2/repository </B>
    
 Copy maven settings, containing repository configurations
 
<B>COPY settings.xml /root/.m2 </B>

Command to run the container:

<B>docker container run insights_server:0.0.1-SNAPSHOT</B>
