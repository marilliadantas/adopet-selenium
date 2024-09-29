<h1 align="center"> PROJETO AUTOMAÇÃO - SELENIUM E CUCUMBER</h1>

![STATUS](https://img.shields.io/static/v1?label=STATUS&message=%20PROGRESS&color=GREEN&style=for-the-badge)


## 💬 About the project
<p> The project aims to study and enhance our knowledge using <b>Java, Selenium, and Cucumber</b> for web testing automation. The goal is to master advanced testing techniques, including browser interactions, element validations, and the integration of Cucumber for behavior-driven development (BDD), ensuring robust and scalable test automation.</p>

### 👨‍💻 Programming Language
- [Java](<https://www.oracle.com/java/technologies/javase-downloads.html>)

### 💻 Setting Up the Environment
- [Maven](<https://maven.apache.org/download.cgi>)
- [JUnit](<https://junit.org/junit5/docs/current/user-guide/#overview>)
- [Selenium](<https://www.selenium.dev/downloads/>)
- [Cucumber](<https://cucumber.io/docs/guides/10-minute-tutorial/>) (BDD)
- [Git](<https://git-scm.com/downloads>)

### 📁 Cloning the Project
```bash
https://github.com/marilliadantas/adopet-selenium
```

### ✔️ Running the Tests
Run the tests using the following command.
```bash
mvn test
```

### ✔️ Running tests with scenario name
```
.
├── README.md                     # Main project documentation
├── pom.xml                       # Maven configuration file
└── src
└── test
├── java
│   ├── base
│   │   ├── BasePage.java         # Base class with common methods for pages (e.g., navigation, element interactions)
│   │   ├── BaseSteps.java        # Base class with common methods for steps (e.g., hooks and initial configurations)
│   │   └── Utils.java            # Utilities and helper functions (e.g., data generators, formatting)
│   ├── pages                     # Page Objects for different pages
│   │   ├── InitialPage.java
│   │   ├── LoginPage.java
│   │   └── RegisterPage.java
│   ├── runner
│   │   └── RunCucumberTest.java    # Main class to execute tests with Cucumber
│   ├── steps                       # Steps for navigation flows and validations
│   │   ├── Hooks.java              # Cucumber hooks, executed before and after scenarios (setup/teardown)
│   │   ├── InitialSteps.java
│   │   └── RegisterSteps.java
│   └── support
│       └── BrowserFactory.java     # Class responsible for creating and managing browser instances
└── resources
├── features                        # Test scenarios written in Gherkin
│   ├── Initial.feature
│   ├── Login.feature
```