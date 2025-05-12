<h2>Task 1 - Timing a Method</h2>
<h3>Part 1</h3>
TimerLog is created which used simple approach of duration calculation.
<h3>Part 2</h3>
Used AOP approach to determine the duration With this method we can selectively find out method execution time. <br/>

<h2>Task 2 - Find Arrays</h2>
The sub array is found by iterating sequentially through the bigger array. <br/>
We find the first element of the sub array in the bigger array and then check if the next elements are equal to the sub
array. <br/>
If at any time the elements are not equal we begin comparing from the first element of the smaller array again. <br/>
There are checks which help if the iteration makes sense. <br/>
If any of the checks fail we return no match represented by -1. <br/>

<h2>Task 3 - Review a Method</h2>
I have 3 comments for this code snippet <br/>
1] There is too much if block nesting. Since there is no logic in between the if statements, we can use a single if
statement with multiple conditions. <br/>
2] For String comparison, we should use equals method instead of == operator. <br/>
Also we should use constant first and then the variable. i.e. "Lee".equals(student.getTeacherName()) should be
preferred <br/>
This approach avoids NullPointerException. <br/>
3] The return is a boolean value. We can use combined boolean expression to return the value. <br/>

```aidl
boolean checkStudy(Student student){
    return student.isLoggedIn()  
    && "Lee".equals(student.getTeacherName()) 
    && student.isEnrolledInMaths() 
    && student.hasDisction();
}
```

<br/>

<h2>Task 4 - Trends</h2>
There are a few trends that I have noticed getting more focus in the past few years. <br/>
<h3>1] Containerization and Orchestration</h3>
Docker as a containerization tool is used a lot more. <br/>
It is not just restricted to deployment to prod or non prod environments. <br/>
It has now become a part of the development process. <br/>
I am using it extensively from past couple of years, so I am familiar with it. <br/>

<h3>2] Cloud Services</h3>
This one kind of complements the above trend.<br/>
With the rise of microservice architecture, containerization and orchestration, <br/>
it has only become difficult and expensive to host the services on-premise and manage the infrastructure. <br/>
Hence companies are now moving to cloud services. <br/>
I am using Google cloud currently and hence have done a certification on it. <br/>
Working with AWS or Azure would be similar and it shall not be difficult to learn. <br/>

<h3>3] Monitoring and Observability</h3>
With the explosion of microservices, it has become difficult to monitor the services. <br/>
It has also become difficult to find the root cause of the issue. <br/>
The solution is to add monitoring and observability to the services. <br/>
We are using OpenTelemetry, Micrometer and Dynatrace for the same. <br/>

<h3>4] AI</h3>
This one is more recent and is seeing a lot or revolution. <br/>
We are using commercial GitHub Copilot for code generation. <br/>
I am using AI to help with my daily tasks. <br/>
If I get an opportunity it will be exciting to incorporate AI in the product that I am delivering. <br/>

<h2>Task 5 - Describe Software that Delivers User Value</h2>
I recently worked on payment fraud control. <br/>
It analyses a payment in real time and determines if the payment is fraudulent or not. <br/>
Already noticed few customers were saved from getting scammed. <br/>
One of the critical aspect is the system is to have low latency and high throughput. <br/>
We did load testing and end-to-end testing to ensure the system is working as expected. <br/>

<h2>Task 6 - Your Values</h2>
Some of my core values are ability to analyse, identify solutions, learn and adapt. <br/>
I am able to convey and explaining the problem/solution to the team with my communication skills. <br/>
I am also able to think out of the box and come up with innovative approach to solve the problem. <br/>