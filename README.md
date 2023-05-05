# Sample project to test java rust integration with JNI.

Code is tested for following version
JAVA version = 18    #change mvn maven.compiler properties if you are using different version of java
Rust version = 1.68.0

### Step 1: build

```shell
mvn clean install
```
You can find jar generate in target folder. Also rust lib file generated in target/rust-maven-plugin/prime_number/release folder.

### Step 2: run jar
```shell
java -jar target/rust_jni-1.0-SNAPSHOT-jar-with-dependencies.jar 1000000
```

## Notes
- lib file gets copied in jar, so you need only one jar for deployement. 
- As in .cargo/config.toml file, different target path is mentioned, even if run cargo build manually, it will build in root target folder

## FUTURE TASKS
1) add tests
2) improve development experience. Figure out way to bypass building jar each time to run code
