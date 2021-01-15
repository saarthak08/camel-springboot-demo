#! /bin/sh

cd api-gateway
./mvnw package

cd ..

cd bye-service
./mvnw package

cd ..

cd hello-service
./mvnw package
