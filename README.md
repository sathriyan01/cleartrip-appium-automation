# 🚀 Cleartrip Appium Automation Framework

## 📌 Project Overview

This project is a **Mobile Test Automation Framework** built using **Appium + Java + TestNG** for automating key user flows in the Cleartrip application.

The framework is designed with **scalability, reusability, and maintainability** in mind using the **Page Object Model (POM)** design pattern.

---

## 🎯 Objectives

* Automate core functionalities of the Cleartrip app
* Ensure test stability and reliability
* Implement reusable and maintainable code structure
* Validate both positive and negative test scenarios

---

## 🛠️ Tech Stack

* **Language:** Java
* **Automation Tool:** Appium
* **Testing Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Reporting:** Extent Reports
* **Version Control:** Git & GitHub

---

## 📂 Project Structure

```
AppiumDemoProject/
│
├── src/test/java/
│   ├── base/              # Base setup (Driver initialization)
│   ├── pages/             # Page classes (POM)
│   ├── tests/             # Test cases
│   ├── utils/             # Utility classes
│   └── listeners/         # TestNG listeners
│
├── src/main/resources/
│   └── config.properties  # Configuration file
│
├── testng.xml             # Test suite configuration
├── pom.xml                # Maven dependencies
└── README.md              # Project documentation
```

---

## ⚙️ Prerequisites

Before running this project, make sure you have:

* Java JDK (8 or above)
* Maven installed
* Appium Server installed
* Android Studio / Emulator or real device
* Node.js installed

---

## ▶️ How to Run the Project

### 1. Clone the repository

```
git clone https://github.com/sathriyan01/cleartrip-appium-automation.git
```

### 2. Navigate to project

```
cd cleartrip-appium-automation
```

### 3. Install dependencies

```
mvn clean install
```

### 4. Start Appium Server

```
appium
```

### 5. Run tests

```
mvn test
```

---

## 🧪 Test Coverage

* Flight search functionality
* Navigation between pages
* Filter application
* Traveller selection
* Negative test scenarios

---

## 🧩 Framework Highlights

* ✔️ Page Object Model (POM) implementation
* ✔️ Reusable utility classes
* ✔️ Centralized configuration management
* ✔️ Screenshot capture on failure
* ✔️ Extent Reports for detailed reporting
* ✔️ Robust exception handling

---

## 📊 Reporting

* Extent Reports generated after execution
* Screenshots captured for failed test cases

---

## 🔄 Git Workflow

* Initialized repository using Git
* Used `.gitignore` to exclude unnecessary files
* Maintained clean and meaningful commits
* Hosted project on GitHub

---

## 🚀 Future Enhancements

* CI/CD integration (Jenkins/GitHub Actions)
* Parallel test execution
* Cross-device testing
* Integration with cloud platforms (BrowserStack, Sauce Labs)

---

## 👨‍💻 Author

**Sathriyan M**

---

## ⭐ Conclusion

This framework demonstrates a **real-world automation testing setup** with best practices, making it suitable for scalable mobile testing projects.
