# Tarea 4 : Simulador de Descuentos con Quarkus
---

## Preguntas 
**1. ¿En qué parte del ejercicio se aplica IoC y en cuál DI?**

IoC se aplica cuando delegamos la creación y gestión del ciclo de vida de las isntancias al contenedor por medio de anotaciones como @ApplicationScoped Y DI se aplica cuando VentaService recibe sus dependencias inyectadas con @Inject vía constructor o atributo

**2. ¿Qué función cumplen los Qualifiers y por qué son necesarios?**

Ayuda a resolver la ambiguedad que se presenta cuando se quiere inyectar varias implementaciones de una interfaz, es decir si dos clases implementan la misma interfaz y se quiere inyectar estas dos clases, se recurre a los Qualifiers o Named para solucionar la ambiguedad

**3. ¿Cuál es la diferencia entre @ApplicationScoped y @Dependent?**

Si se usa la anotacion ApplicationScoped, se el contenedor mantendra una unica instancia que vivira desde el inicio hasta el final de la ejecucion, esta unica se comparte entre todas las que lo requieran, a diferencia de Dependent, que crea una instancia una clase lo requiere y la destruye cuando esta ya no lo necesita

**4. ¿Por qué las instancias @ApplicationScoped pueden reutilizarse entre varias ventas?**

Debido a que su ciclo de vida está ligado a toda la ejecución de la aplicación, es una unica instancia compartida

**5. ¿Qué sucedería si se elimina el Qualifier de un punto de inyección de CalculadoraDescuento?**

Apareceria la ambiguedad, ya que el contenedor no sabria que implementacion de la interfaz inyectar
