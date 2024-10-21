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

## Caso práctico
El caso práctico que debe resolverse consiste en implementar una aplicación de chat con Java/Swing.

- [Enunciado](https://aulavirtual.um.es/access/content/group/1905_G_2024_N_N/Caso%20pr%C3%A1ctico%20-%20AppChat/TDS-AppChat-v1.0.1.pdf)
