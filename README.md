# Spring Boot APM Template with micrometer + influxDB + grafana

This is a spring boot project template which support sending instrumentation data to `influxDB` via micrometer. Included docker compose file sets up the environment required to test the integration.

Before starting the docker environment, Spring boot application must be built and docker image must be created. Use
```
> ./mvnw install dockerfile:build
```
to build the docker image. The image will tagged as `springio/gs-spring-boot-docker`.

To start the environment, use
```
> docker-compose up -d
```

Useful commands,
```
> docker-compose logs -f <container name>
```

## Environment

Grafana instance can be accessed via `http://localhost:3000`, username and password is set to `admin`, you may change that from the `docker-compose.yml`.

Spring boot API can be accessed via `http://localhost:8080`.

## Useful Links
- [Spring Documentation](https://spring.io/)
- [Micrometer Documentation](https://micrometer.io/docs/)
- [Grafana Documentation](https://grafana.com/docs/guides/getting_started/)
- [Grafana Docker Container](https://hub.docker.com/r/grafana/grafana)
- [InfluxDB Documentation](https://docs.influxdata.com/influxdb/)
- [InfluxDB Docker Container](https://hub.docker.com/_/influxdb)