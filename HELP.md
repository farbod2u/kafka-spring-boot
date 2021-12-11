# Getting Started


## To Run:
* zookeeper-server-start.sh  ~/JAVA/kafka/kafka_2.12-3.0.0/config/zookeeper.properties
* kafka-server-start.sh ~/JAVA/kafka/kafka_2.12-3.0.0/config/server.properties
* kafka-topics.sh --create --replication-factor 1 --partitions 1 --topic KafkaSample --bootstrap-server localhost:9092
* kafka-console-consumer.sh  --topic KafkaSample --bootstrap-server localhost:9092 --from-begining

### Guides
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

