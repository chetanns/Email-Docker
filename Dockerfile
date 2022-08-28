FROM adoptopenjdk/openjdk11:latest

WORKDIR App

COPY target/App .

#CMD ["./scripts/SendEmail.sh"]
