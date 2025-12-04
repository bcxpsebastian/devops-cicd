# Dogs of BettercallPaul

Simple Spring Boot app that serves a static website listing "good dogs" and an API at `/api/dogs`.

Build and run locally:

```bash
# build
mvn -B package

# run
java -jar target/dogs-0.0.1-SNAPSHOT.jar
```

Open http://localhost:8080 to see the site.

Build Docker image:

```bash
docker build -t dogs:latest .
docker run -p 8080:8080 dogs:latest
```
