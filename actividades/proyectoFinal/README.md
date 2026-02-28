# Sistema de Gestión de Biblioteca

Sistema de gestión para bibliotecas que permite administrar usuarios, materiales, mobiliario y préstamos mediante persistencia con serialización Java.

## 📋 Modelo del Sistema

### Arquitectura de Clases

``` Mermaid
classDiagram

    %% ========================
    %% Core Aggregator
    %% ========================
    class Library {
        +List~User~ users
        +List~Material~ materials
        +List~Furniture~ furniture
        +List~Loan~ loans
        +registerUser(user: User) bool
        +registerMaterial(material: Material) bool
        +registerLoan(user: User, material: Material) bool
        +generateReport() String
        +getTotalUsers() int
        +getTotalMaterials() int
        +getTotalLoans() int
    }

    %% ========================
    %% Base Abstract Entity
    %% ========================
    class LibraryEntity {
        <<Abstract>>
        +String id
        +String name
        +Date createdAt
        +validate() bool
    }

    Library "1" *-- "*" LibraryEntity

    %% ========================
    %% Users
    %% ========================
    class User {
        +String lastName
        +int age
        +String email
        +float balance
        +int activeLoans
        +canBorrow() bool
        +addLoan() void
        +removeLoan() void
    }

    class Visitor {
        +int maxLoanItems = 2
    }

    class Librarian {
        +String role
        +registerBook(book: Book) void
        +registerUser(user: User) void
    }

    LibraryEntity <|-- User
    User <|-- Visitor
    User <|-- Librarian

    %% ========================
    %% Materials
    %% ========================
    class Material {
        +String author
        +Date publicationDate
        +int stock
        +MaterialCondition condition
        +isAvailable() bool
        +decreaseStock() void
        +increaseStock() void
    }

    class Book {
        +String isbn
        +String publisher
        +String shelfCategory
    }

    class Magazine {
        +int volume
        +int number
    }

    class DVD {
        +int duration
        +String region
    }

    LibraryEntity <|-- Material
    Material <|-- Book
    Material <|-- Magazine
    Material <|-- DVD

    %% ========================
    %% Furniture
    %% ========================
    class Furniture {
        +Date entryDate
        +isOperational() bool
    }

    class Shelf {
        +int capacity
        +String section
    }

    class Desk {
        +int seatCapacity
        +String location
    }

    class Chair {
        +String material
        +bool ergonomic
        +bool hasWheels
    }

    LibraryEntity <|-- Furniture
    Furniture <|-- Shelf
    Furniture <|-- Desk
    Furniture <|-- Chair

    %% ========================
    %% Loan
    %% ========================
    class Loan {
        +Date startDate
        +Date dueDate
        +LoanStatus status
        +closeLoan() void
        +isOverdue() bool
    }

    User "1" -- "*" Loan
    Material "1" -- "*" Loan

    %% ========================
    %% Composition
    %% ========================
    Library "1" *-- "*" User
    Library "1" *-- "*" Material
    Library "1" *-- "*" Furniture
    Library "1" *-- "*" Loan
```

## 📥 Entradas del Sistema

### Menú Principal
El sistema presenta un menú interactivo con las siguientes opciones:

```
--- Library Management System ---
1. Register User
2. Register Material
4. Borrow Material
5. Return Material
6. Generate Summary Report
7. Generate Detailed Report
8. Exit
```

### 1. Registrar Usuario (Opción 1)

**Entradas requeridas:**
- `Type`: Tipo de usuario
  - `v` = Visitor (Visitante)
  - `l` = Librarian (Bibliotecario)
- `ID`: Identificador único (String)
- `Name`: Nombre (String)
- `Last Name`: Apellido (String)
- `Age`: Edad (int)
- `Email`: Correo electrónico (String)

**Ejemplo de entrada:**
```
Type: v
ID: U001
Name: Juan
Last Name: Pérez
Age: 25
Email: juan.perez@email.com
```

**Validaciones:**
- ID no debe estar duplicado
- Edad debe ser un número válido
- Email debe tener formato válido

---

### 2. Registrar Material (Opción 2)

**Entradas requeridas:**
- `Type`: Tipo de material
  - `b` = Book (Libro)
  - `m` = Magazine (Revista)
  - `d` = DVD
- `ID`: Identificador único (String)
- `Name`: Nombre del material (String)
- `Author`: Autor (String)
- `Stock`: Cantidad disponible (int)

**Ejemplo de entrada:**
```
Type: b
ID: B001
Name: Cien Años de Soledad
Author: Gabriel García Márquez
Stock: 5
```

**Validaciones:**
- ID no debe estar duplicado
- Stock debe ser mayor a 0

---

### 3. Realizar Préstamo (Opción 4)

**Entradas requeridas:**
- `User ID`: ID del usuario (seleccionado de lista)
- `Material ID`: ID del material (seleccionado de lista disponible)

**Ejemplo de entrada:**
```
User ID: U001
Material ID: B001
```

**Validaciones:**
- Usuario debe existir y tener menos de 3 préstamos activos
- Material debe existir y tener stock disponible
- Se genera automáticamente:
  - Loan ID (UUID de 4 caracteres)
  - Fecha de préstamo (hoy)
  - Fecha de vencimiento (14 días después)

---

### 4. Devolver Material (Opción 5)

**Entradas requeridas:**
- `Loan ID`: ID del préstamo activo (seleccionado de lista)

**Ejemplo de entrada:**
```
Loan ID: a3f2
```

