# 🧩 Healthy BMI Calculator  
A beginner-friendly Java console application that gathers user health data and provides BMI classification and a simple fitness recommendation.  
This is one of my first practical mini-projects built while learning Java fundamentals.

---

## 🚀 Features
- Accepts user input via `Scanner`
  - Height (cm)
  - Weight (kg)
  - Age
  - Gender (male/female)
  - Activity level (sedentary → highly active)
- Calculates:
  - **BMI (Body Mass Index)**
  - **Body type category** (Underweight / Normal / Overweight / Obese)
  - **Recommended fitness goal**
- Demonstrates use of:
  - `if-else` logic
  - `switch` (Java 14+ arrow syntax)
  - `Math` utilities
  - Ternary operator
  - Clean console output formatting

---

## 🛠 Tech Stack
- **Language:** Java  
- **Tools:** JDK, IntelliJ IDEA (or any IDE), Git / GitHub  
- **Concepts Practiced:**  
  - Input handling  
  - Branching logic  
  - Lightweight "business logic"  
  - Code structuring and naming practices  

---

## 🔍 Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Input Height (cm)]
    B --> C[Input Weight (kg)]
    C --> D[Input Age]
    D --> E[Input Gender]
    E --> F[Input Activity Level]
    F --> G[Calculate BMI]
    G --> H{BMI Category}
    H -->|<18.5| I[Underweight]
    H -->|18.5-25| J[Normal]
    H -->|25-30| K[Overweight]
    H -->|>30| L[Obese]
    I --> M[Set Goal: Gain Muscle]
    J --> N[Set Goal: Maintain]
    K --> O[Set Goal: Lose Weight]
    L --> O
    M --> P[Print Results]
    N --> P
    O --> P
    P --> Q[End]
