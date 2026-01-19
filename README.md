**Overview**
---
This is a **console-based student result processing system** built in **Java** that calculates and displays grades for multiple students based on their marks in 3 subjects. The system includes input validation, grade assignment, and a clean result summary.

---

**Features**
---
✅ **Input validation** for marks (0–100 range)

✅ **Grade assignment** using `if-else` statements

✅ **Grade description** using `switch` statements

✅ **Loop control** for multiple student entries

✅ Use of `break` and `continue` statements

✅ Modular design with separate methods for:

    . Percentage calculation

    . Grade assignment

    . Grade description

✅ **Clean output** with formatted result summary

✅ **Graceful exit** with `EXIT` command

---

**Project Structure**
---
```
StudentResult.java  →  Main program file
README.md           →  This documentation file
```

---

**How to Run**
---
**1. Compile the Java file:**
                     javac StudentResult.java

**2. Run the program:**
                     java StudentResult

---

**Usage Example**
---
```
Enter student name (or EXIT to Stop):
Alex
Enter marks for subject 1: 
80
Enter marks for subject 2: 
70
Enter marks for subject 3: 
90

----- Result Summary -----
Student Name : Alex
Total Marks : 240
Percentage : 80.0%
Grade    : B
Grade B: Very Good
--------------------------
```
---

**Technical Details**
---
**Methods Used:**
1. `calculatePercentage()` → Computes percentage from total marks

2. `assignGrade()` → Assigns grade based on percentage using `if-else`

3. `gradeDescription()` → Displays grade description using `switch`

**Loops & Control Statements:**

. `while loop` → For multiple student entries

. `for loop` → For entering marks per subject

. `break` → To exit the program

. `continue` → To skip invalid marks entry

---

**Deliverables Completed**
---
. Console-based result processing system

. Sample test cases output (included above)

. Modular code with methods

. Proper indentation and naming conventions

. Use of `if-else`, `switch`, loops, `break`, `continue`
