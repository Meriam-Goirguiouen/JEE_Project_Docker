FROM payara/server-full:latest
COPY target/jakartaee-mysql-tp-1.0.war $DEPLOY_DIR

COPY libs/mysql-connector-j-8.0.33.jar /opt/payara/appserver/glassfish/lib/
