#!/bin/sh
kill -9 ` ps -uax | grep java | grep DemoApplication | sed s/$USER" *"//g | sed s/" .*"//g `
