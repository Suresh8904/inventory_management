#!/bin/sh
DOCKER_DEFAULT_PLATFORM="linux/amd64" docker build -t inventory-management .
docker tag inventory-management sureshk89/inventory-management:1.0.0
docker push sureshk89/inventory-management:1.0.0
kubectl apply -f deployment.yaml