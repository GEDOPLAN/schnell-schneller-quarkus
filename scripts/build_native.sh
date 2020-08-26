set -x
mvn package -Pnative -Dquarkus.native.container-build=true
docker build -f src/main/docker/Dockerfile.native -t gedoplan-showcase/ssq-quarkus-native .