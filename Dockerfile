FROM payara/server-full:latest
COPY target/jakartaee-mysql-tp-1.0.war $DEPLOY_DIR