# EXECUTE DOCKER MYSQL

 ````
docker build -t mysql_microservice_imagem_books -f DockerfileMySql .
````

````
docker run --name mysql_microservice_container_books -p 3306:3306 -d mysql_microservice_imagem_books
````