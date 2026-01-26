package com.annotations.builtIn.customAnnotation;

import java.lang.reflect.Method;

//3. Retrieve using Reflection
public class CustomAnnotationDemo {
public static void main(String[] args) throws Exception {
   Method method = TaskManager.class.getMethod("processTask");
   
   if (method.isAnnotationPresent(TaskInfo.class)) {
       TaskInfo info = method.getAnnotation(TaskInfo.class);
       System.out.println("Assigned To: " + info.assignedTo());
       System.out.println("Priority: " + info.priority());
   }
}
}