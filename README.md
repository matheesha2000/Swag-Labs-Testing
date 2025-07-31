# 🧪 Swag Labs UI Automation Testing

Automated UI testing project for the [Swag Labs Demo Website](https://www.saucedemo.com/) using **Java**, **Selenium WebDriver**, and **TestNG**. This project covers key e-commerce flows like login, product interaction, cart management, and checkout.

---

## 📌 Project Overview

This project simulates user interactions on the Swag Labs e-commerce site and verifies that critical functionalities work as expected. It was implemented without Page Object Model (POM) for simplicity and focuses on direct test logic using standard Java methods.

---

## 🚀 Features Tested

- ✅ Login and logout functionality
- ✅ Product listing and sorting
- ✅ Add/remove products from cart
- ✅ Cart content validation
- ✅ Checkout workflow
- ✅ Error handling and validation messages

---

## 🛠️ Tech Stack

- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Testing Framework:** TestNG  
- **Build Tool:** Maven  
- **Reporting:** TestNG HTML Reports  
- **IDE:** IntelliJ IDEA / Eclipse

---

## 📁 Project Structure

swag-labs-testing/
├── .idea/ # IDE configuration files (IntelliJ IDEA)
├── src/
│ ├── main/ # (Optional) main source code (if any)
│ └── test/
│ └── java/
│ └── TestNG/
│ └── SwagLabsWebTest.java # Test class(es)
├── target/ # Compiled files and build output
├── .gitignore # Git ignore rules
└── pom.xml # Maven dependencies and build config



## ▶️ How to Run the Tests

1. **Clone the repository**
   ```bash
   git clone https://github.com/matheesha2000/Swag-Labs-Testing.git
   cd Swag-Labs-Testing
Import the project into your IDE
Use IntelliJ IDEA, Eclipse, or another Java IDE with Maven support.

Check WebDriver Setup

Ensure ChromeDriver (or your preferred driver) is compatible with your browser version and accessible in your system path.

Execute the test suite

bash
Copy
Edit
mvn test
Or run testng.xml directly from your IDE.

📊 Reports
After test execution, open the following file to view the report:

bash
Copy
Edit
./test-output/index.html
It includes pass/fail status, test details, and logs for each test case.

🧪 Example Test Classes
LoginTest.java: Validates login and logout functionality

CartTest.java: Verifies adding and removing items from the cart

CheckoutTest.java: Performs a complete checkout process

📎 GitHub Repository
🔗 https://github.com/matheesha2000/Swag-Labs-Testing

👨‍💻 Author
Matheesha
📧 https://www.linkedin.com/in/matheesha-kalatuwawa/
🔗 https://github.com/matheesha2000

📃 License
This project is licensed under the MIT License.

yaml
Copy
Edit

---

Let me know if you'd like help customizing this with badges (like `build passing`, `Java version`, etc.) or CI integration (like GitHub Actions).




Ask ChatGPT
