#!/bin/sh

export JRE=@environment.jrePath@
export LLM_HOME=@environment.llmHome@
export LD_LIBRARY_PATH=$LLM_HOME/lib64
export MEM_PARAMS="@environment.app.memParams@"
export GC_PARAMS="@environment.app.gcParams@"
export DEBUG_PORT="@environment.app.debugPort@"
export JMX_PORT="@environment.app.jmxPort@"
export SERVER_ADDRESS="@environment.server.address@"
export JMX_PARAMS="-Dcom.sun.management.jmxremote.port=$JMX_PORT -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=$SERVER_ADDRESS"
export DEBUG_PARAMS="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=$DEBUG_PORT"
export PROCESS_NAME="@environment.app.processName@"
export APP_HOME="@environment.app.paths.home@"
export APP_LIB="$APP_HOME/@version@/lib"
export APP_CONFIG_PATH="$APP_HOME/@version@"
export APP_CLASSPATH="$APP_HOME/@version@"
export LOG_PATH="@environment.app.paths.log@"
export ENCODING="@environment.app.encoding@"
for i in `ls -ltrh $APP_LIB | awk -F' ' '{print $9}'`
do
	APP_CLASSPATH=$APP_CLASSPATH:$APP_LIB/$i;
done
export APP_CLASSPATH=$APP_CLASSPATH