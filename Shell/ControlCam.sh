#! /bin/bash

ADDR=0
STOP=0
CMD=0
DIR=0
PASS=0
PIC="2 packets transmitted, 2 packets received, 0.0% packet loss"
PSC="<p>Authentication was requested</p></body></html>"

read -p 'Enter Cam address..' ADDR
read -p 'Enter password..' PASS

PNG=$(ping $ADDR 56 2 | grep "0.0%")

if [ "$PNG" != "$PIC" ]; then
  echo "Wrong address"
  exit 1
fi

PSS=$(curl --user admin:$PASS http://$ADDR/ | grep "Authentication")


if [ "$PSS" == "$PSC" ]; then
  echo "Wrong password"
  exit 1
fi


echo "Press k to exit..."
while [ $STOP -ne 1 ]; do
  read -p '> ' CMD
  if [ $CMD == k ]; then
    STOP=1
  else
    case "$CMD" in
      w)
        DIR=1
        ;;
      s)
        DIR=7
        ;;
      d)
        DIR=5
        ;;
      a)
        DIR=3
        ;;
      h)
        DIR=4
        ;;
      e)
        DIR=2
        ;;
      q)
        DIR=0
        ;;
      z)
        DIR=6
        ;;
      x)
        DIR=8
        ;;
      *)
        echo "Not an Option"
        ;;
    esac

    curl --user admin:$PASS --data "PanSingleMoveDegree=5&TiltSingleMoveDegree=5&PanTiltSingleMove=$DIR" http://$ADDR/setControlPanTilt

  fi
done
