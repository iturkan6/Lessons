<h1 dir="auto"><a href="#a-happy-family-mini-project"></a>&quot;A happy family&quot; Mini-Project</h1>
<p dir="auto">Assignment: describe the structure of a family, take into account that each member has blood relatives and the composition of the family tends to fluctuate. Before you get to the &quot;Collections&quot; topic - all the homeworks must be done using arrays (<strong>DO NOT</strong> use &nbsp;<code>List</code>, <code>Set</code>, <code>Map</code> interfaces, unless the assignment says you to.</p>
<h1 dir="auto"><a href="#objects"></a>Objects</h1>
<h2 dir="auto"><a href="#task"></a>Task</h2>
<p dir="auto">Create and describe these classes: &nbsp;(<code>Pet</code>), (<code>Human</code>). Create constructors for the classes you have written. Create the <code>Main</code> class and the examples of the described classes in it.</p>
<h4 dir="auto"><a href="#technical-requirements"></a>Technical requirements:</h4>
<ul dir="auto">
    <li>Describe the Pet with the following fields:<ul>
            <li>(<code>species</code>)</li>
            <li>(<code>nickname</code>)</li>
            <li>(<code>age</code>)</li>
            <li>(<code>trickLevel</code>) (a whole number from 1 to 100)</li>
            <li>(<code>habits</code>) (array of strings)</li>
        </ul>
    </li>
    <li>Describe and implement the following methods for Pet:<ul>
            <li>(<code>eat</code>) (method displays a message &apos;I am eating&apos;)</li>
            <li>(<code>respond</code>) (method displays a message &apos;Hello, owner. I am - [the name of the pet]. I miss you!&apos;)</li>
            <li>(<code>foul</code>) (method displays a message &apos;I need to cover it up&apos;)</li>
        </ul>
    </li>
    <li>Describe Human with the following fields:<ul>
            <li>(<code>name</code>)</li>
            <li>(<code>surname</code>)</li>
            <li>date of birth (<code>year</code>), number</li>
            <li>IQ level (<code>iq</code>) (a whole number from 1 to 100))</li>
            <li>(<code>pet</code>) (object type Pet)</li>
            <li>(<code>mother</code>) (object type Human)</li>
            <li>(<code>father</code>) (object type Human)</li>
            <li>Schedule of non-working activities (<code>schedule</code>) (2d array: [day of the week] x [type of the activity])</li>
        </ul>
    </li>
    <li>Describe and implement the following methods for Human:<ul>
            <li>(<code>greetPet</code>)(&quot;Hello, [the name of the pet]&quot;)</li>
            <li>(<code>describePet</code>): (display the information about your pet: &quot;I have a [species], he is [age] years old, he is [very sly]&gt;50/[almost not sly]&lt;50&quot;.</li>
        </ul>
    </li>
    <li>Redefine the &nbsp;<code>toString()</code>method for bot classes;<ul>
            <li>The Pet class must display the following message: <code>dog{nickname=&apos;Rock&apos;, age=5, trickLevel=75, habits=[eat, drink, sleep]}</code>, where <code>dog</code> = species;</li>
            <li>The Human class must display the following message: <code>Human{name=&apos;Michael&apos;, surname=&apos;Karleone&apos;, year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname=&apos;Rock&apos;, age=5, trickLevel=75, habits=[eat, drink, sleep]}}</code></li>
        </ul>
    </li>
    <li>In class <code>Pet</code>create constructors:<ul>
            <li>constructor which describes the pet&apos;s species an nickname</li>
            <li>constructor which describes all the fields for the pet</li>
            <li>empty constructor</li>
        </ul>
    </li>
    <li>In class<code>Human</code>create constructors:<ul>
            <li>constructor which describes the name, surname and the date of birth</li>
            <li>constructor which describes the name, surname, date of birth, father and mother</li>
            <li>constructor which describes all the fields</li>
            <li>empty constructor</li>
        </ul>
    </li>
    <li>In the Main class create several families, so that every class uses all the available constructors. Display data about every person.</li>
    <li>In the Main class: create a mother, father, child and his pet. Specify all the needed links (for child to his parents and to the pet), in order to form a full family. Call all available methods for the child (including &nbsp;<code>toString()</code> method) and his pet.</li>

<h4 dir="auto"><a href="#%D0%BB%D0%B8%D1%82%D0%B5%D1%80%D0%B0%D1%82%D1%83%D1%80%D0%B0"></a>Luterature:</h4>
<ul dir="auto">
    <li><a href="https://www.geeksforgeeks.org/classes-objects-java/" rel="nofollow noreferrer noopener">Classes and objects</a></li>
    <li><a href="https://www.w3schools.com/java/java_constructors.asp" rel="nofollow noreferrer noopener">Constructors</a></li>
    <li><a href="https://www.dummies.com/programming/java/what-is-an-initializer-in-java/" rel="nofollow noreferrer noopener">Initializers</a></li>
</ul>