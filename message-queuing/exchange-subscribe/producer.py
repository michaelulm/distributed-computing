#!/usr/bin/env python
import pika, sys

# init connection to RabbitMQ
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
channel = connection.channel()

# declare exchange, publishing will happen to exchange, not directly to queue
channel.exchange_declare(exchange='logs', exchange_type='fanout')

message = ' '.join(sys.argv[1:]) or "info: Hello World!"

# sending messages to exchange, which has (dynamic) bindings which queues
channel.basic_publish(exchange='logs',
                      routing_key='',
                      body=message
                      )
					  
print(" [x] Sent %r" % message)

connection.close()