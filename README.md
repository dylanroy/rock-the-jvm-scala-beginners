# Rock The JVM Scala for Beginners
I purchased a number of classes that I will be going through to progress my knowledge on a number of topics. To build out a knowledgebase of my learnings I will be keeping this repository up to date, and tagged with each section as I progresss through the class.

## Class Notes
Below are class notes that will be broken out by section, and lecture. Each section will be tagged so that the history of the repository, and it associated code can be preserved.
### Section 1: The Absolute Scala Basics
#### Lecture 1: Getting Started
Setting up project skeleton in IntelliJ.  
[Go To](https://github.com/dylanroy/rock-the-jvm-scala-beginners/tree/section.1-lecture.1)

#### Lecture 2: Values, Variables, and Types
**Takeaways**
   - vals are immutable therefore cannot be reassigned
   - variables are mutable and can be reassigned
   - this reassignment is referred to as a side effect
   - types can be inferred
   - prefer vals over vars
   - all vals and vars have types
   - compiler automatically infers types when omitted
   - learned how to use basic types
     - Boolean
     - Int, Long, Double
     - String

[Go To](https://github.com/dylanroy/rock-the-jvm-scala-beginners/tree/section.1-lecture.2)

#### Lecture 3: Expressions
**Takeaways**
  - Basic expressions: operators
  - If in Scala is an expression
  - Code blocks in scala are expressions
    - The value of a code block is the value of it's last expression
  - Expressions vs. Instructions
    - Instructions are executed (think Java)
    - Expressions are evaluated (Scala)
  - Do not use while loops in your Scala code

[Go To](https://github.com/dylanroy/rock-the-jvm-scala-beginners/tree/section.1-lecture.3)

## Commit Message Guide
**Commit Message Format**
```
feat: add hat wobble
^--^  ^------------^
|     |
|     +-> Summary in present tense.
|
+-------> Type: chore, docs, feat, fix, refactor, style, or test.
```


**Examples**
```
chore: add Oyster build script
docs: explain hat wobble
feat: add beta sequence
fix: remove broken confirmation message
refactor: share logic between 4d3d3d3 and flarhgunnstow
style: convert tabs to spaces
test: ensure Tayne retains clothing
```
## References
[Class Github Repository](https://github.com/rockthejvm/udemy-scala-beginners)  
[Personal Access Token Instructions](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/)