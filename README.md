# Kubernetes Wordsmith Demo

Wordsmith is the demo project shown at DockerCon EU 2017, where Docker announced that support for Kubernetes was coming
to the Docker platform.

The demo app runs across three containers:

- [db](db/Dockerfile) - a Postgres database which stores words

- [words](api/Dockerfile) - a Java REST API which serves words read from the database

- [web](web/Dockerfile) - a Go web application which calls the API and builds words into sentences:

## Build

The only requirement to build and run the app from source is Docker. Clone this repo and use Docker Compose to build all
the images:

## Deploy Using a Docker Manifest
Now apply the manifest using `docker-compose`:


```
cd k8s-wordsmith-demo

docker-compose build
```

> Or you can pull pre-built images from Docker Hub using `docker-compose pull`.

## Deploy Using a Kubernetes Manifest

Now apply the manifest using `kubectl`:

```
kubectl apply -k kubernetes
```

Now browse to http://127.0.0.1:8090, and you will see the same site.
