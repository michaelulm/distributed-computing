import requests
import json

# Request
# TODO replace your api key
request = requests.get('https://api.openweathermap.org/data/2.5/weather?q=Kapfenberg&units=metric&APPID=<your-key>')

# Response
response = request.json()

# raw output
#print(response)	

# pretty output
print( json.dumps(response, indent=2) )
print( "Current temperature: {}°C".format( response["main"]["temp"] ) )