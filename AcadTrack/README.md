# 🎓 AcadTrack

A Java console application for managing student records using object-oriented principles — strict encapsulation, inheritance hierarchy, and polymorphism.

---

## 📁 Project Structure

```
AcadTrack/
└── src/
    └── student/
        ├── Student.java       ← Base class
        ├── UG.java            ← Level 1: Undergraduate
        ├── PG.java            ← Level 1: Postgraduate + Publications
        ├── Bachelor.java      ← Level 2: extends UG
        ├── Master.java        ← Level 2: extends PG
        ├── PhD.java           ← Level 2: extends PG
        ├── Scientist.java     ← Level 2: extends PG
        └── Main.java          ← Menu driver + in-memory storage
```

---

## 🧬 Class Hierarchy

```
Student
├── UG
│   └── Bachelor      (Branch, College)
└── PG
    ├── Master         (Specialization, Project)
    ├── PhD            (Topic, Supervisor)
    └── Scientist      (Area)
```

All fields are **private** with getters and setters. `readData()` and `printData()` are overridden at every level.

---

## ⚙️ Setup & Run

### Prerequisites
- Java 14 or higher (uses switch arrow-case syntax)

### Compile
```bash
javac -d out src/student/*.java
```

### Run
```bash
java -cp out student.Main
```

---

## 🖥️ Usage

On launch, a menu appears:

```
╔══════════════════════════════════════════╗
║      STUDENT DATA ENTRY SYSTEM  v1.0     ║
╚══════════════════════════════════════════╝

  ┌─────────────────────────────────────┐
  │           MAIN MENU                 │
  ├─────────────────────────────────────┤
  │  1. Add Bachelor   (UG)             │
  │  2. Add Master     (PG)             │
  │  3. Add PhD        (PG)             │
  │  4. Add Scientist  (PG)             │
  │  5. Print All Records               │
  │  6. Exit                            │
  └─────────────────────────────────────┘
```

Pick a category, fill in the prompted fields, then use option **5** to print all stored records.

---

## 📋 Fields by Class

| Class | Fields |
|---|---|
| `Student` | Name, Roll No, Course, Department |
| `UG` | + UG Result |
| `PG` | + PG Result, Publications (Books, Papers, Patents) |
| `Bachelor` | + Branch, College |
| `Master` | + Specialization, Project Title |
| `PhD` | + Research Topic, Supervisor |
| `Scientist` | + Research Area |

---

## 🔑 Design Highlights

- **Single shared `Scanner`** — declared `protected static` in `Student`, reused across all subclasses with no leaks.
- **`Publications` as a static inner class of `PG`** — logically scoped, no outer instance needed.
- **`ArrayList<Student>`** stores all entries polymorphically; `printData()` dispatches via runtime polymorphism.
- **Arrow-case `switch`** (Java 14+) — cleaner and fall-through safe.

---

## 🚀 Extending the Project

Some ideas to build on top of this:

- **Persistence** — serialize the `ArrayList` to a `.dat` file using `ObjectOutputStream`, or write to a CSV/SQLite DB.
- **Search** — add a menu option to search records by name or roll number.
- **Update / Delete** — find a record by roll number and modify or remove it.
- **GUI** — swap the console I/O for a Swing or JavaFX form.
- **Unit Tests** — add JUnit tests for each class's `readData` / `printData` logic using mock input streams.

---

## 📄 License

This project is open for personal and academic use. Fork it, extend it, and make those squares green. 🟩
