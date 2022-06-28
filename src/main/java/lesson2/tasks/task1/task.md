<h1 dir="auto">Working with strings</h1>
<h2 dir="auto"><a href="#the-task"></a>The task:</h2>
<p dir="auto">You will need to write a &quot;week planner&quot; program</p>
<h4 dir="auto"><a href="#technical-requirements"></a>Technical requirements</h4>
<ul dir="auto">
    <li>
        <p>Create a two-dimensional array of 7x2 strings <code>String[][] scedule = new String[7][2]</code></p>
    </li>
    <li>
        <p>Fill the matrix with the following values: weekday + the main task for the current day: <code>scedule[0][0] = &quot;Sunday&quot;;</code><br><code>scedule[0][1] = &quot;do home work&quot;;</code><br><code>scedule[1][0] = &quot;Monday&quot;;</code><br><code>scedule[1][1] = &quot;go to courses; watch a film&quot;;</code></p>
        <ul>
            <li>Using a loop and a switch operator, request the user to input a weekday in the console. Depending on the input:</li>
        </ul>
        <ol>
            <li><code>Please, input the day of the week:&nbsp;</code><br>The user enters a correct weekday (e.g. <code>Monday</code>) , the program outputs: <code>Your tasks for Monday: go to courses; watch a film.</code>; Then the program goes to the next iteration.</li>
            <li><code>Please, input the day of the week:&nbsp;</code> The user enters a non-valid weekday (e.g.&nbsp;<code>%$=+!11=4</code>)<br>the program outputs: <code>Sorry, I don&apos;t understand you, please try again.</code>; the program goes to the next iteration until the user enters a valid weekday 3)<code>Please, input the day of the week:&nbsp;</code> The user enters <code>exit</code><br>The program goes out of the loop</li>
        </ol>
    </li>
    <li>
        <p>The task must be done using arrays (<strong>DON&apos;T</strong> use interfaces<code>List</code>, <code>Set</code>, <code>Map</code>).</p>
        <p>Please note: the program should accept commands in both lower case (<code>Monday</code>) and upper case (<code>MONDAY</code>) and take into account that the user may have accidentally entered a space after the day of the week.</p>
    </li>
</ul>

<h4 dir="auto"><a href="#the-literature"></a>The literature:</h4>
<ul dir="auto">
    <li><a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html?is-external=true" rel="nofollow noreferrer noopener">The String class documentation (it&apos;s not necessary to read everything, just read the methods you need):&nbsp;</a></li>
    <li><a href="https://metanit.com/java/tutorial/7.2.php" rel="nofollow noreferrer noopener">The main operations with strings</a></li>
    <li><a href="https://www.tutorialspoint.com/java/lang/string_contains.htm" rel="nofollow noreferrer noopener">A validation if a string contains a sub-string</a></li>
</ul>