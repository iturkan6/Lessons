<h1 dir="auto">The &quot;Happy Family&quot; Mini-Project strikes again! (again)</h1>
<p dir="auto">The idea of the project is to describe the structure of a family while taking into account that every human has relatives and the family members can change over time.</p>
<h1 dir="auto"><a href="#objects-life-cycle-garbage-colector"></a>Object&apos;s life cycle. Garbage colector</h1>
<h2 dir="auto"><a href="#the-task"></a>The task:</h2>
<p dir="auto">Redefine the <code>finalize()</code> method.</p>
<p dir="auto">Improve the project:</p>
<ul dir="auto">
    <li>implement animal species and timetables for extracurricular activities through the <code>enum</code> listings (use the views as you see fit, e.g. <code>CAT</code>, <code>DOG</code>, etc.)</li>
    <li>implement unit-tests for every custom project method that can be covered with tests</li>
</ul>
<h4 dir="auto"><a href="#technical-requirements"></a>Technical requirements:</h4>
<ul dir="auto">
    <li>Redefine the<code>finalize()</code> method in the <code>Family</code>, <code>Human</code>, <code>Pet</code> classes so that they would output a message about the removal of an object before the garbage collector deletes them,</li>
    <li>Create the right amount of loops in the Main class of the <code>Human</code> object so that the garbage collector would start deleting old objects (from 10 thousand untill 10 million, depending on the amount of free ram)</li>
    <li>Create the <code>enum</code> <code>Species</code> with a list of animal types; add the enumeration at your liking; refactor the <code>Pet</code> class - the animal type will changed from the <code>String</code> type to a <code>Species</code> type</li>
    <li>Create <code>enum</code> <code>DayOfWeek</code> with a list of the days of the week (all 7 days); when you fill in the <code>Human</code> schedule (in the <code>main</code> method), use the <code>name()</code> enumeration method, which returns the string representation of the current enumeration.</li>
    <li>Add the following methods, while keeping in mind that you may have both a positive and a negative scenario of the execution:</li>
    <li><code>toString</code>- check if the methods return a specific string for a specific object:<ul>
            <li><code>deleteChild(Human child)</code>- do 2 checks:<ul>
                    <li>check if the child is actually being removed from the <code>children</code> array (if you pass an object that is equivalent to at least one element of the array);</li>
                    <li>check if the <code>children</code> array remains unchanged (if you pass an object that is not equivalent to any array element)</li>
                </ul>
            </li>
            <li><code>deleteChild(int index)</code>- do 2 checks:<ul>
                    <li>check that the child is actually being removed from the <code>children</code> array and the method returns the correct value;</li>
                    <li>check that the <code>children</code> array remains unchanged (if you pass an index outside the index range) and the method returns the correct value;</li>
                </ul>
            </li>
            <li><code>addChild</code> - check that the &nbsp;<code>children</code> array increases by one element and that this element is the passed object with all the necessary references;</li>
            <li><code>countFamily</code> - check if the method returns the correct number of family members</li>
        </ul>
    </li>
    <li>Cover the further project changes with tests.</li>
</ul>
<h4 dir="auto"><a href="#non-obligatory-task-with-advanced-complexity"></a>Non-obligatory task with advanced complexity:</h4>
<ul dir="auto">
    <li><code>enum</code> <code>Species</code>must include a constructor in which you can specify the amount of parameters for a pet.<ul>
            <li>can the animal fly (<code>canFly</code>, boolean)</li>
            <li>how many legs does the enimal have (<code>numberOfLegs</code>, number)</li>
            <li>does the animal have fur (<code>hasFur</code>, boolean)</li>
        </ul>
    </li>
    <li>Add the info above to the <code>toString()</code> method of the <code>Pet</code> class.</li>
    <li>Make tests for <code>equals()</code> и <code>hashcode()</code>: &nbsp;<code>equals()</code> should return <code>true/false</code>, handle all cases according to the <code>equals</code> contract;</li>
</ul>
<h4 dir="auto"><a href="#literature"></a>Literature:</h4>
<ul dir="auto">
    <li><a href="https://www.baeldung.com/java-finalize" rel="nofollow noreferrer noopener" target="_blank">Finalize()</a></li>
    <li><a href="https://www.w3schools.com/java/java_enums.asp" rel="nofollow noreferrer noopener" target="_blank">enum</a></li>
    <li><a href="https://beginnersbook.com/2014/09/java-enum-examples/" rel="nofollow noreferrer noopener" target="_blank">Java Enum Tutorial with examples</a></li>
    <li><a href="https://www.vogella.com/tutorials/JUnit/article.html" rel="nofollow noreferrer noopener" target="_blank">Unit testing using JUnit</a></li>
    <li><a href="https://stackoverflow.com/questions/19330832/setting-up-junit-with-intellij-idea" rel="nofollow noreferrer noopener" target="_blank">Настройка JUnit с помощью IntelliJ IDEA</a></li>
</ul>