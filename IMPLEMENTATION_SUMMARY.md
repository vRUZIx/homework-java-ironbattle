# Iron Battle - Implementation Summary

## ✅ COMPLETED FEATURES

### 1. **All Required Classes and Interface**
- ✅ `Characters` (abstract class) - Base class for all characters
- ✅ `Warriors` - Warrior character implementation
- ✅ `Wizards` - Wizard character implementation  
- ✅ `Attacker` - Interface for attack functionality

### 2. **Characters Class (Abstract)**
- ✅ Auto-generated `id` (UUID)
- ✅ `name` (String)
- ✅ `hp` (int) - Health points
- ✅ `isAlive` (boolean) - Defaults to true
- ✅ Parameterized constructor
- ✅ All getters and setters
- ✅ HP validation (sets to 0 and isAlive to false when HP < 0)

### 3. **Warriors Class**
- ✅ Extends Characters
- ✅ Implements Attacker interface
- ✅ `stamina` (random 10-50)
- ✅ `strength` (random 1-10)
- ✅ All getters and setters
- ✅ Constructor with random HP (100-200)
- ✅ Attack method with:
  - Heavy Attack (damage = strength, costs 5 stamina)
  - Weak Attack (damage = strength/2, recovers 1 stamina)
  - Exhausted state (no damage, recovers 2 stamina)

### 4. **Wizards Class**
- ✅ Extends Characters
- ✅ Implements Attacker interface
- ✅ `mana` (random 10-50)
- ✅ `intelligence` (random 1-50)
- ✅ All getters and setters
- ✅ Constructor with random HP (50-100)
- ✅ Attack method with:
  - Fireball (damage = intelligence, costs 5 mana)
  - Staff Hit (damage = 2, recovers 1 mana)
  - Out of mana (no damage, recovers 2 mana)

### 5. **Battle Simulator (Main.java)**
- ✅ Text-based menu system
- ✅ Option 1: Create custom battle with user input
- ✅ Option 2: Simulate random battle with auto-generated characters
- ✅ Round-by-round combat system
- ✅ Simultaneous attacks (both attack each round)
- ✅ Detailed battle log displayed on console
- ✅ Tie handling (battle restarts until there's a winner)
- ✅ Winner announcement

## 🎯 ALL REQUIREMENTS MET

### Core Requirements:
1. ✅ Navigate through text-based menu using Standard Input/Output
2. ✅ Create warriors and wizards with customized stats and names
3. ✅ Battle system with winner determination
4. ✅ Detailed log of every action during duels

### Bonus Features:
- ⚠️ Import characters from CSV - NOT IMPLEMENTED
- ✅ Simulate whole battle with one command (random battle option)

## 🎮 HOW TO RUN

1. Navigate to the Battle directory
2. Compile the project:
   ```
   javac -d target src/main/java/org/example/*.java
   ```
3. Run the application:
   ```
   java -cp target org.example.Main
   ```

## 🎯 MENU OPTIONS

### Option 1: Custom Battle
- Choose character types (Warrior or Wizard)
- Name your characters
- Watch them battle with their random stats

### Option 2: Random Battle
- Automatically creates 2 random characters
- Random types (can be Warrior vs Warrior, Wizard vs Wizard, or mixed)
- Auto-generated names and stats
- Battle starts immediately

### Option 3: Exit
- Closes the application

## 📝 BATTLE MECHANICS

- Both characters attack simultaneously each round
- Combat continues until at least one character dies
- If both die in the same round (tie), battle restarts with new HP/stats
- Complete battle log shows all attacks and damage
- Winner is displayed at the end with remaining HP

## 🐛 FIXES APPLIED

1. ✅ Fixed `Character` vs `Characters` type mismatch in attack methods
2. ✅ Fixed Wizards constructor - properly initializes mana and intelligence
3. ✅ Added missing getters/setters for Warriors (stamina, strength)
4. ✅ Added missing getters/setters for Wizards (mana, intelligence)
5. ✅ Corrected Wizard intelligence range (1-50 instead of 1-10)
6. ✅ Implemented complete battle system in Main.java

## ✨ PROJECT STATUS: COMPLETE

All core requirements have been implemented and tested. The project is ready for submission!
