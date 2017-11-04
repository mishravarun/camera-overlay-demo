# Camera Overlay README

This sample project explains how to use the custom camera overlay library in your assignment.

### 1. Open ```build.gradle(Project: *yourprojectname*)``` 
  (Note: This is your proect's gradle file, and not your app module's.
  
  To the ```allprojects{}``` TAG, add the following-
  ```
  maven {
            url 'https://dl.bintray.com/mishravarun/catcameraoverlay'
        }
  ```

  It should now look something like this-

  ```
  allprojects {
    repositories {
        google()
        jcenter()
        maven {
            url 'https://dl.bintray.com/mishravarun/catcameraoverlay'
        }
    }
  }
  ```

### 2. Now open ```build.gradle(Module: app)```

  Add the following dependency-
  ```compile 'com.varunmishra.catcameraoverlay:catcameraoverlay:1.0.3'```

  Also remember to remove any play-services dependencies you have in your projects (eg., maps). The camera overlay module already has the play-services dependency build into it. So you don't need to add it again. Sometimes it might cause duplication errors.


### 3. You are all set to use the module now. 
  Take a look at the demo app included in this repository to find out what permissions are required, and how to Configure and start the overlaying activity.
