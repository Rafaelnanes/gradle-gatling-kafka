#/bin/bash


kafka-topics --bootstrap-server localhost:29092 --create --topic Topic1 --partitions 1 --replication-factor 1
echo "topic Topic1 was create"