
# Prácticas de Java/Swing

En estás prácticas se cubrirán los contenidos necesarios para desarrollar interfaces gráficas en Java/Swing. Se pretende cubrir los elementos fundamentales de Swing, pero que sean suficientes para construir desde interfaces muy simples hasta interfaces algo más avanzadas y además poder seguir descubriendo la librería por uno mismo.

El boletín sirve como un guion para los contenidos que veremos en clase, aunque no abarca todo el material que se discutirá. Además, incluye ejemplos y ejercicios prácticos para probar en el entorno de programación y poder modificarlos. Es recomendable seguir el ritmo de las prácticas, completar los ejercicios propuestos y experimentar por tu cuenta para sacar el máximo provecho de las sesiones.

## Java/Swing básico

`Java Swing` es una biblioteca gráfica que forma parte de la plataforma Java y se utiliza para crear aplicaciones con interfaces gráficas de usuario (GUI). Swing se encuentra dentro de la biblioteca más amplia conocida como Java Foundation Classes (JFC) y ofrece un conjunto de componentes que permiten diseñar ventanas, botones, menús, cuadros de diálogo, entre otros elementos de una interfaz visual interactiva. A diferencia de su predecesor AWT (Abstract Window Toolkit), Swing es más flexible y robusto, ya que no depende de los recursos nativos del sistema operativo, sino que ofrece una implementación completamente en Java, lo que permite una apariencia y comportamiento consistente en todas las plataformas. De hecho, es posible cambiar el *look & feel* de una aplicación Java e instalar temas propios.

Los elementos básicos de Swing incluyen componentes como JFrame (ventana principal), JPanel (paneles de contenedor), JButton (botones), y JLabel (etiquetas), que son fundamentales para construir la interfaz. Para comenzar a utilizar Swing, es importante familiarizarse con la organización jerárquica de estos componentes, ya que cada interfaz gráfica se construye añadiendo y organizando componentes dentro de un contenedor principal.

### Primera ventana

A continuación se muestra el ejemplo más simple de aplicación Java/Swing. Es una clase principal donde se construye un objeto `JFrame` para 

```java
package tds.swing;

import javax.swing.JFrame;

public class HolaMundoSwing {

    public static void main(String[] args) {
        // se crea la ventana
        JFrame miFrame = new JFrame("Hola Mundo con Swing");
        // se establecen las dimensiones de la ventana
        miFrame.setSize(300,300);
        // la aplicación finaliza al cerrar la ventana
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // se hace visible la ventana
        miFrame.setVisible(true);
    }
}
```

Los métodos de la clase JFrame ofrecen funcionalidades para manejar 
la ventana, cambiando su aspecto estético o estableciendo su comportamiento
ante ciertos eventos.

#### Cuestiones

Explora los métodos de la clase `JFrame` y trata de realizar las siguientes tareas. Es buena idea ver la documentación de la clase o bien usar el autocompletado el editor para explorar los métodos disponibles.

