#!/usr/bin/env python
import pika

# init connection to RabbitMQ
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
channel = connection.channel()

# declare durable queue, queue will be persistent and restart without losing message possible
channel.queue_declare(queue='durable-queue', durable=True)

channel.basic_publish(exchange='',
                      routing_key='durable-queue',
                      body='Hello World!',
                      properties=pika.BasicProperties(
                         delivery_mode = 2, # make message persistent
                      ))
					  
print(" [x] Sent 'Hello World!'")
connection.close()