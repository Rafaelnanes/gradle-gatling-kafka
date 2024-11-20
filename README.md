# Commands

### run docker compose

```console
docker compose -f docker-compose.yml up -d
```

### create topic interactive

```console
docker exec -it $MY_CONTAINER kafka-topics --bootstrap-server $KAFKA_HOST --create --topic $TOPIC_NAME --partitions 1 --replication-factor 1
docker exec -it 595774f2ab35 kafka-topics --bootstrap-server localhost:29092 --create --topic topic1 --partitions 1 --replication-factor 1
```

