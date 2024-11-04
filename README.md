# Prácticas de TDS

Este repositorio contiene los recursos para las prácticas de 
Tecnologías de Desarrollo de Software (TDS), 3º curso del Grado en Ingeniería Informática de la Universidad de Murcia.

## Transparencias y recursos de cada sesión

- **Sesión 1**: Java/Swing
  - [Boletín de prácticas](boletines/boletin-swing.md)
  - [Transparencias de Swing](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas%20-%20Grupo%201/Pr%C3%A1ctica%20de%20GUI%20-%20Swing/TDS-Swing-parte-1.pdf)
  - [Iconos](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas-1/Pr%C3%A1ctica%20de%20GUI%20-%20Swing/recursos%20G1/img.zip)

- **Sesión 2**: Java/Swing
  - Continuáremos con el material de la sesión 1, que ha sido ampliado para cubrir más elementos de Java/Swing.
  - [Boletín de prácticas](boletines/boletin-swing.md)
  - [Transparencias de Swing](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas%20-%20Grupo%201/Pr%C3%A1ctica%20de%20GUI%20-%20Swing/TDS-Swing-parte-1.pdf)
  - [Iconos](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas-1/Pr%C3%A1ctica%20de%20GUI%20-%20Swing/recursos%20G1/img.zip)

- **Sesión 3**: Taller de requisitos software
  - [Ejercicios](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas/Pr%C3%A1ctica%202.%20Requisitos%20y%20Clases%20del%20Dominio/TDS-AppMusic-2023-v1.pdf)
  - [Resumen de historias de usuario identificadas](boletines/historias-usuario.md)

- **Sesión 4**: Taller de modelado de clases
  - [Ejercicios](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas/Pr%C3%A1ctica%202.%20Requisitos%20y%20Clases%20del%20Dominio/TDS-ModeladoClases-2024.pdf)
  - [Herramienta para dibujar diagramas - UMLet](https://umletino.com/)  
  - [Herramienta para dibujar diagramas - Draw.io](https://draw.io/)
  - [Herramienta UML gráfica - Astah](https://astah.net/downloads/)
  - [Herramienta UML textual - Mermaid](https://mermaid.live). [Documentación](https://mermaid.js.org/syntax/classDiagram.html) 

- **Sesión 5**: Java/Swing III (JList con _renderers_ y eventos)
  - [Transparencias de Swing](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas%20-%20Grupo%201/Pr%C3%A1ctica%20de%20GUI%20-%20Swing/TDS-Swing-parte-2.pdf)
  - [Boletín de prácticas](boletines/boletin-swing.md)
  

- **Sesión 6**: Maven
  - [Transparencias](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas/Pr%C3%A1ctica%20Maven/TDS-Maven-Presentacion.pdf)
  - [Boletin](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas/Pr%C3%A1ctica%20Maven/TDS-Maven-Guion.pdf)
  - Instalación de la librería con la ventana de chat
    - Descargar el fichero jar de [aquí](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Caso%20pr%C3%A1ctico%20-%20AppChat/chatWindowLib.jar)
    - Instalar el jar en el repositorio local de Maven: `mvn install:install-file -Dfile=chatWindowLib.jar -DgroupId=tds -DartifactId=chat-window -Dversion="1.0.0" -Dpackaging=jar -DgeneratePom=true`
	- Usar la siguiente dependencia en el POM del proyecto:
	```xml
		<dependency>
			<groupId>tds</groupId>
			<artifactId>chat-window</artifactId>
			<version>1.0.0</version>
		</dependency>
	```
  - [Uso de la librería de chat](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Caso%20pr%C3%A1ctico%20-%20AppChat/Uso%20de%20una%20librer%C3%ADa%20de%20chat%20en%20Swing.pdf)
  - [Ejemplo completo de Maven](ejemplos/prueba-chat/)
  - Si no funcionan los enlaces, descargarlos de [aquí](av/)

- **Sesión 7**: Git
  - [Transparencias](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas%20-%20Grupo%201/Pr%C3%A1ctica%204%20-%20Git/TDS-Git-Presentacion-2024.pdf)
  - [Generar clave RSA (Eclipse)](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas%20-%20Grupo%201/Pr%C3%A1ctica%204%20-%20Git/GitHub-Privado-SSH.pdf)
  - Generar clave RSA (Linux):
    ```bash
    ssh-keygen -o -t rsa -C "tu@email.com"
    # La clave pública está en /home/tu/.ssh/id_rsa.pub.
	# Hay que copiarla en GitHub, `Account settings -> SSH Keys`
    ``` 
  - [Tutorial y ejemplos de uso en Eclipse](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas/Pr%C3%A1ctica%202.%20Git/TDS-Git-Gui%C3%B3n.pdf)
  - [Tutorial detallado de Git (Vogella)](https://www.vogella.com/tutorials/Git/article.html)
  
 - **Sesión 8**: Persistencia
   - [Transparencias (Grupo 1)](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas%20-%20Grupo%201/Pr%C3%A1ctica%205%20-%20Arquitectura/GuiaCasoPractico-2024-Grupo%201.pdf)
   - [Transparencias (Grupo 3)](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas/Pr%C3%A1ctica%204.%20Arquitectura%20y%20Servidor%20de%20Persistencia/TDS-GuiaDesarrolloCasoPractico-2022.pdf)
   - [Ejemplo TiendaTPV (Grupo 1)](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas%20-%20Grupo%201/Pr%C3%A1ctica%205%20-%20Arquitectura/TiendaTPV.zip)
   - [Ejemplo TiendaTPV (Grupo 3)](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas/Pr%C3%A1ctica%204.%20Arquitectura%20y%20Servidor%20de%20Persistencia/TiendaTPV.zip)
   - [Ejemplo login (Grupo 1)](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas%20-%20Grupo%201/Pr%C3%A1ctica%205%20-%20Arquitectura/login-2024.zip)
   - [Ejemplo login (Grupo 3)](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Pr%C3%A1cticas/Pr%C3%A1ctica%204.%20Arquitectura%20y%20Servidor%20de%20Persistencia/login-2022.zip)
   - Instalación del servicio de persistencia
     - Descargar la [librería para el driver de persistencia](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Caso%20pr%C3%A1ctico%20-%20AppChat/Caso%20pr%C3%A1ctico/DriverPersistenciaMaven.zip)
     - Descomprimirla
     - Instalar la librería en el repositorio local de Maven
     
       ```bash
          mvn install:install-file -Dfile=DriverPersistencia.jar -DpomFile=driverPersistencia-2.0.pom
       ```
     - [Servidor de persistencia](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Caso%20pr%C3%A1ctico%20-%20AppChat/Caso%20pr%C3%A1ctico/Servicio%20de%20Persistencia/ServidorPersistenciaH2.zip)
       - Descomprimir
       - Ejecutar con `java -jar ServidorPersistenciaH2.jar`
     - [Manual del servicio de persistencia](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Caso%20pr%C3%A1ctico%20-%20AppChat/Caso%20pr%C3%A1ctico/Servicio%20de%20Persistencia/GuiaServicioPersistencia-2021.pdf)

## Caso práctico
El caso práctico que debe resolverse consiste en implementar una aplicación de chat con Java/Swing.

- [Enunciado](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Caso%20pr%C3%A1ctico%20-%20AppChat/TDS-AppChat-v1.0.1.pdf)
