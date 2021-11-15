clear
cd HealthSystem
printf "Compilando ...\n"
javac -d build/classes src/healthsystem/*.java
if [ $? == 0 ]
then
  clear
  java -cp build/classes healthsystem.Healthsystem
else
  printf "\n\n\nError - Exit code $?"
fi
