# 🗳️ Votezy – Smart & Secure Online Voting System

**Votezy** is a Spring Boot-based web application designed to deliver a fast, transparent, and secure digital voting experience. Built as a final-year major project, Votezy digitizes the traditional election process by allowing voters and candidates to register, cast votes, and view real-time election results — all through an intuitive online platform.

---

## 🚀 Features

- 🔐 **Secure Authentication**
  - Voter registration with name and email
  - Candidate registration with name and party
  - Auto-generated unique IDs

- 🗳️ **Voting System**
  - Only registered voters can vote
  - Votes can only be cast once per voter
  - Voters cannot vote for invalid or unlisted candidates

- 📊 **Election Results**
  - Live vote count and result declaration
  - Winner displayed with total votes

- ✅ **Edge Case Handling**
  - Prevents duplicate voting
  - Blocks non-registered users
  - Rejects votes for non-existent candidates

---

## 🧩 Project Modules

| Module              | Description                                |
|---------------------|--------------------------------------------|
| Voter Module        | Register & manage voter information        |
| Candidate Module    | Register & manage candidates and parties   |
| Voting Module       | Cast votes and track participation         |
| Election Result     | Calculate and display election outcomes    |

---

## 🗃️ Database Schema

- **Voter Table**
  - ID, Name, Email, hasVoted

- **Candidate Table**
  - ID, Name, Party, Vote Count

- **Vote Table**
  - ID, Voter ID, Candidate ID

- **ElectionResult Table**
  - ID, Winner ID, Total Votes

---

## 🛠️ Tech Stack

- **Frontend:** HTML, CSS, Bootstrap (optional for styling)
- **Backend:** Java 17+, Spring Boot, Spring Core, Spring Data JPA
- **Database:** MySQL
- **APIs:** RESTful APIs for modular interaction
- **Tools:** Eclipse / IntelliJ, Postman, Lombok

---

## 💡 How It Works

1. **Registration Phase**
   - Voters and candidates register via forms
   - Entries are validated and stored in MySQL

2. **Voting Phase**
   - Registered voters select a candidate
   - Vote is recorded, voter marked as “voted”

3. **Result Declaration**
   - System counts all votes
   - Winner is calculated and displayed

---


## 📈 Future Enhancements

- OTP or Aadhaar-based secure login  
- Admin control panel for managing elections  
- Blockchain integration for tamper-proof voting  
- SMS/Email notification system  
- Graphical vote count dashboard



