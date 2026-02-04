Lost & Found Application

[![](https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=react&logoColor=black)](https://reactjs.org) 
[![](https://img.shields.io/badge/Node.js-339933?style=for-the-badge&logo=node.js&logoColor=white)](https://nodejs.org) 
[![](https://img.shields.io/badge/Express.js-000000?style=for-the-badge&logo=express&logoColor=white)](https://expressjs.com) 
[![](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)](https://www.mongodb.com) 
[![](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)](https://developer.mozilla.org/en-US/docs/Web/JavaScript) 
[![](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)](https://developer.mozilla.org/en-US/docs/Web/HTML) 
[![](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)](https://developer.mozilla.org/en-US/docs/Web/CSS) 
[![](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com) 
[![](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com) 
[![](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)](https://figma.com)

<img src="https://github.com/baleraopavankumar/Lost_and_Found_Application/blob/main/1.png"/>

---

Problem Statement

In a college campus, a large number of personal items such as ID cards, books, wallets, and electronic devices are lost every day. Due to the absence of a centralized system, it becomes difficult for owners to retrieve their belongings. The Lost & Found Application addresses this problem by allowing users to post details of found items and enabling owners to reclaim them efficiently.

This system helps in improving transparency, accountability, and recovery rate of lost items while also introducing a structured process for handling unclaimed items within the campus.


---

Full Stack Application Development

Our approach involves building a full-stack application that allows users to report found items, search for lost items, and claim ownership securely. The application consists of a mobile app for users and a web-based admin dashboard for management and monitoring.

The backend handles authentication, item listings, payments, and notifications, while the frontend provides a user-friendly interface for interacting with the system. The complete workflow ensures smooth communication between finders, owners, and administrators.


---

Authentication and User Management

The application uses secure authentication mechanisms to ensure that only authorized users can access the platform. Users register using their college credentials or phone number, ensuring authenticity.

Once authenticated, users are assigned roles such as Student, Staff, or Admin, each with different access levels. Sensitive information such as the finder’s contact details is hidden and revealed only after successful payment.


---

Payment Integration

To prevent misuse and ensure serious claims, the application introduces a small claim fee of ₹11. When an owner wishes to view the contact details of the person who found the item, the payment must be completed successfully.

A secure payment gateway is integrated to handle all transactions. The collected amount is split among the Admin, College, and Finder, ensuring fair compensation and sustainability of the system.


---

Database Design

The database stores structured information related to users, items, payments, and claims. Each item listing contains details such as image, description, identification marks, and status (claimed/unclaimed).

Relationships between users and items are maintained to track ownership, claims, and sales of unclaimed items. This structured approach ensures data consistency and easy retrieval.

<img src="https://github.com/baleraopavankumar/Lost_and_Found_Application/blob/main/3.png"/>
---

Item Lifecycle Management

If an item is not claimed within 1–2 months, it is automatically marked as unclaimed and transferred to the college management or finder based on policy. These items are then listed for sale within the application.

Interested users can purchase these items through online payment, and the revenue generated is distributed according to predefined rules.

<img src="https://github.com/baleraopavankumar/Lost_and_Found_Application/blob/main/2.png"/>
---

Admin Dashboard

The admin dashboard provides complete control over the system. Administrators can view all posted items, approve listings, manage disputes, and monitor transactions.

The dashboard also provides insights into claimed items, unclaimed items, and revenue distribution, ensuring transparency and effective management.


---

Results

The Lost & Found Application significantly improves the recovery rate of lost items on campus. By digitizing the process and introducing secure payments and role-based access, the system minimizes manual effort and misuse.

The structured workflow ensures that items are either returned to their rightful owners or responsibly managed by the institution.

<img src="https://github.com/baleraopavankumar/Lost_and_Found_Application/blob/main/4.png"/>
---

Directions to Download the Repository and Run the Project

1. Download and install Git from https://git-scm.com/downloads.


2. Right-click on the folder where you want to download the repository and select Git Bash Here.


3. Clone the repository using:



git clone https://github.com/baleraopavankumar/lost-and-found-app.git

4. After cloning, navigate to the project directory.


5. Install backend dependencies:



npm install
npm start

6. For the mobile application, install Flutter dependencies:



flutter pub get
flutter run

7. The web admin dashboard can be started using:



npm start

8. Once the servers are running, you can access the application and explore the features.



That’s it. You should now be able to run and understand the project.
