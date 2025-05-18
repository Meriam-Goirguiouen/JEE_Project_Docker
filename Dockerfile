FROM payara/server-full:latest 
COPY target/jakartaee-docker-tp-1.0-SNAPSHOT.war /opt/payara/deployments/
