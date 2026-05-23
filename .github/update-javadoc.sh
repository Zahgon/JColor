#!/usr/bin/env bash

mvn javadoc:javadoc
rm -rf docs
cp -R target/reports/apidocs docs
open docs/index.html