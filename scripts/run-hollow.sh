#!/usr/bin/env bash
cd ..
mvn wildfly-swarm:package
java -jar ./target/demo-hollow-swarm.jar ./target/demo.war -s ./configuration/project-defaults-h2.yml