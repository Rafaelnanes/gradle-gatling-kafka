# Commands

### run docker compose

```console
docker compose -f docker-compose.yml up -d
```

### run docker compose

```console
docker exec -it <kafka-container-id> /opt/kafka/bin/kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic my-topic
```

docker exec -it gradle-gatling-kafka-kafka-1 /opt/kafka/bin/kafka-topics.sh --create --zookeeper zookeeper:2181
--replication-factor 1 --partitions 1 --topic my-topic