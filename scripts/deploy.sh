#!/bin/bash

set -e

echo "Stopping Tomcat..."
/opt/tomcat/bin/shutdown.sh > /dev/null 2>&1 || true

echo "Backing up old deployment..."
if [ -f /opt/tomcat/webapps/employee-app.war ]; then
  sudo cp /opt/tomcat/webapps/employee-app.war \
          /opt/tomcat/webapps/employee-app.war.bak
else
  echo "No existing WAR found, skipping backup"
fi

echo "Cleaning old deployment..."
sudo rm -rf /opt/tomcat/webapps/employee-app*
sudo rm -f /opt/tomcat/webapps/employee-app.war

echo "Deploying new WAR..."
sudo cp /home/ubuntu/employee-app.war /opt/tomcat/webapps/

echo "Starting Tomcat..."
/opt/tomcat/bin/startup.sh > /dev/null 2>&1 || true

echo "Waiting for deployment..."
sleep 20

echo "Deployment completed."