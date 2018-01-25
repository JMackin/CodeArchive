#!/bin/bash
set -ex
sleep 30
if service ssh status | grep -q "(running)" 
then
  echo "ssh true"
  service ssh stop
else
  echo "ssh false"
fi

