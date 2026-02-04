Lost and Found Application (Campus Asset Recovery System)

---

Problem Statement

In large campuses such as colleges and universities, lost personal items (ID cards, wallets, books, electronics, etc.) are a frequent issue. The absence of a centralized digital system leads to inefficiencies, delays, and misuse of found items.

The Lost & Found Application aims to solve this problem by providing a secure, transparent, and real-time platform where:

Found items can be reported with images and descriptions

Owners can easily identify and reclaim their belongings

Unclaimed items are responsibly handled by the institution

A structured revenue-sharing mechanism benefits the finder, college, and admin

---

Project Overview

Project Name: Lost & Found App (Codename: Found)

Platform: Mobile Application (Android / iOS) + Web Admin Portal

Target Users: Students, Faculty, College Administration

Domain: Campus Utility / Asset Management

Payment Model: Micro-payment based access (₹11 claim fee)

---

Core Features

User Registration & Authentication

Secure sign-up using college email or phone number

Role-based access for Students, Staff, and Admin

JWT-based authentication for API security


Post Found Item

Upload item images

Add detailed descriptions and identification marks

Location tagging (hostel, classroom, library, etc.)


Claim Lost Item

Owners can browse and search items

To view finder’s contact details, user pays ₹11

Contact details revealed only after successful payment


Unclaimed Items & Marketplace

Items unclaimed for 1–2 months are listed for sale

Price set by college or finder

Supports buying used items directly within the app


Payment & Revenue Distribution

Integrated online payments

Revenue split:

10% → Admin

40% → College

40% → Finder



Admin Dashboard

Monitor all item postings and claims

Approve or reject listings

Manage disputes and item ownership

Oversee payments and reports


Notifications

Real-time alerts for:

New found items

Claim approvals

Sale listings

Payment confirmations




---

System Architecture

Frontend (Mobile): Flutter (Cross-platform Android & iOS)

Frontend (Web): React.js (Admin Dashboard)

Backend: Node.js with Express

Database: Firebase / MySQL

Storage: Firebase Storage / AWS S3

Authentication: OAuth + JWT

Payments: Razorpay

Hosting: Firebase / AWS / Heroku



---

Workflow Explanation

1. User finds an item on campus


2. Item is posted with image & description


3. Owner searches and identifies the item


4. Owner pays ₹11 to unlock finder details


5. Item is returned successfully
OR


6. If unclaimed for 1–2 months → item listed for sale


7. Sale amount distributed as per revenue model



---

Security & Privacy

User contact details are hidden by default

Details shared only after verified payment

Secure token-based API communication

Online payments only (no cash handling)



---

Future Enhancements

AI-based Image Matching to auto-suggest item matches

In-app Chat System between finder and owner

Push Notifications

Expansion beyond campus (cafes, libraries, public spaces)

Analytics dashboard for college administration



---

Installation & Running the Project

Prerequisites

Git

Node.js

Flutter SDK

Firebase account

MySQL (optional)


Clone Repository

git clone https://github.com//lost-and-found-app.git

Backend Setup

cd backend
npm install
npm start

Frontend (Flutter)

flutter pub get
flutter run

Web Admin Dashboard

cd admin-panel
npm install
npm start


---

Conclusion

The Lost & Found Application is a real-world, scalable, full-stack system designed to solve a practical campus problem while incorporating:

Secure authentication

Payment gateway integration

Role-based access

Revenue sharing logic

Admin-level controls


This project demonstrates strong skills in system design, backend development, frontend integration, and real-world problem solving, making it highly suitable for Software Development Engineer (SDE) roles.