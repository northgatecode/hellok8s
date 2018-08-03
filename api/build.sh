#!/bin/sh
echo "build.sh The time is $(date)."
ls -lh
cd /workspace/api
ls -lh
chmod +x mvnw
./mvnw clean package
ls -lh