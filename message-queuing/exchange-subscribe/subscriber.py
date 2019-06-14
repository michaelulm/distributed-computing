#!/usr/bin/env python
import pika

# init connection to RabbitMQ
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
channel = connection.channel()

# declare exchange
channel.exchange_declare(exchange='logs', exchange_type='fanout')

# exclusive queue will be deleted after usage and can only be used by one connection
result = channel.queue_declare(queue='', exclusive=True)
queue_name = result.method.queue

# bind queue to exchange, to receive messages, by fanout exchange all queues will receive message
channel.queue_bind(exchange='logs', queue=queue_name)

def callback(ch, method, properties, body):
	print(" [x] %r" % body)

# only fetch specific count of message, otherwise all possible messages will be fetched before processing them
channel.basic_qos(prefetch_count=1)

channel.basic_consume(queue=queue_name,
				  auto_ack=True,
				  on_message_callback=callback)
				  
print(' [*] Waiting for messages. To exit press CTRL+C')
channel.start_consuming()