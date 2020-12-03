#!/bin/sh
kill -9 ` ps -uax | grep java | grep Example06Application | sed s/$USER" *"//g | sed s/" .*"//g `
