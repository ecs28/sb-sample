#!/bin/sh
set +x
cd sb-sample/
sh gradlew --no-daemon clean build
mkdir -p ../dist
cd ..
mv sb-sample/build/libs/* ./dist/
ls ./dist/
