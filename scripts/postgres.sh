set -x
docker run -d --rm -p 5432:5432  -e POSTGRES_DB=showcase -e POSTGRES_USER=showcase -e POSTGRES_PASSWORD=showcase --name postgres postgres:11.4