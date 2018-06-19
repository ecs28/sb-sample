#!/bin/sh
set +x
cd sb-sample/
sh gradlew --no-daemon clean build
if [ $? -eq 0 ]
then
  mkdir -p ../dist
  cd ..
  mv sb-sample/build/libs/* ./dist/ 
   ls ./dist/
  exit 0
else
  echo "The script failed" >&2
  exit 1
fi