- [ ] Cambiar la posición inicial
- [ ] Permitir que la ventana cambie de tamaño
- [ ] Añadir un icono personalizado a la ventana. Puedes buscar en sitios como [IconFinder](https://www.iconfinder.com/).

### Elementos básicos 

Una interfaz gráfica en Java Swing se compone de tres elementos clave que trabajan juntos para crear una experiencia interactiva: componentes, manejadores de disposición (layout managers) y eventos.

* ***Componentes*** contenidos en ***contenedores***: Los componentes son los elementos visuales que forman la interfaz, como botones, etiquetas, campos de texto, listas, etc. Estos componentes no se encuentran de forma independiente, sino que están organizados dentro de contenedores. Un contenedor puede ser una ventana principal (`JFrame`), un panel de organización (`JPanel`) o cualquier otro contenedor que agrupe componentes. Los contenedores sirven para organizar la interfaz y agrupar los componentes en diferentes secciones o áreas. 

  Es interesante observar que los `JPanel` además ser contenedores también son componentes y por tanto un contenedor puede contener otros contenedores (*patrón Composite*).

* ***Layout***: El layout de una interfaz gráfica especifica cómo se organizan y redimensionan los elementos de la interfaza. En Swing tenemos los `layout managers` que controlan cómo se distribuyen los componentes dentro de un contenedor. Existen diferentes tipos de layout managers, como `FlowLayout`, `BorderLayout` o `BoxLayout`. Dependiendo de cuál usemos los los componentes del contenedor se dispondrán de una otra forma.
Estos layout managers son esenciales para mantener una interfaz ordenada y adaptable, sin que sea necesario especificar manualmente las posiciones absolutas de los componentes.

* ***Eventos***: Los eventos son las interacciones que ocurren entre el usuario y la interfaz gráfica, como hacer clic en un botón, mover el ratón o escribir en un campo de texto. En Swing, el modelo de eventos permite que los componentes respondan a estas acciones mediante manejadores de eventos. Una manejador de eventos es un trozo de código que realiza una acción como respuesta a un evento. 

### Contenedores 

El siguiente ejemplo muestra cómo crear contenedores y anidarlos unos dentros de otros. La jerarquía de contenedores que se va a crear es la siguiente:

```
frame : JFrame
  + content pane (creado automáticamente por el JFrame)
    + contenedor1 : JPanel
      + contenedor2 : JPanel
      + contenedor3 : JPanel
```

En el código se utiliza el *layout* absoluto (establecido con `frame.setLayout(null)`) a modo de ejemplo, pero en general este layout no debe usarse porque los componentes no se redimensionan al cambiar el tamaño de la ventana.

```java
package tds.swing;
import javax.swing.*;
import java.awt.*;

public class ContenedoresSwing {
    public static void main(String[] args) {
        // Crear el marco principal (JFrame)
        JFrame frame = new JFrame("Ejemplo de Contenedores en Swing");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Usar layout absoluto para hacer pruebas (¡no usar en producción!)
        frame.setLayout(null);  
        // Equivalente a frame.getContentPane().setLayout(null)

        // Contenedor 1 (JPanel) - Panel principal
        JPanel contenedor1 = new JPanel();
        contenedor1.setBackground(Color.CYAN);
        contenedor1.setBounds(50, 50, 300, 300);
        contenedor1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));  // Añadir borde

        // Contenedor 2 (JPanel) - Dentro del contenedor 1
        JPanel contenedor2 = new JPanel();
        contenedor2.setBackground(Color.ORANGE);
        contenedor2.setBounds(20, 20, 260, 120);
        contenedor2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));  // Borde rojo

        // Contenedor 3 (JPanel) - También dentro del contenedor 1
        JPanel contenedor3 = new JPanel();
        contenedor3.setBackground(Color.GREEN);
        contenedor3.setBounds(20, 160, 260, 120);
        contenedor3.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));  // Borde azul

        // Añadir contenedores al contenedor principal
        contenedor1.setLayout(null);  // Layout absoluto dentro del panel
        contenedor1.add(contenedor2);
        contenedor1.add(contenedor3);

        // Añadir el contenedor 1 al marco principal
        frame.add(contenedor1);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
```

### Layouts básicos más simples

Los **layouts** en Java/Swing son esenciales porque permiten gestionar automáticamente la posición y el tamaño de los componentes dentro de un contenedor, como una ventana o un panel. Sin layouts, el programador tendría que calcular manualmente las posiciones y tamaños de cada componente, lo que sería poco práctico y llevaría a interfaces poco flexibles que no se adaptan a diferentes tamaños de pantalla o resoluciones.

A continuación se mencionan tres de los layouts más simples:

1. **FlowLayout**:
   - Distribuye los componentes en una fila, alineándolos de izquierda a derecha.
   - Cuando no hay más espacio en la fila, pasa a la siguiente.
   - Es el layout predeterminado para un `JPanel`.
   - Alineación sencilla y útil para interfaces simples.

2. **BorderLayout**:
   - Divide el contenedor en cinco regiones: **Norte, Sur, Este, Oeste y Centro**.
   - Cada región puede contener un solo componente.
   - Es útil cuando se quiere distribuir componentes en áreas específicas, como en una barra de herramientas, un panel principal, etc.
   - Es el layout predeterminado para un `JFrame`.
   - El componente (típicamente un panel) contenido en cada región se expande en todo el tamaño del panel.

3. **BoxLayout**:
   - Dispone los componentes en una única fila (horizontal) o columna (vertical).
   - Proporciona más control sobre el espacio entre componentes en comparación con el `FlowLayout`.
   - Respeta los *hints* de layout de los componentes (ver siguiente sección)

### Layout hints de los componentes

En Swing todos los componentes tienen unas propiedades especiales que sirven para dar pistas a los *layout managers* acerca de cómo deben mostrar los componentes. Estas propiedades son *pistas* y no todos los layout managers las respetan, pero es importante probarlas para saber qué layouts respetan qué propiedades y cuál es su efecto.

1. **`preferredSize`**: Define el tamaño recomendado para el componente. Indica al layout manager el tamaño que el componente debería tener bajo condiciones normales.

2. **`minimumSize`**: Establece el tamaño mínimo que el componente debe tener. Es el tamaño más pequeño que el componente puede reducirse.

3. **`maximumSize`**: Define el tamaño máximo que el componente puede tener. Es el tamaño más grande que el componente puede crecer.

4. **`alignment`**: Se refiere a la alineación del componente dentro de su contenedor. Se establece mediante `setAlignmentX(float alignmentX)` y `setAlignmentY(float alignmentY)`. El valor es un float entre 0.0 (izquierda o arriba) y 1.0 (derecha o abajo). El valor de 0.5 indica el centro.

No es trivial determinar qué combinación de valores es adecuada ya que es muy dependiente del *layout manager*. Es recomendable hacer pruebas con el editor de interfaces (WindowBuilder en este caso) y consultar la documentación correspondiente.

### Contenedores y layout simple

El siguiente ejemplo muestra cómo establecer el layout de una ventana simple.

```java
package tds.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class EjemploSimple extends JFrame {

    public EjemploSimple() {
        // Configurar la ventana principal
        setTitle("Ejemplo Simple");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear el panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Crear la etiqueta
        JLabel etiqueta = new JLabel("Una etiqueta");
        panel.add(etiqueta);

        // Crear el botón
        JButton boton = new JButton("Hace algo");
        panel.add(boton);

        // Añadir el panel a la ventana principal
        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploSimple ventana = new EjemploSimple();
            ventana.setVisible(true);
        });
    }
}
```

#### Cuestiones

Trata de realizar las siguientes tareas sobre el código anterior.

- [ ] Cambia la alineación del botón y la etiqueta para que se "peguen a la derecha" (pista: pasa una constante como `FlowLayout.????` en el constructor).
- [ ] Añade un panel a la derecha del `content pane`. ¿Cómo puedes sabes si el panel se ha añadido correctamente?
- [ ] Cambia los *layout hints* de uno de los botones para descubrir cómo afecta a la disposición del botón.
- [ ] Investiga por qué es necesario usar `invokeLater` (para la siguiente clase).

### Componentes básicos

Los paneles y los layouts sirven para organizar las diferentes zonas de una ventana. Dentro de estas zonas se incluirán componentes (*widgets*) 
con los que el usuario interactuará.

Algunos de los principales componentes son los siguientes.

- Textuales:
  - Campo de texto (JTextField) y Área de texto (JTextArea),
  - Etiquetas (JLabel)

- Controles:
  - Botones (JButton)
  - Menús (JMenu)

- Decoradores:
  - Bordes (Border) y Barras desplazamiento (JScrollPane)

- Selección
  - Listas (JList)
  - Combo (JComboBox)
  - Casillas marcado (JCheckBox)

Estos componentes se irán mostrando a medida que se construyen ejemplos.

### Creación de interfaces con WindowBuilder

WindowBuilder es una herramienta para la creación de interfaces gráficas de usuario (GUIs) mediante la tecnología Swing. Es un plugin para el entorno de desarrollo Eclipse que permite a los desarrolladores diseñar visualmente las interfaces de usuario arrastrando y soltando componentes en un editor gráfico, en lugar de escribir el código manualmente. A partir del diseño de la ventana, WindowBuilder genera el código Swing automáticamente (aunque es posible cambiar el código manualmente y WindowBuilder en la mayoría de las ocasiones es capaz de sincronizar adecuadamente).

En ocasiones las nuevas versiones pueden tener fallos, así que se puede probar con versiones anteriores de Eclipse donde se pueda instalar versiones anteriores de WindowBuilder.

En todo es caso importante señalar que ***es fundamental conocer los conceptos de Swing*** para poder tener éxito utilizando esta herramienta.
De hecho, en ocasiones peude ser necesario o más eficiente modificar a mano el código generado por la herramienta.

#### Instalación

1. Ir al menú `Help -> Eclipse Marketplace`
2. Buscar `WindowBuilder`
3. Confirmar la instalación

#### Uso del diseñador

Para acceder al editor de interfaces hay que hacer lo siguiente:

1. `File -> New -> Other -> WindowBuilder -> Swing Designer`
2. En este punto se ofrecen varios tipos de ventanas, como `JFrame` y `JPanel`. 
3. Para crear una ventana principal, se usará `JFrame`.

Una vez abierto el editor, tendrá el aspecto de la siguiente imagen. Para editar la interfaz se disponen de las siguientes herramientas:

1. La jerarquía de componentes muestran cómo se anidan los componentes y suele ser útil cuando la interfaz es grande para identificar exactamente a qué contenedor pertenece un componente.

2. Cuando se selecciona un componente, sus propiedades aparecen automáticamente y se pueden editar.

3. Se pueden arrastrar componentes a la zona de la representación de la interfaz (3), aunque en ocasiones es mejor arrastrar los componentes a la jerarquía de componentes para evitar ambigüedades (ej., no poder distinguir visualmente en qué zona se está colocando un componente).

4. Los componentes disponibles se clasifican en grupos: contenedores, layouts y componentes (hay otros grupos, pero estos son los principales).

5. Se puede probar la interfaz bien ejecuando el programa o bien con el botón de previsualización.

![Window builder.](imagenes/windowbuilder.png)

#### Algunos trucos

* Para abrir un fichero `.java` que implementa una interfaz gráfica a veces es necesario abrirlo explícitamente `Botón derecho sobre el fichero -> Open with... -> WindowBuilder Editor`. Luego hay que prestar atención a que el editor que se abre tiene dos pestañas `Source` y `Design`.

* No olvidar nombrar los componentes que se han arrastrado (es muy tentador dejar `panel_1`, `panel_2`, etc.).

* Es importante fijarse en el árbol de componentes que aparece a la izquierda, ya que refleja de manera clara la organización real de los componentes.

* En algunas versiones de WindowBuilder las propiedades que se muestran para editar no son todas las disponibles. WindowBuilder solo muestra por defecto las básicas. Para que se muestren todas las propiedades: `Botón derecho en la paleta de propiedades -> Show advanced properties`.

#### Ejercicio

Construir la siguiente ventana para el registro de un usuario:

![Ventana de registro de usuario.](imagenes/ventana.png)

Debes combinar los layouts vistos BorderLayout, FlowLayout y BoxLayout para conseguir el efecto deseado. 