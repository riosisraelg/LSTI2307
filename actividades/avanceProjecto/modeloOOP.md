```mermaid
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