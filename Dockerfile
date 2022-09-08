FROM adoptopenjdk/openjdk11:latest
ADD . /dmitriy
COPY build/libs/itRx-1.jar it.jar
#COPY docker/init.sql /docker-entrypoint-initdb.d/
ENTRYPOINT ["java","-jar","/it.jar"]
RUN ["apt-get", "update"]
RUN ["apt-get", "install", "-y", "vim"]
