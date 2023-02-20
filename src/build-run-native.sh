#!/bin/bash
javac StaticTime.java
native-image --initialize-at-build-time=StaticTime StaticTime -H:+ReportExceptionStackTraces
for ((i=0; i<=10; i++)); do
    ./StaticTime;
  done