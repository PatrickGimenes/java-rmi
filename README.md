# java-rmi
Resolução da atividade sobre Java RMI

#Rodando localmente

Clone o projeto
```
  https://github.com/PatrickGimenes/java-rmi.git
```
Execute o rmiregistry

```
  rmiregistry 9013
```
Em outro terminal execute o servidor
```
  java -classpath ".;sqlite-jdbc-3.43.0.0.jar" ServidorRMI
```

Em outro terminal execute o cliente:
```
  java ClienteRMI
```

