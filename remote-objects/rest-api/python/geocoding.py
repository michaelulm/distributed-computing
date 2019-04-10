import requests
import json

# Request
# TODO replace your api key
request = requests.get('https://api.opencagedata.com/geocode/v1/json?q=Kapfenberg&key=<your-key>')

# Response
response = request.json()

# raw output
#print(response)	

# pretty output
print( json.dumps(response, indent=2) )