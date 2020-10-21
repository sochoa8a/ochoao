
# JAVA SCHEDULER

#### SAMUEL OCHOA OVALLE
#### NUM CONTROL. 19100227
#### MATERIA: TOPICOS AVANZADOS DE PROGRAMACION

#
## • Scheduling

Java tiene un Scheduler, una lista de procesos, que monitoriza todos los hilos que se están ejecutando en todos los programas y decide cuales deben ejecutarse y cuales deben encontrarse preparados para su ejecución. Hay dos características de los hilos que el scheduler identifica en este proceso de decisión. Una, la más importante, es la prioridad del hilo de ejecución; la otra, es el indicador de demonio.
 La regla básica del scheduler es que si solamente hay hilos demonioejecutándose, la Máquina Virtual Java (JVM) concluirá. Los nuevos hilos heredan la prioridad y el indicador de demonio de los hilos de ejecución que los han creado.
 La  Máquina  Virtual  Java  (JVM)  es  un  sistema  multihilo.  Es  decir,  es  capaz  de  ejecutar  varios  hilos de ejecución simultáneamente. La JVM gestiona todos los detalles, asignación de tiempos de  ejecución,  prioridades,  etc.,  de  forma  similar  a  como  gestiona  un  Sistema  Operativo  múltiples procesos. 
 
 La diferencia básica entre un proceso de Sistema Operativo y un ThreadJava es que los hilos corren dentro de la JVM, que es un proceso del Sistema Operativo y por tanto comparten todos los recursos, incluida la memoria y las variables y objetos allí definidos. A este tipo de procesos donde se comparte los recursos se les llama a veces procesos ligeros (lightweight process). 
 
 Java  da  soporte  al  concepto  de  **Thread**  desde  el  propio  lenguaje,  con  algunas  clases  e  interfaces definidas en el paquete 
 **java.lang** y con métodos específicos para la manipulación de **Threads** en la clase **Object.**  
 Desde el punto de vista de las aplicaciones los hilos son útiles porque permiten que el flujo del programa  sea  divido  en  dos  o  más  partes,  cada  una  ocupándose  de  alguna  tarea  de  forma  independiente.  Por  ejemplo  un  hilo  puede  encargarse  de  la  comunicación  con  el  usuario,  mientras  que  otros  actúan  en  segundo  plano,  realizando  la  transmisión  de  un  fichero,  accediendo  a  recursos  del  sistema  (cargar  sonidos,  leer  ficheros  ...),  etc.  De  hecho,  todos  los  programas con interface gráfico (AWT o Swing) son multihilo porque los eventos y las rutinas de dibujado de las ventanas corren en un hilo distinto al principal. 

### • EL CICLO DE VIDA DE UN THREAD


 ![CICLO DE VIDA](https://anibsanmor.files.wordpress.com/2011/02/ciclovidathread.gif?w=436&zoom=2)
