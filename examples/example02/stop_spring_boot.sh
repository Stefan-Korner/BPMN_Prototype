#!/bin/sh
kill -9 ` ps -uax | grep java | grep Example | sed s/$USER" *"//g | sed s/" .*"//g `
