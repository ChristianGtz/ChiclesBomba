README
###Practica 03 - Modelado y Programacion
Facultad de Ciencias, UNAM - 2026-2
## 👥 Datos del Equipo

| Integrante | No. de cuenta |
|------------|---------------|
| Victor Emmanuel Hernández López | 314132417 |
| Christian David Gutiérrez Rangel | 318704069 |


##Practica 03 - Patrones Iterator, Builder y Factory
Esta practica implementa los patrones de diseno Iterator, Builder y Factory en el contexto de la
Academia Ninja de la Aldea de las Ciencias. El sistema organiza grupos de entrenamiento
conformados por ninjas voluntarios y aspirantes, asignando a cada grupo un paquete de herramientas
y un campo de entrenamiento.
Justificacion de los Patrones Aplicados
##Patron Iterator
Se eligio el patron Iterator porque el problema requiere recorrer dos colecciones de distinta estructura
interna: los aspirantes se almacenan en una Hashtable y los ninjas en un arreglo (Array). Definimos
nuestras propias interfaces Iterator<T> y Coleccion<T> para hacer explicito el patron. AspiranteIterator
opera sobre una lista extraida del Hashtable, y NinjaIterator opera directamente sobre el arreglo. Esto
nos permite recorrer ambas colecciones de forma uniforme en App sin exponer su estructura interna,
cumpliendo con el objetivo del patron.
##Patron Builder
Se eligio el patron Builder para la construccion de PaqueteHerramientas porque existen multiples
configuraciones posibles (Basico, Avanzado, Tactico y personalizado) y cada una agrega distintas
cantidades de herramientas. La interfaz PaqueteBuilder define los pasos de construccion y
PaqueteHerramientasBuilder los implementa con encadenamiento de metodos. La clase Encargado
actua como Director, conociendo los pasos exactos para armar cada paquete prefabricado. El paquete
personalizado se construye directamente desde App usando el mismo builder, aprovechando la
flexibilidad que el patron ofrece.
##Patron Factory
Se eligio el patron Factory en dos lugares. NinjaFactory crea instancias concretas de Ninja (Genin,
Chunin, Jonin) segun el rango indicado, encapsulando la logica de instanciacion y permitiendo que
App no dependa de las subclases concretas. CampoEntrenamientoFactory crea el campo de
entrenamiento correcto segun la suma de niveles de habilidad del grupo, centralizando esa decision en
un solo lugar. Ambas fabricas facilitan la extension del sistema sin modificar el codigo cliente.

##Compilacion y Ejecucion
El codigo no utiliza librerias externas, paquetes adicionales ni JARs. Todos los archivos .java se
encuentran en la carpeta src/. Los comandos son compatibles con Linux y Windows.
Compilar:
javac *.java
Ejecutar:
java App
Version de Java utilizada: JDK 23. Se recomienda usar esta version para evitar conflictos de
compilacion.
