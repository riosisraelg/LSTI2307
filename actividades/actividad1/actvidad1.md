Diseña una clase que permita crear objetos simples, como un "Coche", aplicando POO; luego, define, al menos, tres atributos y tres métodos para dicho objeto, teniendo en cuenta los principios de encapsulación y abstracción.

Utiliza una herramienta para crear el diagrama de clases que represente la estructura del objeto del punto anterior, con base en los principios del UML; en el diagrama, incluye clases, atributos, métodos y relaciones entre clases.
```mermaid
classDiagram
    class Coche {
        +String marca
        +String modelo
        +String color
        +int velocidad
        +String estadoEncendido
        +String estatusCoche
        +summaryCoche() 
        +encender()
        +apagar()
        +acelerar()
        +frenar()
        +cambiarColor()
    }
    class motor {
        +String tipo
        +int cilindros
        +double potencia
        +int numeroSerie
        +String nivelAceite
        +String saludMotor
        +String estadoCalentamiento
        +summaryMotor(Coche:Coche)
        +cambiarAceite()
        +reparar()
        +calentar(Coche:Coche)
        +tunear()
    }

    Coche <|-- motor
```