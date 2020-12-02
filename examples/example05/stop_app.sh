#!/bin/sh
kill -9 ` ps -uax | grep java | grep SNAPSHOT | sed s/$USER" *"//g | sed s/" .*"//g `
