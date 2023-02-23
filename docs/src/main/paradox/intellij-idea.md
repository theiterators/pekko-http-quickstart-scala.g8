IntelliJ IDEA
-------------

[IntelliJ IDEA](https://www.jetbrains.com/idea/) from JetBrains is one of the leading IDEs in the Java/Scala community, and it has excellent support for pekko HTTP. This section of the tutorial describes how to set up, test and run the sample project in IntelliJ.

## Setting up the project

To add the pekko HTTP example project to IntelliJ, follow these steps:

1. Open IntelliJ.
2. Select **Open** from the Welcome dialog or **File &gt; Open** from the Editor.
3. Browse to select the top-level directory of the sample project and click **OK**.

![Open Project](images/idea-open-project.png)

## Removing comments

The main source file contains comments with special directives used by the documentation. To get rid of these lines, you can use IntelliJ's awesome find and replace functionality. Follow these steps:

1. From the Project pane, open the `QuickstartServer` source file.
2. From the **Edit** menu, select **Find &gt; Replace**.
3. Enter (//#).* into the find box.
4. Check **Regex**.
5. Click **Replace**.

Voila the lines are gone!

## Running the application

In the **Project** pane, right click the `QuickstartApp` source file. Select **Run 'QuickstartApp'**. The output should look like the output in the shell:

![Running Project](images/idea-running-project.png)

## Tutorial done!

Congratulations! You can start building real-world applications that use pekko HTTP. Of course, we didn't have time to cover all pekko HTTP features in this short guide. See the @extref[documentation](pekko.http:scala/http/index.html) to learn more.
