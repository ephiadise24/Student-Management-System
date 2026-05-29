<div align="center">

# 🎓 Student Management System

> *A Java OOP project built with purpose and  curiosity.*



</div>

---

## 👋 What Is This Project?

This is a **Java-based Student Management System** — but more than that, it's proof that OOP concepts don't have to stay as bullet points in a textbook.

We built this as part of our coursework to take everything we'd been learning about **Object-Oriented Programming** and turn it into something real, working, and tangible. Every class, every method, and every line of code here represents a concept we genuinely sat down and figured out together.

It manages undergraduate and graduate students, tracks grades, and demonstrates how powerful Java becomes when you understand the *why* behind the code — not just the syntax.

---

## 🎯 What We Set Out to Do

We didn't just want to write code that compiles. We wanted to actually understand it. Here's what we were aiming for:

- ✅ Get comfortable with Java OOP from the ground up
- ✅ Understand how classes and objects relate to real-world things
- ✅ Build a system that actually uses inheritance — not just defines it
- ✅ Apply encapsulation properly with getters and setters
- ✅ Explore constructor overloading and why it's useful
- ✅ Ship a real, working console application from scratch

---

## ✨ Features

Here's what the system actually does when you run it:

- 🧑‍🎓 **Student Type Selection** — choose between Undergraduate or Graduate
- 📋 **Student Registration** — name, ID, major, and grade are all tracked
- 🎲 **Random Grade Generation** — simulates real grading (0–100 scale)
- 🔤 **Letter Grade Conversion** — automatically maps numeric grades to A / B / C / D / F / NG
- 📊 **Student Details Display** — clean, formatted output for each student
- 🔢 **Total Student Counter** — uses a static member to track everyone registered
- 📚 **Course Information** — displays associated course and instructor details

---

## 🧠 OOP Concepts in Action

This is where it gets interesting. Every concept below isn't just *mentioned — it's actually **used and demonstrated** in the code:

| 💡 Concept | 🔧 How We Used It |
|---|---|
| **Classes & Objects** | `Student`, `UndergraduateStudent`, `GraduateStudent`, `Course` |
| **Encapsulation** | Private fields protected with getters and setters |
| **Inheritance** | `UndergraduateStudent` and `GraduateStudent` both extend `Student` |
| **Polymorphism** | A `Student` reference holds a subclass object at runtime |
| **Method Overriding** | `displayInfo()` behaves differently per student type |
| **Constructor Overloading** | Multiple ways to create a `Student` object |
| **Static Members** | `totalStudents` is shared across all instances |
| **Abstract Design** | `Student` acts as the base blueprint |

---

## 🗂️ Project Structure

```
StudentManagementSystem/
│
├── Main.java                    # Entry point — runs the whole program
├── Student.java                 # Abstract base class for all students
├── UndergraduateStudent.java    # Extends Student — undergrad specific logic
├── GraduateStudent.java         # Extends Student — grad specific logic
└── Course.java                  # Holds course name and instructor info
```

---


## 🛠️ Built With

- **Java** — the one and only
- **IntelliJ IDEA** — our IDE of choice
- **Git & GitHub** — for collaboration and version control


---

## 👨‍💻 Authors

This project was built by two students who genuinely enjoyed figuring it out:

| 👤 Name | 🐙 GitHub |
|---|---|
| **Ephrem Adise**  | [@ephiadise24](https://github.com/ephiadise24) |
| **Bereket Elias** | [@Bereket18x2](https://github.com/Bereket18x2) |

---

<div align="center">

*Made with curiosity and built with Java* ☕

</div>
