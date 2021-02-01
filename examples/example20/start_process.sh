#!/bin/sh
curl -X POST localhost:8080/engine-rest/process-definition/key/demo_process_id/start -H 'Content-type:application/json' -d '{}'

