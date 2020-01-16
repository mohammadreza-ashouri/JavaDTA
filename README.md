# JavaDTA - Dynamic Taint Tracker
JavaDTA is a Simple Dynamic Taint Analyzer for J2EE applications.
<br/><br/>

## Installation (Generate Agent and RT JAR)
* cd  *JavaDTA root directory*
* ./gradlew clean assemble
<br/><br/>

## Installation (Add Agent and RT JAR to Web Application)
Add following two Java options to application startup execution.
* -Xbootclasspath/p:*JavaDTA root directory*/*build/libs*/JavaDTA-rt-*.jar
* -javaagent:*JavaDTA root directory*/*build/libs*/JavaDTA-agent-*.jar
