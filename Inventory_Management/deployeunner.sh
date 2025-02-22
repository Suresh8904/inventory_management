#!/bin/sh
DOCKER_DEFAULT_PLATFORM="linux/amd64" docker build -t inventory_management .
docker tag inventory_management sureshk89/inventory_managemente:1.0.0
docker push sureshk89/inventory_management:1.0.0
kubectl apply -f deploy.yml