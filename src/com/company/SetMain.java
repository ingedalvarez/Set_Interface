package com.company;

import java.util.*;

public class SetMain {

    public static void main(String[] args) {
        /*
         * A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction.
         * The Set interface contains only methods inherited from Collection and adds the restriction that duplicate
         * elements are prohibited.
         * Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set
         * instances to be compared meaningfully even if their implementation types differ. Two Set instances are
         * equal if they contain the same elements.*/

        Collection<Integer> intCol = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7);
        //new collection with all duplicates eliminated.
        Collection<Integer> intSet = new HashSet<>(intCol);
        System.out.println("Original collection: " + intCol);
        System.out.println("New collection without duplicates: " + intSet);

        System.out.println("Remove duplicates with static method removeDuplicates: " + removeDuplicates(intCol));

        Collection<String> strCol = Arrays.asList("Edward", "Edward", "Alvarez", "Alvarez", "Franco");
        System.out.println("Original collection of Strings: " + strCol);

        Collection<String> strColSet = removeDuplicates(strCol);
        System.out.println("Another example of removeDuplicates: " + strColSet);

        /*
        * Set Interface Basic Operations

        The size operation returns the number of elements in the Set (its cardinality). The isEmpty method does exactly what
        * you think it would. The add method adds the specified element to the Set if it is not already present and returns
        * a boolean indicating whether the element was added. Similarly, the remove method removes the specified element
        * from the Set if it is present and returns a boolean indicating whether the element was present. The iterator
        * method returns an Iterator over the Set.
        * */

        System.out.println("strColSet elements = " + strColSet);
        int sizeStrColSet = strColSet.size();
        boolean isEmptyStrColSet = strColSet.isEmpty();
        boolean addToStrColSet = strColSet.add("1984");

        System.out.println("Size strColSet = " + sizeStrColSet);
        System.out.println("Is empty strColSet = " + isEmptyStrColSet);
        System.out.println("1984 added to strColSet = " + addToStrColSet);
        System.out.println("strColSet update =" + strColSet);
        boolean removeStrColSet = strColSet.remove("1984");
        System.out.println("1984 was remove to strCol = " + removeStrColSet);

        /*
        * Set Interface Bulk Operations

      Bulk operations are particularly well suited to Sets; when applied, they perform standard set-algebraic
    * operations. Suppose s1 and s2 are sets. Here's what bulk operations do:

    s1.containsAll(s2) — returns true if s2 is a subset of s1.
    * (s2 is a subset of s1 if set s1 contains all the elements in s2.)
    s1.addAll(s2) — transforms s1 into the union of s1 and s2.
    * (The union of two sets is the set containing all the elements contained in either set.)
    s1.retainAll(s2) — transforms s1 into the intersection of s1 and s2.
    * (The intersection of two sets is the set containing only the elements common to both sets.)
    s1.removeAll(s2) — transforms s1 into the (asymmetric) set difference of s1 and s2.
    * (For example, the set difference of s1 minus s2 is the set containing all the elements found in s1 but not in s2.)

        * */

        /*
        * Set Interface Array Operations

          The array operations don't do anything special for Sets beyond what they do for any other Collection.
        * These operations are described in The Collection Interface section.
        * */


    }

    public static <E> Set<E> removeDuplicates(Collection<E> c) {
        return new LinkedHashSet<>(c);
    }
}
