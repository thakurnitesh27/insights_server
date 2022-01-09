FROM junhanlin/ubuntu-git-java-maven

RUN apt-get update
VOLUME /tmp

#RUN git clone https://github.com/alexturcot/sample-spring-boot-data-jpa-embedded.git
#RUN  ${M2_HOME}
RUN mkdir -p /root/.m2 \
    && mkdir /root/.m2/repository
# Copy maven settings, containing repository configurations
COPY settings.xml /root/.m2
#COPY settings.xml ${M2_HOME}/conf/settings.xml
RUN git clone https://github.com/thakurnitesh27/insights_server.git
WORKDIR insights_server
RUN mvn clean package

WORKDIR target
RUN mv *.jar app.jar

ENTRYPOINT ["java","-jar","/insights_server/target/app.jar"]
