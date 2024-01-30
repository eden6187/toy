#!/bin/bash

REPOSITORY='/home/ubuntu/web_app/app'
cd ${REPOSITORY} || exit
sudo nohup java -jar ./toy-0.0.1-SNAPSHOT.jar 1>/dev/null 2>&1