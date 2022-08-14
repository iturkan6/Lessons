<h1 dir="auto">The &quot;Happy Family&quot; Mini-Project strikes again!</h1>
<p dir="auto">The idea of the project is to describe the structure of a family while taking into account that every human has relatives and the family members can change over time.</p>
<h1 dir="auto"><a href="#getterssetters"></a>Getters/setters</h1>
<h2 dir="auto"><a href="#the-task"></a>The task:</h2>
<p dir="auto">Improve the project:</p>
<ul dir="auto">
    <li>
        <p>Make all the fields private</p>
    </li>
    <li>
        <p>Create and describe a Family class. Let&apos;s say that a family can be created by 2 people who do not fall apart and can give birth to/adopt their children. Children can grow up and leave the family, creating their own.</p>
    </li>
    <li>
        <p>Redefine <code>equals()</code> and <code>hashCode()</code> methods in all project classes.</p>
    </li>
    <li>
        <p>Add the method <code>deleteChild(Human child)</code> to the <code>Family</code> class, while taking the availability of these methods into account.</p>
    </li>
</ul>
<h4 dir="auto"><a href="#technical-requirements"></a>Technical requirements:</h4>
<ul dir="auto">
    <li>Declare all the fields of existing classes as private. Add getters and setters, refactor the existing methods to reflect the changes.</li>
    <li>Add the following fields of the <code>Family</code>: class<ul>
            <li>mother - <code>mother</code> (type <code>Human</code>)</li>
            <li>father - <code>father</code> (type <code>Human</code>)</li>
            <li>children - <code>children</code> (array <code>Human</code>)</li>
            <li>pet - <code>pet</code> (type <code>Pet</code>)</li>
        </ul>
    </li>
    <li>Add getters and setters, redefine <code>toString</code> so that it would show all the info about all the family members</li>
    <li>Make a constructor in the <code>Family</code>
        <ul>
            <li>The only condition for creating a new family is the presence of two parents, with the parents being referred to the current new family and the family being created with an empty array of children.</li>
        </ul>
    </li>
    <li>Refactor the <code>Human</code> class, while taking the <code>Family</code>structure into account:<ul>
            <li>Remove all information duplicated in the Family class from Human (Human should only keep the information that describes itself)</li>
            <li>add the <code>family</code> (type <code>Family</code>) field (теперь оно хранит всю информацию о семейных данных человека)</li>
            <li>add necessary getters, setters, constructors; remove irrelevant designers and methods; make refactoring of the &nbsp;<code>to welcome the favourite</code>, <code>to describe the favourite</code>, <code>to feed</code> methods</li>
            <li>refactor the <code>toString()</code> method. It should output info in the following format: <code>Human{name=&apos;Name&apos;, surname=&apos;Surname&apos;, year=1, iq=1, schedule=[[day, task], [day_2, task_2]]}</code></li>
            <li>Add the following methods in <code>Family</code>:</li>
            <li>add a child - <code>addChild</code> (accepts the <code>Human</code> type and adds it to the children array; adds a link to the current family to the child)</li>
            <li>delete a child - &nbsp;<code>deleteChild</code> (accepts and array index and deltes the following element; returns a boolean value - was the element deleted or not)</li>
            <li>get the amount of family members - <code>countFamily</code> (the parents in the family never change. If the parents do change - it&apos;s a different family)</li>
            <li>redefine the <code>toString()</code> method</li>
            <li>Decide which fields to use for comparison in the <code>equals()</code> method (for example, animal habits may change).</li>
        </ul>
    </li>
</ul>
<p dir="auto">Methods should not only add/remove items to the <code>Human</code> array, but also make the necessary modifications (to the added/removed item to set/remove the link to the current family). When deleting an item, there should be no empty spaces in the array - a new array should be created.</p>
<h4 dir="auto"><a href="#%D0%BB%D0%B8%D1%82%D0%B5%D1%80%D0%B0%D1%82%D1%83%D1%80%D0%B0"></a>Literature:</h4>
<ul dir="auto">
    <li><a href="https://www.geeksforgeeks.org/encapsulation-in-java/" rel="nofollow noreferrer noopener">Encapsulation. Getters/setters</a></li>
    <li>[Method Overloading(<a href="https://beginnersbook.com/2013/05/method-overloading/" rel="nofollow noreferrer noopener">https://beginnersbook.com/2013/05/method-overloading/</a>)</li>
    <li><a href="https://www.mkyong.com/java/java-how-to-overrides-equals-and-hashcode/" rel="nofollow noreferrer noopener">Overriding equals() and hashcode()</a></li>
    <li><a href="https://www.javaworld.com/article/3305792/learn-java/java-challengers-4-comparing-java-objects-with-equals-and-hashcode.html" rel="nofollow noreferrer noopener">Comparing Java objects with equals() and hashcode()</a></li>
    <li><a href="https://www.intigua.com/blog/good-and-bad-equals-and-hashcode" rel="nofollow noreferrer noopener">Java Best Practices: equals() and hashCode()</a></li>
    <li><a href="https://softwareengineering.stackexchange.com/questions/228242/working-with-static-constructor-in-java" rel="nofollow noreferrer noopener">Java static constructor</a></li>
    <li><a href="https://www.quora.com/What-is-difference-between-non-static-block-and-instance-initialize-block" rel="nofollow noreferrer noopener">Static and non-static initialization blocks</a></li>
</ul>