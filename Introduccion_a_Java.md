
# JAVA

## • INTRODUCCION A JAVA


**En primer lugar muestra lo que es Java, sus características y las herramientas que están ligadas a él y, a continuación, enseña cómo compilar y ejecutar algunos programas sencillos escritos en Java.**   

**La tecnología Java es tanto una plataforma como un lenguaje de programación.** 
**En los capítulos posteriores se trata de dar una visión más detallada de la sintaxis del lenguaje de programación Java.**

##   • EL LENGUAJE DE PROGRAMACIÓN JAVA 

El lenguaje de programación Java, fue diseñado por la compañía Sun Microsystems Inc, con el propósito de crear un lenguaje que pudiera  funcionar en sistemas de ordenadores heterogéneos (redes de computadoras formadas por más de un tipo de ordenador, ya sean PC compatibles, Macintosh o estaciones de trabajo que empleen diferentes sistemas operativos como Windows, OS/2 o Unix), y que fuera independiente de la plataforma en la que se vaya a ejecutar. Esto significa que un programa de Java puede ejecutarse en cualquier máquina o plataforma.  

Su origen se remonta a la creación de un lenguaje de programación para el desarrollo de aplicaciones para electrodomésticos y otros aparatos electrónicos de consumo por parte de una empresa filial de Sun, llamada FirstPerson en 1991. Su creador, **James Gosling**, lo bautizó como **Oak**.

#
## • CARACTERÍSTICAS DEL LENGUAJE
- **Sencillo:** Elimina la complejidad de los lenguajes como C y da paso al contexto de los lenguajes modernos orientados a objetos. Aunque la sintaxis de Java es muy similar a C y C++, que son lenguajes a los que una gran mayoría de programadores están acostumbrados a emplear.

- **Orientado a Objetos.** La filosofía de programación orientada a objetos es diferente a la programación convencional (imperativa o procedural). Su nivel de abstracción facilita la creación y mantenimiento de programas. Existen muchas referencias que dan una introducción a esta forma de programar.
  
-  **Independiente:** a la arquitectura y portable. Al compilar un programa en Java, el código resultante es un tipo de código binario conocido como Java bytecodes. Este código es interpretado por diferentes computadoras de igual manera, por lo que únicamente hay que implementar un intérprete para cada plataforma. De esa manera Java logra ser un lenguaje que no depende de una arquitectura de ordenador específica.

- **Robusto:** Java simplifica la gestión de la memoria dinámica. Por ejemplo, ya no es necesario la liberación explícita, el intérprete de Java lo lleva acabo automáticamente cuando detecta que una variable dinámica ya no es usada por el programa. Por otra parte, impide que un puntero Java apunte a una dirección de memoria no válida, los punteros (referencias) Java son seguros y deterministas: o bien apuntan a un elemento correctamente alojado en memoria o bien tienen el valor nulo.
  
- **Seguro:** El sistema de Java tiene ciertas políticas que evitan que se puedan codificar virus con este lenguaje. Existen muchas restricciones, especialmente para los denominados applets, que limitan lo que se puede y no puede hacer con los recursos críticos de una computadora.
Multitarea. Un lenguaje que soporta múltiples threads, hilos o tareas, es un lenguaje que puede ejecutar diferentes líneas de código al mismo tiempo. El soporte y la programación de hilos en Java está integrado en la propia sintaxis del lenguaje.

- **Dinámico:** En Java no es necesario cargar completamente el programa en memoria sino que las clases compiladas pueden ser cargadas bajo demanda en tiempo de ejecución (dynamic binding). Esto proceso permite la carga de código bajo demanda.

#

##  • Esquema del proceso de creación de un programa con Java

![ESQUEMA](https://www.arkaitzgarro.com/java/images/cap01/programa-con-java.png)

#### *Actualmente las máquinas virtuales modernas realizan una compilación JIT (Just In Time) en donde el bytecode no es interpretado sino que se compila directamente a código máquina en tiempo de ejecución de acuerdo con la arquitectura (procesador y sistema operativo) en la que se ejecuta la máquina virtual.*  
---
---

## VENTAJAS EN EL USO DE JAVA
Pueden destacarse las siguientes ventajas en el empleo de Java como lenguaje de programación:

- **Compatibilidad:** No es necesario modificar (reescribir) el código si se desea ejecutar el programa en otra máquina. Un único código funciona donde se tenga una Máquina Virtual de Java (ordenadores PC compatibles, Macintosh o estaciones de trabajo que empleen diferentes sistemas operativos como Windows, Mac OS X, Linux o Unix).
  
- **Metodología OO:** Java es un lenguaje de programación orientado a objetos, y tiene todos los beneficios que ofrece esta metodología de programación: facilita la creación, el mantenimiento y la reutilización de código.

- **Menos y mejor código"** Comparaciones de métricas de programas indican que un programa en escrito en Java es cuatro veces de menor tamaño que uno escrito en C++ y además favorece los buenos hábitos en la programación como, por ejemplo, la gestión de la memoria dinámica.
Gratuidad. El kit de desarrollo Java es gratuito y puede descargarse desde la página oficial de Java.

---