**Validaciones:**
- Préstamo debe existir
- Préstamo debe estar en estado ACTIVE

---

## 📤 Salidas del Sistema

### Mensajes de Confirmación

#### Registro Exitoso de Usuario
```
Success! Created: User[id='U001', name='Juan', lastName='Pérez', age=25, email='juan.perez@email.com', activeLoans=0]
```

#### Registro Exitoso de Material
```
Success! Created: Book[id='B001', name='Cien Años de Soledad', author='Gabriel García Márquez', stock=5, condition=NEW]
```

#### Préstamo Exitoso
```
Success! Created: Loan[id='a3f2', user=Juan Pérez, material=Cien Años de Soledad, loanDate=2026-02-27, dueDate=2026-03-13, status=ACTIVE]
```

#### Devolución Exitosa
```
Success! Returned Loan ID: a3f2
```

### Mensajes de Error

```
Failed to register User.
Failed to register Material.
Failed to register Loan. Check if user/material exists and limits.
Failed to return Loan.
```

---

### Reporte Resumido (Opción 6)

```
Library Report
==============
Total Users: 3
Total Materials: 15
Total Furniture: 8
Total Loans: 12
Active Loans: 5
Overdue Loans: 2
```

---

### Reporte Detallado (Opción 7)

```
DETAILED LIBRARY SYSTEM REPORT
================================

--- USERS (3) ---
User[id='U001', name='Juan', lastName='Pérez', age=25, email='juan.perez@email.com', activeLoans=1]
User[id='U002', name='María', lastName='González', age=30, email='maria.gonzalez@email.com', activeLoans=0]
User[id='L001', name='Carlos', lastName='Ramírez', age=35, email='carlos.ramirez@email.com', activeLoans=0, role='Head Librarian']

--- MATERIALS (15) ---
Book[id='B001', name='Cien Años de Soledad', author='Gabriel García Márquez', stock=4, condition=NEW]
Book[id='B002', name='Don Quijote', author='Miguel de Cervantes', stock=3, condition=GOOD]
Magazine[id='M001', name='National Geographic', author='Various', stock=10, condition=NEW, issue=245, volume=12]
DVD[id='D001', name='El Padrino', author='Francis Ford Coppola', stock=2, condition=GOOD, duration=175min]

--- FURNITURE (8) ---
Shelf[id='S001', name='Main Shelf A', material='Wood', location='Section A', capacity=200, currentLoad=150]
Desk[id='D001', name='Reading Desk 1', material='Oak', location='Reading Room', hasDrawers=true, seats=4]
Chair[id='C001', name='Study Chair 1', material='Plastic', location='Study Area', hasArmrests=true, adjustable=true]

--- LOANS (12) ---
Loan[id='a3f2', user=Juan Pérez, material=Cien Años de Soledad, loanDate=2026-02-27, dueDate=2026-03-13, status=ACTIVE]
Loan[id='b7k9', user=María González, material=Don Quijote, loanDate=2026-02-15, dueDate=2026-03-01, status=OVERDUE]
Loan[id='c2m4', user=Juan Pérez, material=National Geographic, loanDate=2026-02-20, dueDate=2026-03-06, status=RETURNED]
```

---

## 💾 Persistencia de Datos

### Serialización Java

El sistema utiliza **serialización nativa de Java** para persistir el estado completo:

**Archivo de datos:** `data/library.dat`

**Características:**
- Todas las entidades implementan `Serializable`
- Guardado automático al salir del sistema (Opción 8)
- Carga automática al iniciar
- Preserva todas las relaciones entre objetos
- Formato binario eficiente

**Métodos de persistencia:**
```java
// Guardar estado
library.save("data/library.dat");

// Cargar estado
Library library = Library.load("data/library.dat");
```

---

## 🎯 Reglas de Negocio

1. **Límite de préstamos:** Cada usuario puede tener máximo 3 préstamos activos simultáneos
2. **Duración de préstamo:** 14 días desde la fecha de préstamo
3. **Disponibilidad:** Solo se pueden prestar materiales con stock > 0
4. **IDs únicos:** No se permiten IDs duplicados en ninguna entidad
5. **Estado de préstamos:**
   - ACTIVE: Préstamo en curso
   - RETURNED: Material devuelto
   - OVERDUE: Préstamo vencido (fecha actual > fecha de vencimiento)

---

## 📊 Enumeraciones

### LoanStatus
```java
ACTIVE    // Préstamo activo
RETURNED  // Material devuelto
OVERDUE   // Préstamo vencido
```

### MaterialCondition
```java
NEW       // Nuevo
GOOD      // Buen estado
WORN      // Desgastado
DAMAGED   // Dañado
```

---

## 🔍 Características Técnicas

- **Lenguaje:** Java
- **Paradigma:** Programación Orientada a Objetos
- **Patrones:** Herencia, Polimorfismo, Encapsulamiento
- **Persistencia:** Serialización Java nativa
- **Interfaz:** Consola interactiva
- **Gestión de fechas:** Java Time API (LocalDate)
- **Colecciones:** ArrayList para gestión de entidades

---

## 📝 Notas

- El sistema limpia la consola entre operaciones para mejor experiencia de usuario
- Los mensajes de éxito se muestran durante 2 segundos antes de volver al menú
- Los reportes requieren presionar Enter para continuar
- El sistema crea automáticamente el directorio `data/` si no existe
- En caso de error al cargar datos, se inicia con una biblioteca vacía

---