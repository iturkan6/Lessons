<h1 dir="auto">Arrays</h1>
<h1 dir="auto"><a href="#the-task-is"></a>The task is</h1>
<p dir="auto">Write a program called &quot;shooting at the square.&quot;</p>
<h4 dir="auto"><a href="#technical-requirements"></a>Technical requirements:</h4>
<ul dir="auto">
    <li>Given a 5x5 square, where the program randomly sets a target.</li>
    <li>Before the game starts, the text is displayed on the screen: <code>All set. Get ready to rumble!</code></li>
    <li>The whole process of the game is processed in an infinite loop.</li>
    <li>The player is asked to enter a line for fire; the program checks that the &nbsp;user enter is a number, and this entered number is in the range of playing field lines (1-5). As long as the player makes mistakes, he will be asked to enter the number again.</li>
    <li>The player is asked to enter a shooting bar (must pass the same check).</li>
    <li>After each shot, the updated game field should be displayed in the console. Cells, where the player has already shot is necessary to note as <code>*&nbsp;</code>.</li>
    <li>The game ends when the target is defeated. At the end of the game, display the phrase in console: <code>You have won!</code>. The target should be marked as <code>x&nbsp;</code>.</li>
    <li>The task must be done using arrays (<strong>DO NOT USE THE INTERFACES</strong> <code>List</code>, <code>Set</code>, <code>Map</code>).</li>
</ul>
<p dir="auto">An example of console output:</p>
<p dir="auto"><code>&nbsp;0 | 1 | 2 | 3 | 4 | 5 |</code><br><code>&nbsp;1 | - | - | - | - | - |</code><br><code>&nbsp;2 | - | * | * | - | - |</code><br><code>&nbsp;3 | * | - | - | * | - |</code><br><code>&nbsp;4 | - | - | - | - | * |</code><br><code>&nbsp;5 | * | - | * | - | - |</code></p>