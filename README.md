# SQL & Advanced Database Management Systems - WBSU

A dedicated repository for SQL assignments and advanced database management coursework from the **Master of Science in Computer Science** program at **West Bengal State University (WBSU)**.

## 📚 Overview

This repository contains comprehensive SQL Tutorial and implementations covering advanced database management systems concepts. All assignments focus on practical SQL development, query optimization, and database administration.

---

## 🎓 Course: Advanced Database Management Systems

### Key Topics Covered

- **SQL Fundamentals & Query Language**
  - SELECT, INSERT, UPDATE, DELETE operations
  - WHERE clauses and filtering
  - ORDER BY and GROUP BY operations
  - DISTINCT and aggregate functions (COUNT, SUM, AVG, MAX, MIN)

- **Advanced SQL Queries**
  - JOIN operations (INNER, LEFT, RIGHT, FULL OUTER, CROSS)
  - Subqueries and correlated subqueries
  - Set operations (UNION, INTERSECT, EXCEPT)
  - Window functions and analytical queries

- **Database Design & Normalization**
  - Entity-Relationship (ER) models
  - Normalization forms (1NF, 2NF, 3NF, BCNF)
  - Schema design and optimization
  - Primary and foreign key constraints

- **Transaction Management**
  - ACID properties (Atomicity, Consistency, Isolation, Durability)
  - Transaction control (BEGIN, COMMIT, ROLLBACK)
  - Concurrency control and locking mechanisms
  - Isolation levels

- **Indexes & Query Optimization**
  - Index creation and maintenance
  - Query execution plans
  - Performance tuning strategies
  - Index selection and optimization

- **Stored Procedures & Functions**
  - Procedure creation and execution
  - User-defined functions (UDFs)
  - Triggers and automated actions
  - Cursor operations

- **Database Security & Administration**
  - User account management and permissions
  - GRANT and REVOKE statements
  - Data backup and recovery strategies
  - Access control and authentication

---

## 📁 Repository Structure

```
WBSU_Codes/
├── README.md                    # This file
├── sql_assignment1.odt         # SQL Assignment 1
├── sql_assignment2.odt         # SQL Assignment 2
└── [SQL scripts and database files]
```

---

## 🚀 Getting Started

### Prerequisites
- **Database System:** MySQL, PostgreSQL, Microsoft SQL Server, or Oracle Database
- **SQL Client Tools:** 
  - MySQL Workbench
  - pgAdmin (for PostgreSQL)
  - SQL Server Management Studio (SSMS)
  - DBeaver
- **Text Editor/IDE:** VS Code, PyCharm, or IntelliJ IDEA

### Installation

1. **Clone the repository:**
```bash
git clone https://github.com/arikmukherjee/SQL-Tutorial.git
cd WBSU_Codes
```

2. **Set up your database:**
```bash
# For MySQL
mysql -u root -p < database_setup.sql

# For PostgreSQL
psql -U postgres -f database_setup.sql
```

3. **Execute SQL assignments** using your preferred SQL client

---

## 📝 Assignments

| Assignment | File | Description | Status |
|-----------|------|-------------|--------|
| SQL Assignment 1 | `sql_assignment1.odt` | Database design, normalization, and basic queries | ✅ Completed |
| SQL Assignment 2 | `sql_assignment2.odt` | Advanced queries, joins, stored procedures, and optimization | ✅ Completed |

---

## 🔍 SQL Topics & Examples

### Basic Queries
```sql
-- SELECT with WHERE clause
SELECT * FROM students WHERE GPA > 3.5;

-- Aggregate functions
SELECT COUNT(*), AVG(salary) FROM employees;
```

### JOINs
```sql
-- INNER JOIN
SELECT s.name, c.course_name 
FROM students s 
INNER JOIN enrollments e ON s.student_id = e.student_id
INNER JOIN courses c ON e.course_id = c.course_id;
```

### Subqueries
```sql
-- Correlated subquery
SELECT name FROM employees e1 
WHERE salary > (SELECT AVG(salary) FROM employees e2 WHERE e1.department_id = e2.department_id);
```

---

## 📊 Database Concepts

- **Relational Model:** Tables, tuples, attributes, and relationships
- **Keys:** Primary, Foreign, Unique, Candidate keys
- **Constraints:** NOT NULL, UNIQUE, PRIMARY KEY, FOREIGN KEY, CHECK, DEFAULT
- **Views:** Virtual tables for simplified data access
- **Stored Procedures:** Reusable SQL code blocks
- **Triggers:** Automated actions on data modifications

---

## 📖 Learning Resources

Recommended textbooks and references:
- **"Database System Concepts"** by Silberschatz, Korth, and Sudarshan
- **"SQL Performance Explained"** by Markus Winand
- **Official Documentation:** 
  - [MySQL Documentation](https://dev.mysql.com/doc/)
  - [PostgreSQL Documentation](https://www.postgresql.org/docs/)
  - [SQL Server Documentation](https://docs.microsoft.com/en-us/sql/)
- **Online Platforms:** LeetCode Database, HackerRank SQL, Mode Analytics SQL Tutorial

---

## 📌 Best Practices

✅ **Recommended Practices:**
- Use meaningful table and column names
- Always normalize database schemas
- Create appropriate indexes for frequently queried columns
- Write well-documented SQL queries
- Use prepared statements to prevent SQL injection
- Backup databases regularly
- Test queries before executing on production data

❌ **Avoid:**
- SELECT * in production queries
- Missing WHERE clauses in UPDATE/DELETE statements
- Overlooking data types and constraints
- Ignoring query performance metrics
- Using global variables excessively

---

## 📋 Academic Integrity

All SQL assignments and code in this repository are original work for WBSU MSc coursework. Academic integrity standards and university guidelines are strictly followed.

---

## 📧 Contact & Support

For questions regarding SQL assignments and coursework:
- **Repository Owner:** Arik Mukherjee
- **GitHub:** [arikmukherjee](https://github.com/arikmukherjee)
- **University:** West Bengal State University (WBSU)
- **Program:** MSc in Computer Science

---

## 📄 License

This repository is for educational purposes as part of the WBSU MSc Computer Science program.

---

**Last Updated:** April 2026  
**Focus:** Advanced SQL & Database Management Systems
