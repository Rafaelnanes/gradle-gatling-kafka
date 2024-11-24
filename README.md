# Commands

### Run docker compose

```console
docker compose up -d
```

### List topics using docker

```console
docker exec kafka-broker-1 kafka-topics --list --bootstrap-server kafka-broker-1:9092  
```

### Delete topic using docker

```console
docker exec kafka-broker-1 kafka-topics --delete --bootstrap-server kafka-broker-1:9092  --topic $topic
```

### Create topic using docker

```console
docker exec kafka-broker-1 kafka-topics --bootstrap-server kafka-broker-1:9092 --create --topic ExampleTopic --partitions 1 --replication-factor 1
```

## Pending

- [ ] Avro
- [ ] Authentication
- [ ] Configure multi module in gradle
- [ ] Make use of gatling


