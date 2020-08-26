set -x
mvn package
docker build -f src/main/docker/Dockerfile.jvm -t gedoplan-showcase/ssq-quarkus-jvm .