#!/bin/sh

export CLASSPATH=/App/libs/*:/App/conf;

echo $CLASSPATH

java -cp $CLASSPATH com.example.email.SendEmail