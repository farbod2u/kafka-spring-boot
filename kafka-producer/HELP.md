# Getting Started

## To Run:
* zookeeper-server-start.sh  ~/JAVA/kafka/kafka_2.12-3.0.0/config/zookeeper.properties
* kafka-server-start.sh ~/JAVA/kafka/kafka_2.12-3.0.0/config/server.properties
* kafka-topics.sh --create --replication-factor 1 --partitions 1 --topic KafkaSample --bootstrap-server localhost:9092
* kafka-console-consumer.sh  --topic KafkaSample --bootstrap-server localhost:9092 --from-beginning

