#!/bin/sh
kill -9 ` ps -uax | grep java | grep Example05Application | sed s/$USER" *"//g | sed s/" .*"//g `
