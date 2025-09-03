# portfolio-api

This is a portfolio API using java SpringBoot that uses modern coding style and useful knowledge.

**Author**:[@AlexandreSJ](https://github.com/AlexandreSJ)
<br>
Made with their help:
<br>- [@murilao1](https://github.com/murilao1)
<br>- [@wendellnd](https://github.com/wendellnd)

---

## Build

Select the service from docker compose and build:
<br>
Example with `--profile dev`:

```shell
# Remove db container and volumes
sudo docker rm -f postgres_db
sudo docker compose down -v
# Build image and run
sudo docker build . -t aelxand/repo:portfolio-api 
sudo docker compose --profile dev up -d
sudo docker compose logs -f dev
```

## Secret
Create a file named ".env" having the postgres configurations.

Here's a sample:

```properties
POSTGRES_HOST=postgres
POSTGRES_PORT=5432
POSTGRES_DB=portfolio-api-db
POSTGRES_USER=postgres
POSTGRES_PASSWORD=my-pass
```
