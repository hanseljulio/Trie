# Trie
* Binary tree testing
* Created June 7th 2019

-------------------------------------------------------------------------------

## Overview
* This is an exercise for the implementation of binary trees as well as JUnit testing
* JUnit is made specifically for the testing of the three classes (EntryNode, Tree, Trie)

-------------------------------------------------------------------------------

### Classes
1. EntryNode.java
 * Class contains data structure for the nodes
 * Constructors:
   * EntryNode(char letter)
     * The constructor will create an EntryNode containing a letter and is not a terminal
   * EntryNode(char letter, boolean isTerminal)
     * This constructor will create an EntryNode containing a letter and isTerminal
 * Functions:
   * getChild(Character data)
     * This function accepts a character and returns a node from the tree with an EntryNode data type
   * addChild(char letter, boolean isTerminal)
     * This function will add a child to the tree
   * isTerminal()
     * This function checks if letter is a terminal
   * setTerminal()
     * This function will set a letter to be a terminal
   * equals(Object obj)
     * This function checks for equality between two EntryNodes
   * toString()
     * This function returns the letter as a string
   * subtreeToString(String prefix, boolean isTail)
     * This function prints the result as a tree
     
     
2. Tree.java - 
 * Class contains data structure for the root
 * Functions:
   * getRoot()
     * This function returns the root of the tree as an EntryNode data type 
   * toString()
     * This function returns the root as a string


3. Trie.java - 
 * Class contains data structure for the tree and the main driver
 * Functions:
   * toString()
     * This function returns the tree as a string
   * addWords(List< String > words)
     * This function adds multiple words into the tree
   * insert(String word)
     * This function inserts a word into the tree
   * remove(String word)
     * This function removes a word from the tree
   * contains(String potentialWord)
     * This function checks if the tree contains a word
   
   
4. TrieTests.java
  * Class contains various JUnit tests



