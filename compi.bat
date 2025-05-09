echo off
cls
echo "Welcome to the Compiler jungle!"
set CLASSPATH=.;C:\Users\aaron\Desktop\Compiladores\antlr-4.13.2-complete.jar;%CLASSPATH%

doskey antlr4=java org.antlr.v4.Tool $*
doskey grun=java org.antlr.v4.gui.TestRig $*

echo on