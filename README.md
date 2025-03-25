# java-atminterface
- The ATM Management System is a console-based Java application that simulates essential ATM operations like withdrawal, deposit, and balance inquiry. The system maintains a minimum balance of ₹500, and if the balance drops below this threshold, a ₹50 fine is applied. Users can choose from multiple options to perform different transactions.

🎮 **Features:**
**Withdraw Money:**

- Allows users to withdraw funds.

- Deducts a fine if the balance drops below ₹500 after withdrawal.

- Prevents withdrawal if the balance is insufficient.

**Deposit Money:**

- Enables users to deposit money into their account.

- Deducts a fine of ₹50 if the balance is below ₹500 before depositing.

**Check Balance:**

- Displays the current account balance after each transaction.

**Exit Option:**

- Allows users to terminate the session after completing their operations.

⚙️ **How It Works:**
- Users select an option to perform desired transactions.

- The system validates each operation based on the account balance and minimum balance requirements.

- If conditions are not met, the system displays appropriate messages and prevents invalid operations.

📚 **Technologies Used:**
- Java: Core logic and OOP concepts

- Scanner Class: To handle user input

- Conditional Statements: For transaction logic and fine application

- This project effectively demonstrates basic banking operations and introduces error handling and balance validation in a real-world ATM scenario. 🎯
