#!/usr/bin/env python
import pika

# init connection to RabbitMQ
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
channel = connection.channel()

# declare durable queue, queue will be persistent and restart without losing message possible
channel.queue_declare(queue='durable-queue', durable=True)

def callback(ch, method, properties, body):
	print(" [x] Received %r" % body)

# only fetch specific count of message, otherwise all possible messages will be fetched before processing them
channel.basic_qos(prefetch_count=1)

channel.basic_consume(queue='durable-queue',
				  auto_ack=True,
				  on_message_callback=callback)
				  
print(' [*] Waiting for messages. To exit press CTRL+C')
channel.start_consuming()