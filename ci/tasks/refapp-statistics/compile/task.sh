#!/bin/sh

mkdir -p refapp-statistics-java-release
cd refapp-statistics-java

mvn package
cp target/*.jar ../refapp-statistics-java-release/

cd ../refapp-statistics-java-release
tar -zcvf refapp-statistics-java.tar.gz *.jar
ls -al
