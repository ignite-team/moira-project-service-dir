#Proceso Inicio Sonarqube

*2021/05/14 by Ozona - developer reference guide*

##1. Instalación de SonarQube
Los pasos a seguir son: 

- Descargar SonarQube.

- Descomprimimos el archivo y comporbamos la ruta adecuada al sistema operativo que vamos a utilizar para desplegar SonarQube.

- Entramos en la carpeta bin
    - Para windows 64 entramos en windows-x86-64	 
    - Para windows 32 entramos en windows-x86-32
	
- A continuación configuramos las variables de entorno. 

- Editamos la variable Path, del sistema o del usuario para crear una nueva.

- Obtenemos la dirección donde está alojado nuestro SonarQube. 

- La nueva variable llevará la anterior dirección. 

- Acto seguido entramos en CMD de Windows. 

- Iniciamos SonarQube dirigiendonos a la carpeta de windows correspondiente y ejecutamos startsonar.bat

- Una vez lanzado, podremos acudir la dirección http://localhost:9000 para ver como se ha inicializado

- Una vez dentro realizaremos loginn con el usuario y contraseña predefinidos. usuario: admin. contraseña: admin. 

Notas: Se puede cambiar el puerto en sonar.properties que se encuentra en la carpeta conf de la carpeta sonarqube que hayamos descomprimido. 

##2. Proyecto Maven en Eclipse
###2.1 Configuramos el archivo pom.xml
Deberemos asegurarnos de que el bloque Properties contiene la configuración de SonarQube necesaria para poder hacer uso de todas sus funcionalidades y definir el lenguaje que va analizar. 

El properties sería: 

~~~
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <sonar.core.codeCoveragePlugin>jacoco</sonar.core.codeCoveragePlugin>
    <sonar.jacoco.reportPath>${project.basedir}/../target/jacoco.exec</sonar.jacoco.reportPath>
    <sonar.language>java</sonar.language>
  </properties>
~~~

En dependencies, debemos asegurarnos de tener la última versión estable de JUnit. 

En build: 

``` <build>
   <plugins>
       <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.18.1</version>
       </plugin>
       <plugin>
          <groupId>org.jacoco</groupId>
          <artifactId>jacoco-maven-plugin</artifactId>
          <version>0.7.9</version>
          <executions>
          <execution>
             <goals>
                     <goal>prepare-agent</goal>
             </goals>
              </execution>
         </executions>
         <configuration>
         <destFile>${sonar.jacoco.reportPath}</destFile>
         </configuration>
       </plugin>
  </plugins>
</build> 
```

A continuación haremos un updateMaven del proyecto. 

###2.2 Ejecución de Maven
Realizamos una ejecución de proyecto personalizada. 

En este se hará un maven clean, maven install y se lanzará sonar:sonar. 

En Run configurations creamos una ejecución definiendo el workspace sobre el qeu trabajamos como directorio base. En el apartado goals incluiremos los comandos escribiendo: "clean install sonar:sonar". 

A continuación le damos a Apply y a Run para desplegar la aplicación. El servidor SOnar deberá estar corriendo en localhost:9000. 

