#! /bin/sh

# success or fail

cd /u01/ntrs/sb-sample/src/test/java/hello
cp HelloControllerTest.java_$1 HelloControllerTest.java
more HelloControllerTest.java &
